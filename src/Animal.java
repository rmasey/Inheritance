public class Animal {

    private String colour;

    public Animal(String colour) {
        System.out.println("An animal was created...");
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

}
