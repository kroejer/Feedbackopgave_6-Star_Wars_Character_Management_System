
void main() {
    List<Character> characters = new ArrayList<>();
    characters.add(new Jedi("Master Yoda", 200));
    characters.add(new Sith("Darth Sidious", 55));
    characters.add(new Droid("Droideka", 1));
    characters.add(new CloneTrooper("Rex", 10));

    for (Character character : characters) {
        character.action();
        if (character instanceof Jedi) {
            ((Jedi)character).meditate();
        }
    }


}
