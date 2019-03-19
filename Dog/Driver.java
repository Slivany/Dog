
/**
 * Lav en beskrivelse af klassen Driver her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class Driver
{
    public static void exam()
    {
        System.out.println("");
        Dog d1 = new Dog("Fido", "German Shepherd", true, 4);
        Dog d2 = new Dog("Miki", "Bulldog", false, 2);
        Dog d3 = new Dog("Riz", "Labrador", true, 7);
        Dog d4 = new Dog("Hans", "Bulldog", true, 3);
        Dog d5 = new Dog("Fred", "Pug", false, 5);
        
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());
        System.out.println(d4.toString());
        System.out.println(d5.toString());
        
        System.out.println("");
        Kennel k = new Kennel("West Dog Shelters");
        k.add(d1);
        k.add(d2);
        k.add(d3);
        k.add(d4);
        k.add(d5);
        
        System.out.println("");
        System.out.println("Find age of purebreds:");
        System.out.println(k.totalAgeOfPurebred());
        
        System.out.println("");
        System.out.println("Find the youngest dog of a specific breed: ");
        System.out.println(k.youngestOfBreed("Pug"));
        
        System.out.println("");
        k.printKennel();
    }
}
