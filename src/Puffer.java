public class Puffer extends Fish {

    private boolean spiney;  //some puffer fish have spines, none have scales

    public Puffer(String colour, int fins, boolean spiney) {
        super(colour, fins);
        System.out.println("A puffer was created...");
        this.spiney = spiney;	
    }
    public boolean isSpiney() {
        return spiney;
    }
    public void setSpiney(boolean spiney) {
        this.spiney = spiney;
    }
    public void describe() {
        System.out.println("Puffer fish are deadly.");
    }
}
