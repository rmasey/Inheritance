public class Fish extends Animal {

    private int fins;

    public Fish(String colour, int fins) {
        super(colour);
        System.out.println("A fish was created.");
        this.fins = fins;
    }

    public int getFins() {
        return fins;
    }

    public void setFins(int fins) {
        this.fins = fins;
    }

    public void describe() {
        System.out.println("Fish live in water");
    }

    public void describe(String moreInfo) {
        System.out.println("Fish live in water" + moreInfo);
    }

}
