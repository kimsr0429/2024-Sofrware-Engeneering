package designpattern.factory.simpleFactory;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if(type.equals("cheese")) pizza = new CheesePizza();
        else if(type.equals("pepperoni")) pizza = new PepperoniPizza();
        else if(type.equals("calm")) pizza = new ClamPizza();
        else if(type.equals("veggie")) pizza = new VeggiePizza();

        return pizza;
    }
}
