package cold;

public class Amphibians extends ColdBlooded {

    @Override
    public void Eat() {
        System.out.println("Amphibians eat");
    }

    @Override
    public void Swim() {
        System.out.println("Amphibians swim");
    }

    public void Hunt() {
        System.out.println("Amphibians hunt");
    }

    public void defenseMechanism() {
        System.out.println("Turn on the defense mechanism");
    }
}
