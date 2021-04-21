public class Car<T> {
    String model;
    int vinNumber;
    T serialCode;
    T weight;

    public Car(String model, int vinNumber, T serialCode, T weight) {
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
        Car<Integer> sedan = new Car<>("Camry", 293393934, 102929383, 8938822);
        Car<String> truck = new Car<>("F150", 38038282, "A39384224", "3004.5943");

        System.out.println("Sedan: " + sedan); //sedan.toString() will be invoked inside the print
        System.out.println("Truck: " + truck.toString());
    }
}
