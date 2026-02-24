public class TestSimpleMapHashTableString {

    public static void enterValuesIntoHashTable(SimpleMapHashTable<String, String> thisHashTable) {
        thisHashTable.put("1", "D");
        thisHashTable.put("25", "C");
        thisHashTable.put("3", "F");
        thisHashTable.put("14", "Z");
        thisHashTable.put("6", "A");
        thisHashTable.put("39", "Z");
        thisHashTable.put("7", "Q");
    }

    public static void test() {
        SimpleMapHashTable<String, String> hashTable =
                new SimpleMapHashTable<>(11);
        enterValuesIntoHashTable(hashTable);
        System.out.println(hashTable.getTableContent());
    }

    public static void main(String[] args) {
        test();
    }
}
