/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_dbms;

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
    return "";
    }
    String getSauce(){
    return "";
    }
}
