/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_dbms;

import java.util.ArrayList;

/**
 *
 * @author crazi
 */
public class Pizza {
    int[] ingredients,sauce;
    boolean isCheeseBurst;
    int quantity,crust; 
    Pizza(){
        ingredients=new int[6];
        sauce=new int[5];
        crust=1;
        isCheeseBurst=false;
        quantity=1;
    }
    
    int getPrice(){
        int p=75*crust;
        p+=getCount(ingredients)*25;
        p+=getCount(sauce)*15;
        p+=isCheeseBurst?35:0;
        p=p*quantity;
        
        return p;
    }
    private int getCount(int arr[]){
    int t=0;
    for(int i=0;i<arr.length;i++){
        t+=arr[i];
    }
    return t;
    }
    
    String getIng(){
        String[] ingStrings=new String[]{"Corn","Chicken","Onion","Black Olives","Paneer","Capsicum"};
        ArrayList<String> tStrings=new ArrayList();
        for(int i=0;i<ingredients.length;i++){
            if(ingredients[i]==1)
                tStrings.add(ingStrings[i]);
        }
    return String.join(", ", tStrings);
    }
    String getSauce(){
        String[] sauceStrings=new String[]{"BBQ","Mayo","Alfredo","Red Peppery","Mint Mayo"};
        ArrayList<String> tStrings=new ArrayList();
        for(int i=0;i<sauce.length;i++){
            if(sauce[i]==1)
                tStrings.add(sauceStrings[i]);
        }
        
    return String.join(", ", tStrings);}
    String getCrustSize(){
    return crust==1?"Small":crust==2?"Medium":crust==3?"Large":"Extra Large"; 
    } 

    public boolean equalsPizza(Pizza obj) {
      return obj.crust==crust && obj.isCheeseBurst==isCheeseBurst && 
              obj.getIng().equals(getIng()) && obj.getSauce().equals(getSauce());
    }
    
}
