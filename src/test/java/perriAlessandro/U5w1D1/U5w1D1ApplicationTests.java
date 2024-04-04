package perriAlessandro.U5w1D1;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class U5w1D1ApplicationTests {


    @BeforeAll
    public static void beforeAll() {
        System.out.println("BEFORE ALL");
        // Before All è una sorta di "setup iniziale" pre test. Ci consente ad esempio
        // di riempire un database con dei dati utili per il testing
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("AFTER ALL");
        // After All è utile per ripulire un po' la situazione. Ad esempio ripristinare
        // un database ad uno stato iniziale dopo che i vari test l'hanno "sporcato"
    }

    @Test
    public void testSum() {
        System.out.println("TEST 1");
        int result = CustomMath.sum(2, 2);
        int result1 = CustomMath.sum(3, 3);

        assertEquals(4, result);
        assertEquals(6, result1);
    }

    @Test
    public void testArraySum() {
        System.out.println("TEST 2");
        int result = CustomMath.sum(new int[]{1, 2, 3});
        assertEquals(6, result);
    }

    @ParameterizedTest
    @CsvSource({"1,1,2", "2,2,4", "3,4,7", "5,5,10"})
    public void testParameterizedSum(int add1, int add2, int expectedResult) {
        int result = CustomMath.sum(add1, add2);
        assertEquals(expectedResult, result);
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("BEFORE EACH");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("AFTER EACH");
    }
}
