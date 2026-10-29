public class CloneTrooper extends Character {

    public CloneTrooper(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        super.showinfo();
        System.out.println("Action: " + name + " takes aim and fires his blaster");
    }
}
