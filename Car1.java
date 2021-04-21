public class Car1 {
    String model;
    int vinNumber;
    int serialCode;
    int weight;

    public Car1(String model, int vinNumber, int serialCode, int weight) {
        this.model = model;
        this.vinNumber = vinNumber;
        this.serialCode = serialCode;
        this.weight = weight;
    }
    public String toString() {
        return "Model: " + model + ", Vin Number: " + ", Serial Code: " + serialCode + ", Weight: " + weight;
    }

    //Main method to test the object
    public static void main(String[] args) {
        Car1 sedan = new Car1("Camry", 293393934, 102929383, 8938822);
//        Car1 truck = new Car1("F150", 38038282, "A39384224", "3004.5943");

        System.out.println("Sedan: " + sedan); //sedan.toString() will be invoked inside the print
//        System.out.println("Truck: " + truck.toString());
    }
}
