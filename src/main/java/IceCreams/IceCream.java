package IceCreams;

import java.util.*;
//import java.math.*;

public abstract class IceCream {

    protected String name;
    protected String dough;
    protected String flavoring_agent;
    
    public String getName() {
        return name;
    }
    public void prepare() {
        System.out.println("Взбиваем " + name);
        System.out.println("Заливаем в форму.. ");
        System.out.println("Выкладываем вафли...");
    }
    public void freeze() {
        System.out.println("Замораживем мороженое 40 мин при -4*С");
    }
    public void cut() {
        System.out.println("Нарезаем мороженое на прямоугольные брикетики");
    }
    public void box() {
        System.out.println("Упопаковываем мороженое в фирменную упаковку");
    }
}