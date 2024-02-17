class CruiseShip extends Ship {
    private int maxPassengers;

    public CruiseShip(String name, String yearBuilt, int maxPassengers) {
        super(name, yearBuilt);
        this.maxPassengers = maxPassengers;
    }

    // Accessor
    public int getMaxPassengers() {
        return maxPassengers;
    }

    // Mutator
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    // Override print function
    @Override
    public void print() {
        System.out.println("Ship Name: " + getName());
        System.out.println("Max Passengers: " + maxPassengers);
    }
}