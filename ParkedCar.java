public class ParkedCar {
    private int make;
    private String model;
    private String color;
    private String licenseNumber;
    private int minutesParked;

    public ParkedCar(int make, String model, String color, String licenseNumber, int minutesParked) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.licenseNumber = licenseNumber;
        this.minutesParked = minutesParked;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public void setMake(int make) {
        this.make = make;
    }

    public void setMinutesParked(int minutesParked) {
        this.minutesParked = minutesParked;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public int getMake() {
        return make;
    }

    public int getMinutesParked() {
        return minutesParked;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String getModel() {
        return model;
    }

    public String toString() {
        return "Car Details:\n" + this.make + " " + this.model + " " + this.color + " " + this.licenseNumber + "\n";
    }
}
