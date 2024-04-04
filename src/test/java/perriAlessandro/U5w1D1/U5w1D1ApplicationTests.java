package perriAlessandro.U5w1D1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import perriAlessandro.U5w1D1.entities.Bevande;
import perriAlessandro.U5w1D1.entities.Pizza;

@SpringBootTest
class U5w1D1ApplicationTests {

    @Autowired
    private Pizza margherita;

    @Autowired
    private Bevande acqua;


    @Test
    public void sum() {
//        System.out.println("SOMMA TEST");
//        double uno = margherita.getPrezzo();
//        double due = acqua.getPrezzo();
//        double result = CustomMath.sum((int) uno, (int) due);
//
//        assertEquals(10, result);
    }

}
