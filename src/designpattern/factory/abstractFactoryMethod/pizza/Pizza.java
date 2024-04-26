package designpattern.factory.abstractFactoryMethod.pizza;

public abstract class Pizza {
    String name;

    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    abstract void prepare();

    void bake() {
        System.out.println("350도에서 25분간 굽습니다");
    }
    void cut() {
        System.out.println("대각선으로 자릅니다");
    }
    void box() {
        System.out.println("피자가게 공식 박스에 포장합니다");
    }
    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
        if(dough != null) {
            result.append(dough);
            result.append("\n");
        }
        if(sauce != null) {
            result.append(sauce);
            result.append("\n");
        }
        if(cheese != null) {
            result.append(cheese);
            result.append("\n");
        }
        if(veggies != null) {
            for(int i=0; i<veggies.length; i++) {
                result.append(veggies[i]);
                if(i < veggies.length - 1) {
                    result.append(dough);
                }
            }
            result.append("\n");
        }
        if(clam != null) {
            result.append(clam);
            result.append("\n");
        }
        if(pepperoni != null) {
            result.append(pepperoni);
            result.append("\n");
        }

        return result.toString();
    }
}
