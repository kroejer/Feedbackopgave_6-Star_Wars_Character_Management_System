public class Sith extends Character {

    public Sith(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        super.showinfo();
        System.out.println("Action: " + name + " casts force lightning!");
    }
}
