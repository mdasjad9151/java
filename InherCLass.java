class car{

    public void suv(){
        System.out.println("Sasti and tikau");
    }

}

class marutisuzuki extends car{
   public void suv(){
        System.out.println("Over sastiiiii");
    }

}
public class InherCLass {
    public static void main(String[] args) {
        car c = new marutisuzuki();

        c.suv();
    }
}
    

