public class BountyHunter extends Character {

    public BountyHunter(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        super.showinfo();
        System.out.println("Action: " + name + " tracks his target");
    }

}
