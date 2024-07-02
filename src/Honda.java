public class Honda extends Car {
    private String model;

    public Honda(String model, int wheels) {
        super(wheels);
        this.model = model;
    }

    @Override
    void displayWheels() {
        System.out.println("I drive a " + model + "with " + getWheels() + " wheels");
    }
}
