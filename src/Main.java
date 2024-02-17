public class Main {
    public static void main(String[] args) {
        // Create an array of Ship objects with size 3
        Ship[] ships = new Ship[3];

        // Initialize array elements with different types of ships
        ships[0] = new Ship("Titanic", "1900");
        ships[1] = new CruiseShip("Queen Mary", "1936", 2000);
        ships[2] = new CargoShip("Emma Maersk", "2006", 15690);

        // Loop through the array and call the print function for each ship
        for (Ship ship : ships) {
            ship.print();
            System.out.println(); // Separate each ship's details with a newline
        }
    }
}