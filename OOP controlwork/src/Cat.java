class Cat extends Pet {
    public Cat(int saturation) {
        super(saturation);
    }

    @Override
    void sound() {
        System.out.println("Мяу");
    }
}
