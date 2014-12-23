/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Runner;

import Factories.RUSIceCreamFactory;
import Factories.BYIceCreamFactory;
import IceCreams.IceCream;
import Factories.IceCreamFactory;

/**
 *
 * @author Дашуля
 */
public class IceCreamTestDrive {

    public static void main(String[] args) {
        OrderNumber rusnumber = new OrderNumber();
        OrderNumber bynumber = new OrderNumber();
        System.out.println("Поступил заказ на "+rusnumber.rand+" штук в России");
        System.out.println("Поступил заказ на "+bynumber.rand+" штук в Беларуси");
        IceCreamFactory rusStore = RUSIceCreamFactory.getInstance(); 
        IceCreamFactory byStore = BYIceCreamFactory.getInstance();
        System.out.println("\n");
        IceCream icecream = rusStore.orderIceCream();
        System.out.println("\n");
        for(int i = 1; i < rusnumber.getNumber(); i++){
            icecream = rusStore.orderIceCream();
            System.out.println("\n");
        }
        System.out.println("Произвели " + rusnumber.rand + " наименований " + icecream.getName()+"\n");
        
        icecream = byStore.orderIceCream();
        System.out.println("\n");
        for(int i = 1; i < bynumber.getNumber(); i++){
            icecream = byStore.orderIceCream();
            System.out.println("\n");
        }
        System.out.println("Произвели "+bynumber.rand + " наименований " + icecream.getName()+"\n");
        
    }

}