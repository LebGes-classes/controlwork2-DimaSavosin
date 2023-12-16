abstract class Pet {
    protected int saturation; // сытость

    public Pet(int saturation) {
        this.saturation = saturation;
    }

    abstract void sound();

    public void eat() {
        saturation = Math.min(100, saturation + 75);
        sound();
    }

    public int getSaturation() {
        return saturation;
    }
}
