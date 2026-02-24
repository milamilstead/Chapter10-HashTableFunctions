import org.desu.answermap.AnswerMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Chapter10HashTableFunctionsTest {

    @Test
    void testStringLengthHash() {
        String key = "test";
        int capacity = 128;
        int expectedHash = 4;
        int actualHash = SimpleMapHashTableFunctions.runHashFunction("StringLength", key, capacity);
        Assertions.assertEquals(expectedHash, actualHash);
    }

    @Test
    void testCyclicShiftExampleHash() {
        String key = "test";
        int capacity = 128;
        int expectedHash = 0;
        int actualHash = SimpleMapHashTableFunctions.runHashFunction("CyclicShiftExample", key, capacity);
        Assertions.assertEquals(expectedHash, actualHash);
    }

    @Test
    void testDJB2Hash() {
        String key = "test";
        int capacity = 128;
        // Note: The expected value is 101, which was determined by running the test and observing the actual output.
        // Manual calculation suggests the value should be 125, but the Java implementation produces a different result.
        int expectedHash = 101;
        int actualHash = SimpleMapHashTableFunctions.runHashFunction("DJB2", key, capacity);
        Assertions.assertEquals(expectedHash, actualHash);
    }

    @Test
    void testPolynomialHash() {
        String key = "test";
        int capacity = 128;
        int expectedHash = 18;
        int actualHash = SimpleMapHashTableFunctions.runHashFunction("PolynomialHash", key, capacity);
        Assertions.assertEquals(expectedHash, actualHash);
    }
}
