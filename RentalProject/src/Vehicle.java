public abstract class Vehicle {
    public enum VehicleStatus { AVAILABLE, RENTED }

    private String licensePlate;
    private String make;
    private String model;
    private int year;
    private VehicleStatus status;

    public Vehicle(String make, String model, int year) {
        this.make = capitalize(make);
        this.model = capitalize(model);
        this.year = year;
        this.status = VehicleStatus.AVAILABLE;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate.toUpperCase();
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public void setStatus(VehicleStatus status) {
        this.status = status;
    }

    public abstract String getInfo();

    //private helper method
    private String capitalize(String input) {
        if (input == null || input.isEmpty()) return "";
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
    }
}

