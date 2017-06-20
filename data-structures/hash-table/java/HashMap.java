public class HashMap {
    
    private static final int TABLE_SIZE = 128;
    private HashEntry[] table;

    public HashMap() {
       this.table = new HashEntry[TABLE_SIZE];
       for (int i = 0 ; i < TABLE_SIZE ; i++) {
           table[i] = null;
       }
    }

    public void put(HashEntry entry) {
        table[entry.getKey() % TABLE_SIZE] = entry;
    }

    public String get(int key) {
        return table[key].getValue();
    }

    public void printHashMap() {
        for (int i = 0 ; i < TABLE_SIZE ; i++) {
            if (table[i] != null) {
                System.out.println("(" + table[i].getKey() % TABLE_SIZE  + ", " 
                                       + table[i].getValue()             + ")");
            }
        }
    }
}
