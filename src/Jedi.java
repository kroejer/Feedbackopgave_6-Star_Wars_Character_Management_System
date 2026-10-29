public class Jedi extends Character {

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

    //Forsøg på at override goLive() metoden fra Character superklassen, men det giver fejl så derfor udkommenteret
//    @Override
//    public void goLive() {
//        System.out.println("Jedi going live");
//    }
}
