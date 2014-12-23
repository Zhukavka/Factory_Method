/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IceCreams;


/**
 *
 * @author Дашуля
 */
public class RUSStyleIceCream extends IceCream {
    //private static RUSStyleIceCream uniqueInstance = new RUSStyleIceCream();

    public RUSStyleIceCream() {
        name = "Российское мороженое 'Белорусские узоры'";
        dough = "Толстые воздушные вафли";
        flavoring_agent = "Аромат Крем-брюле";

    }
     @Override
     public void freeze() {
        System.out.println("Замораживем мороженое 20 мин при -7*С");
    }

}