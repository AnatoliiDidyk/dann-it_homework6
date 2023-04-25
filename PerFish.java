public class Fish extends Pet {
    public Fish (String nickname, PetSpecies petSpecies) {
    super(nickname, PetSpecies.petSpecies.Fish, age, trickLevel, habits);
}

    public Fish(String nickname, PetSpecies petSpecies, int age, int trickLevel, String[] habits) {
        super(nickname, PetSpecies.petSpecies.Fish, age, trickLevel, habits);
    }

}