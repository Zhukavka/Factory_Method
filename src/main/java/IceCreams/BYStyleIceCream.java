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
public class BYStyleIceCream extends IceCream {
    
    //private static BYStyleIceCream uniqueInstance;

    public BYStyleIceCream() {
        name = "Белорусское мороженое 'Чудо-Буренка'";
        dough = "Тоненькие хрустящие вафли";
        flavoring_agent = "Ванильный аромат";
    }
    
    //public static BYStyleIceCream getInstance(){  
    //    if (uniqueInstance == null)
    //        uniqueInstance = new BYStyleIceCream();
     //   return uniqueInstance;
    //}
    
    @Override
    public void cut() {
        System.out.println("Нарезаем мороженое на квадратные брикетики");
    }

}