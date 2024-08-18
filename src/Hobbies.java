public class Hobbies extends Person {
    String myHobby;

    public Hobbies(String name, String myHobby) {
        super(name);
        this.myHobby = myHobby;
    }

    public String getMyHobby() {
        return myHobby;
    }

    public void setMyHobby(String myHobby) {
        this.myHobby = myHobby;
    }

    @Override
    public void displayName() {
        System.out.println(getName());
    }
}
