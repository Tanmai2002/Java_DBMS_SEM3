/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package java_dbms;
import java.sql.*;

/**
 *
 * @author crazi
 */
public class AppInterface extends javax.swing.JFrame {
    static Pizza myPizza;
    /**
     * Creates new form AppInterface
     */
    public AppInterface() {
        initComponents();
        myPizza=new Pizza();
        size_small.setSelected(true);
                updatePrice();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        top_corn = new javax.swing.JCheckBox();
        top_chicken = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        top_onion = new javax.swing.JCheckBox();
        top_black_olives = new javax.swing.JCheckBox();
        top_paneer = new javax.swing.JCheckBox();
        top_capsicum = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        sauce_bbq = new javax.swing.JCheckBox();
        sauce_mayo = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        sauce_alfredo = new javax.swing.JCheckBox();
        sauce_red = new javax.swing.JCheckBox();
        sauce_mint_mayo = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        size_small = new javax.swing.JCheckBox();
        size_med = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        size_large = new javax.swing.JCheckBox();
        size_xl = new javax.swing.JCheckBox();
        is_cheese_burst = new javax.swing.JCheckBox();
        quantity = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        place_order_button = new javax.swing.JButton();
        clear_all_button = new javax.swing.JButton();
        total = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        top_corn.setBackground(new java.awt.Color(51, 51, 51));
        top_corn.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        top_corn.setForeground(new java.awt.Color(255, 255, 255));
        top_corn.setText("Corn");
        top_corn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                top_cornActionPerformed(evt);
            }
        });
        top_corn.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                top_cornPropertyChange(evt);
            }
        });

        top_chicken.setBackground(new java.awt.Color(51, 51, 51));
        top_chicken.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        top_chicken.setForeground(new java.awt.Color(255, 255, 255));
        top_chicken.setText("Chicken");
        top_chicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                top_chickenActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TOPPINGS");

        top_onion.setBackground(new java.awt.Color(51, 51, 51));
        top_onion.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        top_onion.setForeground(new java.awt.Color(255, 255, 255));
        top_onion.setText("Onion");
        top_onion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                top_onionActionPerformed(evt);
            }
        });

        top_black_olives.setBackground(new java.awt.Color(51, 51, 51));
        top_black_olives.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        top_black_olives.setForeground(new java.awt.Color(255, 255, 255));
        top_black_olives.setText("Black Olives");
        top_black_olives.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                top_black_olivesActionPerformed(evt);
            }
        });

        top_paneer.setBackground(new java.awt.Color(51, 51, 51));
        top_paneer.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        top_paneer.setForeground(new java.awt.Color(255, 255, 255));
        top_paneer.setText("Paneer");
        top_paneer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                top_paneerActionPerformed(evt);
            }
        });

        top_capsicum.setBackground(new java.awt.Color(51, 51, 51));
        top_capsicum.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        top_capsicum.setForeground(new java.awt.Color(255, 255, 255));
        top_capsicum.setText("Capsicum");
        top_capsicum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                top_capsicumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(top_corn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(top_chicken, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(top_onion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(top_black_olives, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(top_paneer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(top_capsicum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(top_corn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(top_chicken, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(top_onion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(top_black_olives, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(top_paneer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(top_capsicum, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 51, 0));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("JOEY'S PIZZA CORNER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(246, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(227, 227, 227))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        sauce_bbq.setBackground(new java.awt.Color(51, 51, 51));
        sauce_bbq.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        sauce_bbq.setForeground(new java.awt.Color(255, 255, 255));
        sauce_bbq.setText("BBQ Sauce");
        sauce_bbq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sauce_bbqActionPerformed(evt);
            }
        });

        sauce_mayo.setBackground(new java.awt.Color(51, 51, 51));
        sauce_mayo.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        sauce_mayo.setForeground(new java.awt.Color(255, 255, 255));
        sauce_mayo.setText("Mayo");
        sauce_mayo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sauce_mayoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PIZZA SAUCE");

        sauce_alfredo.setBackground(new java.awt.Color(51, 51, 51));
        sauce_alfredo.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        sauce_alfredo.setForeground(new java.awt.Color(255, 255, 255));
        sauce_alfredo.setText("Alfredo");
        sauce_alfredo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sauce_alfredoActionPerformed(evt);
            }
        });

        sauce_red.setBackground(new java.awt.Color(51, 51, 51));
        sauce_red.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        sauce_red.setForeground(new java.awt.Color(255, 255, 255));
        sauce_red.setText("Peppery Red Sauce");
        sauce_red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sauce_redActionPerformed(evt);
            }
        });

        sauce_mint_mayo.setBackground(new java.awt.Color(51, 51, 51));
        sauce_mint_mayo.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        sauce_mint_mayo.setForeground(new java.awt.Color(255, 255, 255));
        sauce_mint_mayo.setText("Mint Mayo");
        sauce_mint_mayo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sauce_mint_mayoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sauce_red, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sauce_bbq, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                .addComponent(sauce_mayo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sauce_alfredo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sauce_mint_mayo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sauce_bbq, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sauce_mayo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sauce_alfredo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sauce_red, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sauce_mint_mayo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        size_small.setBackground(new java.awt.Color(51, 51, 51));
        size_small.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        size_small.setForeground(new java.awt.Color(255, 255, 255));
        size_small.setText("Small");
        size_small.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size_smallActionPerformed(evt);
            }
        });

        size_med.setBackground(new java.awt.Color(51, 51, 51));
        size_med.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        size_med.setForeground(new java.awt.Color(255, 255, 255));
        size_med.setText("Medium");
        size_med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size_medActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PIZZA CRUST");

        size_large.setBackground(new java.awt.Color(51, 51, 51));
        size_large.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        size_large.setForeground(new java.awt.Color(255, 255, 255));
        size_large.setText("Large");
        size_large.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size_largeActionPerformed(evt);
            }
        });

        size_xl.setBackground(new java.awt.Color(51, 51, 51));
        size_xl.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        size_xl.setForeground(new java.awt.Color(255, 255, 255));
        size_xl.setText("Extra Large");
        size_xl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                size_xlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(size_small, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(size_med, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(size_large, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(size_xl, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(size_small, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(size_med, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(size_large, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(size_xl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        is_cheese_burst.setBackground(new java.awt.Color(204, 204, 204));
        is_cheese_burst.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        is_cheese_burst.setForeground(new java.awt.Color(51, 51, 51));
        is_cheese_burst.setText(" Include Cheeseburst Crust ");
        is_cheese_burst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                is_cheese_burstActionPerformed(evt);
            }
        });

        quantity.setValue(1);
        quantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quantityStateChanged(evt);
            }
        });
        quantity.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                quantityInputMethodTextChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("QUANTITY:");

        place_order_button.setBackground(new java.awt.Color(0, 204, 51));
        place_order_button.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        place_order_button.setForeground(new java.awt.Color(51, 51, 51));
        place_order_button.setText("PLACE ORDER");

        clear_all_button.setBackground(new java.awt.Color(255, 51, 51));
        clear_all_button.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        clear_all_button.setForeground(new java.awt.Color(255, 255, 255));
        clear_all_button.setText("CLEAR ALL");

        total.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        total.setForeground(new java.awt.Color(51, 51, 51));
        total.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        total.setText("TOTAL:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(is_cheese_burst, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(place_order_button)
                .addGap(18, 18, 18)
                .addComponent(clear_all_button, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(is_cheese_burst, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(place_order_button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear_all_button, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sauce_bbqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sauce_bbqActionPerformed
        // TODO add your handling code here:
        myPizza.sauce[0]=((javax.swing.JCheckBox)evt.getSource()).isSelected()?1:0;
        updatePrice();
    }//GEN-LAST:event_sauce_bbqActionPerformed

    private void sauce_mayoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sauce_mayoActionPerformed
        // TODO add your handling code here:
        myPizza.sauce[1]=((javax.swing.JCheckBox)evt.getSource()).isSelected()?1:0;
        updatePrice();
    }//GEN-LAST:event_sauce_mayoActionPerformed

    private void sauce_alfredoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sauce_alfredoActionPerformed
        // TODO add your handling code here:
        myPizza.sauce[2]=((javax.swing.JCheckBox)evt.getSource()).isSelected()?1:0;
        updatePrice();
    }//GEN-LAST:event_sauce_alfredoActionPerformed

    private void sauce_redActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sauce_redActionPerformed
        // TODO add your handling code here:
        myPizza.sauce[3]=((javax.swing.JCheckBox)evt.getSource()).isSelected()?1:0;
        updatePrice();
    }//GEN-LAST:event_sauce_redActionPerformed

    private void sauce_mint_mayoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sauce_mint_mayoActionPerformed
        // TODO add your handling code here:
        myPizza.sauce[4]=((javax.swing.JCheckBox)evt.getSource()).isSelected()?1:0;
        updatePrice();
    }//GEN-LAST:event_sauce_mint_mayoActionPerformed

    private void size_smallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_size_smallActionPerformed
        // TODO add your handling code here:
        myPizza.crust=1;
        size_med.setSelected(false);
        size_large.setSelected(false);
        size_xl.setSelected(false);
        updatePrice();
    }//GEN-LAST:event_size_smallActionPerformed

    private void size_medActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_size_medActionPerformed
        // TODO add your handling code here:
        myPizza.crust=2;
        size_small.setSelected(false);
        size_large.setSelected(false);
        size_xl.setSelected(false);
        updatePrice();
    }//GEN-LAST:event_size_medActionPerformed

    private void size_largeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_size_largeActionPerformed
        // TODO add your handling code here:
        myPizza.crust=3;
        size_med.setSelected(false);
        size_small.setSelected(false);
        size_xl.setSelected(false);
        updatePrice();
    }//GEN-LAST:event_size_largeActionPerformed

    private void size_xlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_size_xlActionPerformed
        // TODO add your handling code here:
        myPizza.crust=4;
        size_med.setSelected(false);
        size_large.setSelected(false);
        size_small.setSelected(false);
        updatePrice();
    }//GEN-LAST:event_size_xlActionPerformed

    private void top_capsicumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_top_capsicumActionPerformed
        // TODO add your handling code here:
        myPizza.ingredients[5]=((javax.swing.JCheckBox)evt.getSource()).isSelected()?1:0;
        updatePrice();
    }//GEN-LAST:event_top_capsicumActionPerformed

    private void top_paneerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_top_paneerActionPerformed
        // TODO add your handling code here:
        myPizza.ingredients[4]=((javax.swing.JCheckBox)evt.getSource()).isSelected()?1:0;
        updatePrice();
    }//GEN-LAST:event_top_paneerActionPerformed

    private void top_black_olivesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_top_black_olivesActionPerformed
        // TODO add your handling code here:
        myPizza.ingredients[3]=((javax.swing.JCheckBox)evt.getSource()).isSelected()?1:0;
        updatePrice();
    }//GEN-LAST:event_top_black_olivesActionPerformed

    private void top_onionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_top_onionActionPerformed
        // TODO add your handling code here:
        myPizza.ingredients[2]=((javax.swing.JCheckBox)evt.getSource()).isSelected()?1:0;
        updatePrice();
    }//GEN-LAST:event_top_onionActionPerformed

    private void top_chickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_top_chickenActionPerformed
        // TODO add your handling code here:
        myPizza.ingredients[1]=((javax.swing.JCheckBox)evt.getSource()).isSelected()?1:0;
        updatePrice();
    }//GEN-LAST:event_top_chickenActionPerformed

    private void top_cornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_top_cornActionPerformed
        // TODO add your handling code here:
        myPizza.ingredients[0]=((javax.swing.JCheckBox)evt.getSource()).isSelected()?1:0;
        updatePrice();
    }//GEN-LAST:event_top_cornActionPerformed

    private void top_cornPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_top_cornPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_top_cornPropertyChange

    private void is_cheese_burstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_is_cheese_burstActionPerformed
        // TODO add your handling code here:
        myPizza.isCheeseBurst=((javax.swing.JCheckBox)evt.getSource()).isSelected();
        updatePrice();
    }//GEN-LAST:event_is_cheese_burstActionPerformed

    private void quantityInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_quantityInputMethodTextChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_quantityInputMethodTextChanged

    private void quantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quantityStateChanged
        // TODO add your handling code here:
        String val=((javax.swing.JSpinner)evt.getSource()).getValue().toString();
        int q=Integer.parseInt(val);
        if(q<=0){
            quantity.setValue(1);
            return;
        }
        myPizza.quantity=q;
        updatePrice();
    }//GEN-LAST:event_quantityStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/temp","root","tanmai");  
            //here sonoo is database name, root is username and password  
            Statement stmt=con.createStatement();  
