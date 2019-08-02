package gym.demo;

public class Unit {

    private long id;
    public String unit_Name;

    public Unit(long id, String unit_Name) {
        this.id = id;
        this.unit_Name = unit_Name;


    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUnit_Name() {
        return unit_Name;
    }

    public void setUnit_Name(String unit_Name) {
        this.unit_Name = unit_Name;
    }
}
