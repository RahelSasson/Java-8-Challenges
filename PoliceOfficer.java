public class PoliceOfficer {

    private String name;
    private int badgeNumber;
    private ParkingMeter meter;
    private ParkedCar car;

    public PoliceOfficer(String name, int badgeNumber, ParkingMeter meter, ParkedCar car) {
        this.name = name;
        this.badgeNumber = badgeNumber;
        this.meter = meter;
        this.car = car;
    }

    public boolean isExpired() {
        if(car.getMinutesParked() > meter.getParkingTimePurchased())
            return true;
        return false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBadgeNumber(int badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public String getName() {
        return name;
    }

    public int getBadgeNumber() {
        return badgeNumber;
    }

    public ParkedCar getCar() {
        return car;
    }

    public ParkingMeter getMeter() {
        return meter;
    }

    public ParkingTicket issueTicket() {
        return new ParkingTicket(new PoliceOfficer(this.name, this.badgeNumber, this.meter, this.car));
    }
}
