/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import IceCreams.BYStyleIceCream;
import IceCreams.IceCream;


/**
 *
 * @author Дашуля
 */
public class BYIceCreamFactory extends IceCreamFactory{
    private static BYIceCreamFactory uniqueInstance;
    private int number;
    
     public static BYIceCreamFactory getInstance(){  
        if (uniqueInstance == null)
            uniqueInstance = new BYIceCreamFactory();
        return uniqueInstance;
    }
    
    @Override
    public IceCream createIceCream() {
        return new BYStyleIceCream();
    }
    
    public void setNumber(int num){
        this.number = num;
    }
}