import org.example.Main;
import org.testng.annotations.Test;

public class Test2 extends Main {
    //Test1 test = new Test1();
    @Test
    public void sub(){
        Main main = new LogicalProgram();
        main.logic();
        System.out.println("---------------------------");
        LogicalProgram test = new LogicalProgram();
        test.logic();

    }
}
