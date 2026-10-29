public class Character {
    protected String name;
    int age;

    public Character(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void action() {
        System.out.println("Action: Character is doing something...");
    }

    public void showinfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    final void goLive() {
        System.out.println("Going live");
    }
}
