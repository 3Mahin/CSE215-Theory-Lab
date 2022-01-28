package Final;

class Car implements IVehicle {
    int mileage;
    int year;
    boolean builtBefore(int otherYear) {
        return this.year < otherYear;
    }

    @Override
    public double tuneUpCost() {
        return 0;
    }

    @Override
    public boolean canCarry(int numPassengers) {
        return false;
    }
}