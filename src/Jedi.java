public class Jedi extends Character implements ForceUser {

    public Jedi(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        super.showinfo();
        System.out.println("Action: " + name + " swings his lightsaber");
    }

    public void meditate() {
        System.out.println(name + " is meditating");
    }

    @Override
    public void useForce() {
        System.out.println("Extra action: " + name + " uses the Force to move objects");
    }
}
