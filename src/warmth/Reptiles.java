package warmth;

import cold.ColdBlooded;

public class Reptiles extends ColdBlooded {
    @Override
    public void Eat() {
        System.out.println("Reptiles eat");
    }

    @Override
    public void Swim() {
        System.out.println("Reptiles swim");
    }

    @Override
    public void Hunt() {
        System.out.println("Reptiles hunt");
    }

    @Override
    public void defenseMechanism() {
        System.out.println("Turn on the defense mechanism");
    }
}