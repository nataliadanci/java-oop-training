package pb61;

public class Zi {

    private String name;
    private boolean isWorkingDay;

    public Zi(String name, boolean isWorkingDay){
        this.name = name;
        this.isWorkingDay= isWorkingDay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWorkingDay(boolean isWorkingDay) {
        this.isWorkingDay = isWorkingDay;
    }

    public boolean isWorkingDay() {
        return isWorkingDay;
    }
}
