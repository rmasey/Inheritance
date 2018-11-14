public class Salmon extends Fish {

    private boolean farmed; 

    public Salmon(String colour, int fins, boolean farmed) {
        super(colour, fins);
        System.out.println("A salmon was created...");
        this.farmed = farmed;
    }
    public boolean isFarmed() {
        return farmed;
    }
    public void setFarmed(boolean farmed) {
        this.farmed = farmed;
    }
    public void describe() {
        System.out.println("Salmon are a popular food.");
    }

}
