public class DecoyDuck extends Duck{
    private String apperance;

    public DecoyDuck (String apperance) {
        super("DecoyQuack", "Can't fly");
        this.apperance = apperance;
    }

    public void swim () {
        System.out.println(this.getClass().getSimpleName() + " can float.... kinda");
    }

    @Override
    public String preformFly() {
        System.out.println("This is a decoy, it can't fly");
        return null;
    }
}
