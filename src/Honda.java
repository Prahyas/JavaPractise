public class Honda extends Car{
    private String carName;

    public Honda(String carName){
        this.carName = carName;
    }
    @Override
    void drive() {
        System.out.println("I drove " + carName);
    }

}
