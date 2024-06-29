public class Honda extends Car {
    private String make;

    public Honda(String make, int wheels) {
        super(wheels);
        this.make = make;
    }

    public void displayCar() {
        System.out.println("I drive " + make + " car and it has " + getMake() + " wheels");
    }
}
