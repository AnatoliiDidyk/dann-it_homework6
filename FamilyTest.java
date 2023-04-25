import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {

    private Family family;
    private Human human;
    private Human father;
    private Human mother;
    private Human[]children;
    private Pet pet;
    private Human children1;
    private Human children2;

    @BeforeEach
    public void setFamily(){
        mother = new Human ("Natasha","Didyk",2000);
        father = new Human("Anton","Didyk", 1999);
        children = new Human[2];
        children[1] = new Human("Nick", "Didyk",2020);
        children[2] = new Human("Olya", "Didyk",2021);
        pet = new Dog("Sharik", PetSpecies.petSpecies.Dog);
        family = new Family(mother, father,children,pet);
        children1 = new Human("Misha", "Didyk", 2019);
        children2 = new Human("Mariya", "Didyk", 2018);

    }
    @Test
    void testAddChild() {
        family.addChild(children1);
        assertEquals(1, family.getChildren().length);
        assertArrayEquals(new Human[]{children[1], children[2], children1}, family.getChildren());
    }

    @Test
    void testDeleteChild() {
        family.deleteChild(children[0]));
        assertEquals(1,family.getChildren().length);
        assertArrayEquals(new Human[]{children[1], family.getChildren());
    }
    }
    @Test
    void testDeleteChildIndex() {
        family.deleteChild(1);
        assertArrayEquals(1,family.getChildren().length);
        assertArrayEquals(new Human[]{children[0],family.getChildren()});
    }
    @Test
    void testCountFamily() {
        assertEquals(5, family.countFamily());
    }
}