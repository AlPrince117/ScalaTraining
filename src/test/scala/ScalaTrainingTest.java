import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScalaTrainingTest {



    @Test
    void concat() {
        assertEquals("okayokay", ScalaTraining.concat("okay",2));
    }

    @Test
    void stringLengthTailRec() {
        assertEquals(6, ScalaTraining.stringLengthTailRec("Mensah"));
    }

    @Test
    void stringLength() {
        assertEquals(5, ScalaTraining.stringLength("Hello"));
    }

    @Test
    void concatTailRec() {
        assertEquals("HelloHello", ScalaTraining.concatTailRec("Hello", 2));
    }

    @Test
    void fibonacciTailRec() {
//        assertEquals();
    }

    @Test
    void numberSumTailRec() {
        assertEquals(7, ScalaTraining.numberSum(2, 5));
    }

    @Test
    void numberSum() {
        assertEquals(7, ScalaTraining.numberSum(2, 5));
    }

    @Test
    void fibonacci() {
        assertEquals(5, ScalaTraining.fibonacci(5));
    }
}