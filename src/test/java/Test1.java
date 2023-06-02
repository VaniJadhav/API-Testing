import org.example.Main;
import org.testng.annotations.Test;

public class Test1 extends Main{
 Main main = new Main();
    @Test
    public void logic(){
        main.logic();
     System.out.println("Logic child");

 }
    @Test
    public void add(){
          main.logic();
          System.out.println("Test1");
    }

}
