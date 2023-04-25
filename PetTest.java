import org.junit.Test;
import static org.junit.Assert.assertEquals;

class PetTest {
    @Test
    void PetTest1() {
        Pet pet = new Pet("Sharik", PetSpecies.petSpecies.Dog, 10);
        pet.setNickname("dkfjf");
        assertEquals("dkfjf", pet.getNickname());
    }

    @Test
    public void PetTestConstructor() {
        Pet pet = new Pet("dkfjf", PetSpecies.petSpecies.Cat, 66, 55, new String[]{"eat,poop"});
        assertEquals("dkfjf", pet.getNickname());
        assertEquals(PetSpecies.petSpecies.Cat, pet.getPetSpecies());
        assertEquals(66, pet.getAge());
        assertEquals(55, pet.getTrickLevel());
        assertEquals("eat,poop", pet.getHabits());

    }

}