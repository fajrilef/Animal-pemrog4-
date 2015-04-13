package animal;

/**
 *
 * @author fajri
 */
public class Animal {

    
    protected int legs;
    
    public Animal(){
        
    }
    protected Animal(int legs){
        System.out.println("Animal legs - legs");
        this.legs = legs;
    }
    public void walk(){
        System.out.println("Hewan Bisa Berjalan");
    }

    public void eat(){
        System.out.println("Hewan Bisa Makan");
    }
}
