public class Sith extends Character implements ForceUser {

    public Sith(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        super.showinfo();
        System.out.println("Action: " + name + " casts force lightning!");
    }

    @Override
    public void useForce() {
        System.out.println("Extra action: " + name + " uses the Force to move objects");
    }
}
