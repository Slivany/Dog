import java.util.*;

/**
 * Lav en beskrivelse af klassen Kennel her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class Kennel
{
    private String owner;
    private ArrayList<Dog> dogs;

    /**
     * Konstruktør for objekter af klassen Kennel
     */
    public Kennel(String owner)
    {
        this.owner = owner;
        dogs = new ArrayList<Dog>();
    }

    public void add(Dog d)
    {
        dogs.add(d);
    }

    public void remove(Dog d)
    {
        dogs.remove(d);
    }

    public int totalAgeOfPurebred()
    {
        int sum = 0;
        for(Dog d : dogs)
        {
            if(d.getPurebred() == true)
            {
                sum = sum + d.getAge();
            }
        }
        return sum;
    }

    public Dog youngestOfBreed(String breed)
    {
        Dog youngest = null;
        for(Dog d : dogs)
        {
            if(d.getBreed().equals(breed))
            {
                if(youngest == null || youngest.getAge() > d.getAge())
                {
                    youngest = d;
                }
            }
        }
        return youngest;
    }
    
    public void printKennel()
    {
        System.out.println(owner);
        
        Collections.sort(dogs);
        
        for(Dog d : dogs)
        {
            System.out.println(d);
        }
    }
}
