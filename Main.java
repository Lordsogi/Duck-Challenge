public class Main {
    public static void main(String[] args) {

        Duck jeff = new Duck("QUACK", "FLY");
        jeff.swim();
        jeff.display();
        System.out.println(jeff.preformFly());

        System.out.println();

        DecoyDuck notADuck = new DecoyDuck("Definately not made of wood");
        notADuck.swim();
        notADuck.display();
        System.out.println(notADuck.preformFly());

        System.out.println();

        MallardDuck Henery = new MallardDuck("Whatever a Mallrd looks like");
        Henery.swim();
        Henery.display();
        System.out.println(Henery.preformFly());

        System.out.println();

        RubberDuck giggles = new RubberDuck("As yellow as the sun");
        giggles.swim();
        giggles.display();
        System.out.println(giggles.preformFly());
    }
}
