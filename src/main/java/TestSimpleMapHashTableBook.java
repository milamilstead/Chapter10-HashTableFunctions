import java.util.Map;
import java.util.TreeMap;

public class TestSimpleMapHashTableBook {

    public static void test1() {
        // Create the Map
        Map<String, String> testKeyValuePairs = new TreeMap<>();
        // Add elements to the map
        testKeyValuePairs.put("Elton John", "Candle in the Wind");
        testKeyValuePairs.put("Irene Cara", "Flashdance");
        testKeyValuePairs.put("Cher", "Believe");
        testKeyValuePairs.put("Elton John", "Goodbye Yellow Brick Road");
        // Now print the map
        testKeyValuePairs.forEach((key, value) -> System.out.print(key + ": " + value + "\n"));
        System.out.println();
    }

    public static void test2() {
        // Create the Map
        Map<String, String> testKeyValuePairs = new TreeMap<>();
        // Add elements to the map
        testKeyValuePairs.put("#10", "Elton John: Candle in the Wind");
        testKeyValuePairs.put("#11", "Irene Cara: Flashdance");
        testKeyValuePairs.put("#15", "Cher: Believe");
        testKeyValuePairs.put("#17", "Elton John: Goodbye Yellow Brick Road");
        // Now print the map
        testKeyValuePairs.forEach((key, value) -> System.out.print(key + ": " + value + "\n"));
        System.out.println();
    }

    public static void main(String[] args) {
        test1();
    }

}

