package designpattern.factory.abstractFactoryMethod.pizza;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new PermesanCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = { new Garlic(), new EggPlant(), new BlackOlives() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
