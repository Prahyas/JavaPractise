public class Honda<T> {
    private T carName;

    public Honda(T carName){
        this.carName = carName;
    }

    void drive() {
        System.out.println("I drove " + carName);
    }

}
