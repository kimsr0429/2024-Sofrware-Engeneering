package designpattern.factory.pizzaf;

import designpattern.factory.pizzas.CheesePizza;
import designpattern.factory.pizzas.ClamPizza;
import designpattern.factory.pizzas.PepperoniPizza;
import designpattern.factory.pizzas.VeggiePizza;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if(item.equals("cheese")) return new NYStyleCheesePizza();
        else if(item.equals("pepperoni")) return new NYStylePepperoniPizza();
        else if(item.equals("clam")) return new NYStyleClamPizza();
        else if(item.equals("veggie")) return new NYStyleCheesePizza();
        else return null;
    }
}
