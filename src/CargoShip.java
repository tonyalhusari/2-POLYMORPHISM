class CargoShip extends Ship {
    private int cargoCapacity;

    public CargoShip(String name, String yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    // Accessor
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    // Mutator
    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    // Override print function
    @Override
    public void print() {
        System.out.println("Ship Name: " + getName());
        System.out.println("Cargo Capacity: " + cargoCapacity + " tons");
    }
}
