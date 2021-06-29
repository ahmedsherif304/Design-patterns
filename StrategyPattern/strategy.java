interface Flyable {
    void fly();
}

class Fly implements Flyable {
    @Override
    public void fly() {
        System.out.println("i can fly");
    }
}

class CannotFly implements Flyable {
    @Override
    public void fly() {
        System.out.println("i cannot fly");
    }
}

class Duck {
    String name;
    Flyable flyable;

    public Duck(String name) {
        this.name = name;
    }

    void fly() {
        flyable.fly();
    }

}

class NormalDuck extends Duck {

    public NormalDuck(String name) {
        super(name);
        this.flyable = new Fly();
    }
}

class ToyDuck extends Duck {
    public ToyDuck(String name) {
        super(name);
        this.flyable = new CannotFly();
    }
}

class MainStrategy {
    public static void main(String[] args) {
        ToyDuck duck1 = new ToyDuck("pak pak");
        duck1.fly();

        NormalDuck duck2 = new NormalDuck("Samar");
        duck2.fly();

    }
}