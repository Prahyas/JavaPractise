public class Car {
    private int wheels;

    public Car(int wheels) {
        this.wheels = wheels;
    }

    public int getMake() {
        return wheels;
    }

    public void setMake(int wheels) {
        this.wheels = wheels;
    }

    public void displayMake() {
        System.out.println("I have a " + wheels + " car.");
    }
}
