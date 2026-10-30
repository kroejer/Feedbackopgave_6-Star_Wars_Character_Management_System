
void main() {
    List<Character> characters = new ArrayList<>();
    characters.add(new Jedi("Master Yoda", 200));
    characters.add(new Sith("Darth Sidious", 55));
    characters.add(new Droid("Droideka", 1));
    characters.add(new CloneTrooper("Rex", 10));
    characters.add(new BountyHunter("Boba Fett", 35));


    for (Character character : characters) {
        System.out.println("-----------CHARACTER-----------");
        System.out.println("-------------------------------");
        character.action();
        if (character instanceof Jedi) {
            ((Jedi)character).meditate();
        }
        if (character instanceof ForceUser) {
            ((ForceUser)character).useForce();
        }
        if (character instanceof BountyHunter) {
            ((BountyHunter)character).hunt();
        }
        System.out.println("-------------------------------");
        System.out.println();
    }
}
