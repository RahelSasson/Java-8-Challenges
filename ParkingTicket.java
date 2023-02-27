public class ParkingTicket {
    private PoliceOfficer officer;

    public ParkingTicket(PoliceOfficer officer){
        this.officer = officer;
    }

    public double getFine() {
        double fine = 0;
        double totalMinutes = 0;
        if(this.officer.isExpired()) {
            totalMinutes = officer.getCar().getMinutesParked() - officer.getMeter().getParkingTimePurchased();
            totalMinutes = (totalMinutes / 60);
            fine = 25;
            for (int i = 1; i < totalMinutes; i++)
                fine += 10;
        }
        return fine;
        }

        public String toString() {
        return officer.getCar().toString() + "\nFine: " + this.getFine() +
                "\nOfficer Name and Badge Number: " + officer.getName() + " " + officer.getBadgeNumber();
        }

}
