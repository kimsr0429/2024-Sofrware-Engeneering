package designpattern.factory.factoryMethod;

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
