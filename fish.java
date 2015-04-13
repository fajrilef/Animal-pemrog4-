package animal;

/**
 *
 * @author fajri
 */
public class fish extends Animal implements pet{
    protected String name;
    public fish() {
        
    }
    public fish(String name) {
     
        System.out.println("Nama= " + name);
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String Nama){
        name = Nama;
    }
    
    public void play(){
        System.out.println("Ikan Sedang Bermain");
    }
    
    public void walk(){
        System.out.println("Ikan Sedang Berenang");
    }
    
    public void eat(){
        System.out.println("Ikan Sedang Makan");
    }
}
