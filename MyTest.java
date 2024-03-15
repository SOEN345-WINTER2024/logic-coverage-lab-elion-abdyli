import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    void test1(){
        System.out.println("test1");
        int val = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(i);
                    System.out.print(j);
                    System.out.println(k);

                    if (val > 2){
                        assertEquals("P is true", CheckIt.checkIt(i==1,j==1,k==1));

                    }
                    else{
                        assertEquals("P isn't true", CheckIt.checkIt(i==1,j==1,k==1));

                    }
                    val ++;
                }
            }
        }

    }

}



