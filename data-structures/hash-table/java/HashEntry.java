public class HashEntry {

    private int key;
    private String value;

    public HashEntry(String value) {
        this.value = value;
        hash(value);
    }

    private void hash(String str) {
        int hash = 7;
        for (String c : str.split("(?!^)")) {
           hash = hash*31 + (int) c.charAt(0);
        }
        this.key = hash;
    }

    public int getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }
}
