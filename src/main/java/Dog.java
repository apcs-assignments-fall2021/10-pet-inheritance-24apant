public class Dog extends Pet {
    // Instance variable(s)
    private String breed;
    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }

    public Dog(){
        super("null", 0);
        this.breed = "null";
    }



    // makeNoise() method


    // toString method


    // Getter

    public String getBreed() {
        return breed;
    }


    // Setter

    public void setBreed(String breed) {
        this.breed = breed;
    }
}