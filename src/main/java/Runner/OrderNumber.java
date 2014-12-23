/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Runner;

/**
 *
 * @author Дашуля
 */
public class OrderNumber {
    //Random rand = new Random();
    //rand.nextInt(20);
    int rand = (int) (Math.random()*5 + 1); //целое число от 1 до 5
    
    public int getNumber(){
        return rand;
    }
}

