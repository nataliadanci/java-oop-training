package database;

public class Database {

    private static final String STATUS = "OFF";

    public boolean isAvailable() {
        boolean availability = STATUS.equals("OFF") ? false : true;
        return availability;
    }
    public int getUniqueId() {
        int sum = 40 + 2;
        return sum;
    }
}
