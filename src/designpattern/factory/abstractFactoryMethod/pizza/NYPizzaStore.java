package designpattern.factory.abstractFactoryMethod.pizza;

public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("NY Style Cheese Pizza");
        } else if(item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("NY Style Clam Pizza");
        }
        return pizza;
    }
}
