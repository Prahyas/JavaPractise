public class Toyota extends Car{
    private String carName;

    public Toyota(String carName){
        this.carName = carName;
    }
    @Override
    void drive() {
        System.out.println("I drove " + carName);
    }

}
