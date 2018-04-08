package chapter3.item10;

public class Bike {

    private String make;
    private String model;
    private int gears;

    public Bike(String make, String model, int gears) {
        this.make = make;
        this.model = model;
        this.gears = gears;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bike) {
            Bike b = (Bike) obj;
            return b.getMake().equalsIgnoreCase(getMake()) && b.getModel().equalsIgnoreCase(getModel());
        }
        return false;
    }

    @Override
    public int hashCode() {
        // arbitrary number
        int result = 17;
        // 31 is odd prime, attempt to create "canonical representation" for Strings
        result = 31 * result + getMake().toUpperCase().hashCode();
        result = 31 * result + getModel().toUpperCase().hashCode();
        return result;
    }

}
