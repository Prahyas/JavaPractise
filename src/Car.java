public abstract class Car {
    private int wheels;

    public Car(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    abstract void displayWheels();
}
