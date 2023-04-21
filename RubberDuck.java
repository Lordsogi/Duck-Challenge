public class RubberDuck extends Duck{
    private String apperance;
    public RubberDuck (String apperance) {
        super("Squeak", "Not a chance");
        this.apperance = apperance;
    }

    public String preformFly() {
        System.out.println("This is a rubber duck, it can't fly");
        return null;
    }

    public void swim () {
        System.out.println(this.getClass().getSimpleName() + " This can float for days");
    }

    public String preformQuack() {
        System.out.println("SQUEAKKKKK");
        return null;
    }
}
