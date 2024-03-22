package solid.ocp;

// abstract class: 추상 클래스
public abstract class Pokemon {
    private String name;
    protected int level;
    protected int hp;

    public Pokemon(String name, int level, int hp){
        this.name = name;
        this.level = level;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    // abstract method: 추상 메서드
    public abstract void attack();
    public abstract void evolve();
}
