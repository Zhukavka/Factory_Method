/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import IceCreams.IceCream;
import IceCreams.RUSStyleIceCream;


/**
 *
 * @author Дашуля
 */
public class RUSIceCreamFactory extends IceCreamFactory{
    private static RUSIceCreamFactory uniqueInstance;
    
     public static RUSIceCreamFactory getInstance(){  
        if (uniqueInstance == null)
            uniqueInstance = new RUSIceCreamFactory();
        return uniqueInstance;
    }
    
    @Override
    public IceCream createIceCream() {
        return new RUSStyleIceCream();
    }
}