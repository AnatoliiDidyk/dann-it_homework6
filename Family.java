import java.util.Arrays;
import java.util.Objects;

public class Family {

    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;
    Family family;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Arrays.equals(children, family.children) && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public void setMother(Human mother){
        this.mother = mother;
    }
    public Human getMother(){
        return mother;
    }
    public void setFather(Human father){
        this.father = father;
    }
    public Human getFather(){
        return father;
    }
    public void setChildren(Human[] children){
        this.children = children;
    }
    public Human[] getChildren() {
        return children;
    }
    public void setPet(Pet pet){
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }
    public String toString(){
        return mother.toString()+father.toString()+children.toString()+pet.toString();
    }
    public Family(Human mother, Human father, Human[] children, Pet pet){
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }
    //    public void setPetNickname(String nickname){
//        pet.setNickname(nickname);
//    }
    public String getPetNickname(){
        return pet.getNickname();
    }
    //    public void setPetSpecies(String species){
//        pet.setNickname(species);
//    }
    public PetSpecies getPetSpecies(){
        return pet.getPetSpecies();
    }
    public int getPetAge(){
        return pet.getAge();
    }
    public String getPetTrickennes() {
        return pet.Trickeness();
    }
    public void addChild(Human human){
        Human[] newChildren = new Human[children.length +1];
        for(int i=0; i< children.length; i++){
            newChildren[i] = children[i];
        }
        newChildren[children.length] = human;
        children = newChildren;
        human.setFamily(family);
    }
    public void deleteChild(int childIndex){
        Human[] newChildren = new Human[children.length - 1];
        for (int i = 0, j = 0; i < children.length; i++) {
            if (i != childIndex) {
                newChildren[j++] = children[i];
            }
        }
        children = newChildren;
    }
    public int countFamily(){
        int familyMembers = 2;
        if(children != null){
            familyMembers+= children.length;
        }
        if(pet !=null){
            familyMembers++;
        }
        return familyMembers;
    }
    protected void finalize() throws Throwable {
        System.out.println("Information about"+ getMother()+" "+getFather()+" "+ getPet().toString()+" "+ getChildren());
        super.finalize();}
}


