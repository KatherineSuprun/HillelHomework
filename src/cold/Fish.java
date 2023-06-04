package cold;

public class Fish extends ColdBlooded {
    // method describes fishing eating
    @Override
    public void Eat() {
        System.out.println("Fish eating");
    }
    // method describes fishing swimming
    public void Swim() {
        System.out.println("Fish swimming");
    }
    // method describes fishing hunting
    @Override
    public void Hunt() {
        System.out.println("Fish hunt");
    }
    // method describes when fish is defensing
    @Override
    public void defenseMechanism() {
        System.out.println("Turn on the defense mechanism");
    }
}