//            ResultSet rs=stmt.executeQuery("insert emp values(5,'TanmaiK',25);");  
             boolean rs=stmt.execute("insert into cake values(0,'corn3','mayo3','larger',0,400);");  
//            while(rs.next())  
//            System.out.println(rs.getInt(1));  
            if(rs)
                System.out.println(rs);
            con.close();  
            }catch(Exception e){ System.out.println(e);}  
  
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        //</editor-fold>
           
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear_all_button;
    private javax.swing.JCheckBox is_cheese_burst;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton place_order_button;
    private javax.swing.JSpinner quantity;
    private javax.swing.JCheckBox sauce_alfredo;
    private javax.swing.JCheckBox sauce_bbq;
    private javax.swing.JCheckBox sauce_mayo;
    private javax.swing.JCheckBox sauce_mint_mayo;
    private javax.swing.JCheckBox sauce_red;
    private javax.swing.JCheckBox size_large;
    private javax.swing.JCheckBox size_med;
    private javax.swing.JCheckBox size_small;
    private javax.swing.JCheckBox size_xl;
    private javax.swing.JCheckBox top_black_olives;
    private javax.swing.JCheckBox top_capsicum;
    private javax.swing.JCheckBox top_chicken;
    private javax.swing.JCheckBox top_corn;
    private javax.swing.JCheckBox top_onion;
    private javax.swing.JCheckBox top_paneer;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables

    private void updatePrice() {
    total.setText("Total : Rs."+ myPizza.getPrice());
    }
}
