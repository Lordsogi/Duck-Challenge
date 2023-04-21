public class Duck {

    private String quack;
    private String fly;
    public Duck (String quack, String fly) {
        this.quack = quack;
        this.fly = fly;
    }
    public void swim () {
        System.out.println(this.getClass().getSimpleName() + " is swimming");
    }

    public void display () {
        System.out.println(this.getClass().getSimpleName());
    }

    public String preformQuack () {
        return this.quack;
    }

    public String preformFly () {
        return this.fly;
    }

    public void setQuack(String quack) {
        this.quack = quack;
    }

    public void setFly(String fly) {
        this.fly = fly;
    }
}