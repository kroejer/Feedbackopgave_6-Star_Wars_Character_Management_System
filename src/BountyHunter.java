public class BountyHunter extends Character {

    public BountyHunter(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        super.showinfo();
        System.out.println("Action: " + name + " starts tracking his target");
    }

    public void hunt() {
        System.out.println("Extra action: " + name + " is hunting his target");
    }
}
