import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Animal("brown");
        System.out.println(animal1.getColour());

        Fish fish1 = new Fish("pink", 6);
        System.out.println(fish1.getColour());
        System.out.println(fish1.getFins());

        fish1.describe();
        fish1.describe("Fish can be freshwater or saltwater");


        System.out.println(fish1.getClass().getName());
        // animal1.describe();  error since Animal class has no      method called describe
        //System.out.println(fish1.fins);  error, fins have private  access no access using code in another class
        Puffer puffer1 = new Puffer("brown", 2, true);
        System.out.println(puffer1.getColour());
        System.out.println(puffer1.getFins());
        System.out.println(puffer1.isSpiney());
        puffer1.describe();

        Salmon salmon1 = new Salmon("pink", 8, false);
        System.out.println(salmon1.getColour());
        System.out.println(salmon1.getFins());
        System.out.println(salmon1.isFarmed());
        salmon1.describe();


        ArrayList<Animal> animalList = new ArrayList<>();  //

        Fish myFish = new Fish("Rainbow", 4);
        Puffer myPuffer = new Puffer("white", 2, true);
        Salmon mySalmon = new Salmon("pink", 8, false);

        animalList.add(myFish);
        animalList.add(myPuffer);
        animalList.add(mySalmon);

        for(Animal a : animalList) {
            System.out.println(a.getClass().getName());
            System.out.println("Colour: " + a.getColour());
            //System.out.println(a.describe());  error, methods restricted to those of Animal class

            if (a instanceof Puffer) {
                //System.out.println(a.describe());  error, methods restricted to those of Animal class
                ((Puffer) a).describe();  //down cast back to Puffer class and method can run
            }

        }

    }
}