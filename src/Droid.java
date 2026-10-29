public class Droid extends Character {

    public Droid(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        super.showinfo();
        System.out.println("Action: " + name + " shoots its blaster");
    }
}
