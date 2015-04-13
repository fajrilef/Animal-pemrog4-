package animal;

/**
 *
 * @author fajri
 */
public class cat extends Animal implements pet{
    protected String name;
    public cat() {
       
    }
    public cat(String name) {
        System.out.println("Nama= " + name);
    }
    public void cat(){
        System.out.println("Default");
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String Nama){
        name = Nama;
    }
    
    public void play(){
        System.out.println("Kucing Sedang Bermain");
    }
    
    public void eat(){
        System.out.println("Kucing Sedang Makan");
    }
}
