package in.hp.entity;

public class Truck {
    private int id;
    private String name;
    private String model;
    private int capacity;

    private String driver_name;

    public String getDriver_name() {
        return driver_name;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public Truck(int id, String name, String model, int capacity, String driver_name) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.capacity = capacity;
        this.driver_name = driver_name;
    }

    public Truck() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", capacity=" + capacity +
                ", driver_name='" + driver_name + '\'' +
                '}';
    }
}
