public class SimpleMapHashTableFunctions {

    public static <K> int runHashFunction(String functionName, K key, int capacity) {

        // We will focus on String type
        // to make this work with our GenericDataReaderIntoMap
        if (key instanceof String) {
            switch (functionName) {
                case "StringLength":
                    // Cast to String to reuse
                    String thisString = (String) key;
                    int thishashcode = 0;
                    // TODO: put code here to compute hashcode based on string length
                    // remainder by capacity
                    return thishashcode;
                case "CyclicShiftExample":
                    // TODO: Use book code from Chapter 10
                    // Cyclic shift hash codes
                    // Cast to String to make sure
                    // Be sure to abs and mod it: return Math.abs(h) % capacity;
                    // Make all needed fixes
                    thisString = (String) key;
                    int h=0;
                    return h;
                case "DJB2":
                    thisString = (String) key;
                    // TODO: use example from DJB2: https://share.google/aimode/8zdVMPTc4POpvUTul
                    return 0; // replace this
                case "PolynomialHash":
                    if (key == null || capacity <= 0) {
                        throw new IllegalArgumentException("Invalid input or array size.");
                    }
                    thisString = (String) key;
                    // TODO: use example from: https://share.google/aimode/Z06Rl6bsThCSNls6K
                    return 0; // replace this
                case "Default":
                default:
                    // Use built-in object hashCode() for the "Default" hash function
                    // Math.abs handles negative hash codes, % capacity ensures it fits in the array
                    return 0;
                    //return Math.abs(key.hashCode()) % capacity;
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
