public class SimpleMapHashTableFunctions {

    public static <K> int runHashFunction(String functionName, K key, int capacity) {

        // We will focus on String type
        // to make this work with our GenericDataReaderIntoMap
        if (key instanceof String) {
            switch (functionName) {
                case "StringLength":
                    // Cast to String to reuse
                    String thisString = (String) key;
                    // hash based on string length, then compress to [0, capacity)
                    int thishashcode = thisString.length();
                    return Math.abs(thishashcode) % capacity;

                case "CyclicShiftExample":
                    thisString = (String) key;
                    int h = 0;
                    for (int i = 0; i < thisString.length(); i++) {
                        h += (int) thisString.charAt(i);     // add in next character
                        h = (h << 5) | (h >>> 27);           // 5-bit cyclic shift of the running sum
                    }
                    return Math.abs(h) % capacity;


                case "DJB2":
                    thisString = (String) key;
                    long djb2 = 5381;
                    for (int i = 0; i < thisString.length(); i++) {
                        char c = thisString.charAt(i);
                        djb2 = ((djb2 << 5) + djb2) + c; // djb2 * 33 + c
                    }
                    return (int) (Math.abs(djb2) % capacity);

                case "PolynomialHash":
                    if (key == null || capacity <= 0) {
                        throw new IllegalArgumentException("Invalid input or array size.");
                    }
                    thisString = (String) key;
                    // standard polynomial rolling hash: base^i * char_i
                    long poly = 0;
                    int base = 31; // or any small prime/base like 31, 33, 37
                    for (int i = 0; i < thisString.length(); i++) {
                        poly = (poly * base) + thisString.charAt(i);
                    }
                    return (int) (Math.abs(poly) % capacity);

                case "Default":
                default:
                    // Use built-in object hashCode() for the "Default" hash function
                    return Math.abs(key.hashCode()) % capacity;
            }
        }

        // Will leave this as previous default for now
        if (key instanceof Integer) {
            int inputkey = (int) key;
            // Hashfunction - use the key itself mod the capacity
            // to prevent array overrun
            // use Math.abs to allow negative numbers
            return Math.abs(inputkey) % capacity;
        }

        // DEFAULT: use built-in object hashCode()
        // hashCode() is built into every Java object
        // Math.abs handles negative hash codes, % capacity ensures it fits in the array
        return Math.abs(key.hashCode()) % capacity;
    }

}
