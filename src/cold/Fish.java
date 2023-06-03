package cold;

public class Fish extends ColdBlooded {

    @Override
    public void Eat() {
        System.out.println("Fish eating");
    }

    public void Swim() {
        System.out.println("Fish swimming");
    }

    @Override
    public void Hunt() {
        System.out.println("Fish hunt");
    }

    @Override
    public void defenseMechanism() {
        System.out.println("Turn on the defense mechanism");
    }
}
