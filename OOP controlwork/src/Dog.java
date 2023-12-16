public class Dog extends Pet {
    public Dog(int saturation) {
        super(saturation);
    }

    @Override
    void sound() {
        System.out.println("Гав");
    }

}
