CREATE SCHEMA `joeys_pizza`;
use joeys_pizza;



## DDL

# ORDERS

CREATE TABLE orders(
	order_id INT AUTO_INCREMENT,
    order_total_price DOUBLE,
    cust_number varchar(10),
    PRIMARY KEY(order_id)
);


# CRUST

CREATE TABLE crusts(
	crust_id INT,
    crust_name varchar(50),
    crust_price DOUBLE,
	PRIMARY KEY (crust_id)
);

# PIZZA

CREATE TABLE pizzas(
	order_id INT,
	pizza_id INT AUTO_INCREMENT,
    pizza_price DOUBLE,
    cheeseburst BOOL,
    crust_id INT,
    quantity INT,
    PRIMARY KEY(pizza_id),
    CONSTRAINT FK_order_id_pizzas FOREIGN KEY (order_id)
    REFERENCES orders(order_id)
);


# SAUCES AND RELATIONSHIP

CREATE TABLE sauces(
	sauce_id INT,
    sauce_name varchar(50),
    sauce_price DOUBLE,
	PRIMARY KEY (sauce_id)
);

CREATE TABLE pizza_sauces(
	pizza_id INT,
    sauce_id INT,
    CONSTRAINT FK_pizza_id_sauces FOREIGN KEY (pizza_id)
    REFERENCES pizzas(pizza_id),
    CONSTRAINT FK_sauce_id FOREIGN KEY (sauce_id)
    REFERENCES sauces(sauce_id)
);

# TOPPINGS AND RELATIONSHIP

CREATE TABLE toppings(
	 topping_id INT,
     topping_name varchar(50),
     topping_price DOUBLE,
     PRIMARY KEY (topping_id)
);

CREATE TABLE pizza_toppings(
	pizza_id INT,
    topping_id INT,
    CONSTRAINT FK_pizza_id_toppings FOREIGN KEY (pizza_id)
    REFERENCES pizzas(pizza_id),
    CONSTRAINT FK_topping_id FOREIGN KEY (topping_id)
    REFERENCES toppings(topping_id)
);

# STATIC DML

INSERT INTO sauces VALUES(1,'BBQ Sauce',15);
INSERT INTO sauces VALUES(2,'Mayo',15);
INSERT INTO sauces VALUES(3,'Alfredo',15);
INSERT INTO sauces VALUES(4,'Peppery Red Sauce',15);
INSERT INTO sauces VALUES(5,'Mint Mayo',15);

INSERT INTO toppings VALUES(1,'Corn',25);
INSERT INTO toppings VALUES(2,'Chicken',25);
INSERT INTO toppings VALUES(3,'Onion',25);
INSERT INTO toppings VALUES(4,'Black Olives',25);
INSERT INTO toppings VALUES(5,'Paneer',25);
INSERT INTO toppings VALUES(6,'Capsicum',25);

INSERT INTO crusts VALUES(1,'Small',1);
INSERT INTO crusts VALUES(2,'Medium',2);
INSERT INTO crusts VALUES(3,'Large',3);
INSERT INTO crusts VALUES(4,'Extra Large',4);

## STORED PROCEDURES

DELIMITER //
CREATE PROCEDURE getCurrentOrder()
BEGIN
	DECLARE curr_order INT DEFAULT -1;
    SELECT MAX(order_id) INTO curr_order FROM orders;
    SELECT curr_order;
END //
DELIMITER ;

DELIMITER //
CREATE PROCEDURE getCurrentPizza()
BEGIN
	DECLARE curr_pizza INT DEFAULT -1;
    SELECT MAX(pizza_id) INTO curr_pizza FROM pizzas;
    SELECT curr_pizza;
END //
DELIMITER ;

DELIMITER //
CREATE PROCEDURE getAllPizzaIds(IN idOrder INT)
BEGIN
    SELECT pizza_id FROM pizzas WHERE order_id = idOrder;
END //
DELIMITER ;

DELIMITER //
CREATE PROCEDURE fillPizzaToppings(IN pizza_id INT,IN topping_id INT)
BEGIN
    INSERT INTO pizza_toppings VALUES (pizza_id,topping_id);
END //
DELIMITER ;

DELIMITER //
CREATE PROCEDURE fillPizzaSauces(IN pizza_id INT,IN sauce_id INT)
BEGIN
	INSERT INTO pizza_sauces VALUES (pizza_id,sauce_id);
END //
DELIMITER ;

DELIMITER //
CREATE PROCEDURE fillPizzaPrice(IN idPizza INT)
BEGIN
	DECLARE t_price DOUBLE DEFAULT 0;
    DECLARE c_price DOUBLE DEFAULT 0;
    DECLARE s_price DOUBLE DEFAULT 0;
    DECLARE tot_price DOUBLE DEFAULT 0;
    DECLARE q INT DEFAULT 1;
    DECLARE cBurst DOUBLE DEFAULT 0;
    
    SELECT IFNULL(SUM(topping_price),0) INTO t_price FROM (
    SELECT topping_price FROM toppings WHERE topping_id IN (
		SELECT topping_id FROM pizza_toppings WHERE pizza_id = idPizza
        ) 
	)sub1 ;
    
    SELECT IFNULL(SUM(sauce_price),0) INTO s_price FROM (
    SELECT sauce_price FROM sauces WHERE sauce_id IN (
		SELECT sauce_id FROM pizza_sauces WHERE pizza_id = idPizza
        ) 
	)sub2 ;
    
    SELECT crust_price INTO c_price FROM crusts WHERE crust_id = (
		SELECT crust_id FROM pizzas WHERE pizza_id = idPizza );
	
    SELECT quantity INTO q FROM pizzas WHERE pizza_id = idPizza;
    
    IF (SELECT cheeseburst FROM pizzas WHERE pizza_id = idPizza) = 1  THEN
        SET cBurst = 35; # price of cheese burst
    END IF;
    
    SET tot_price = (t_price + s_price + c_price*75 + cBurst)*q;
    UPDATE pizzas
    SET pizza_price = tot_price
	WHERE pizza_id = idPizza;
END //
DELIMITER //

DELIMITER //
CREATE PROCEDURE fillTotalPrice(IN idOrder INT,IN idPizza INT)
BEGIN
	DECLARE add_price DOUBLE DEFAULT 0;
    DECLARE old_price DOUBLE DEFAULT 0;
    DECLARE new_price DOUBLE DEFAULT 0;
    
    SELECT order_total_price INTO old_price FROM orders WHERE order_id = idOrder;
    
	SELECT pizza_price INTO add_price FROM pizzas WHERE pizza_id = idPizza;
    
    SET new_price = add_price + old_price;
    
	UPDATE orders
    SET order_total_price = new_price
	WHERE order_id = idOrder;
    
END //
DELIMITER ;
