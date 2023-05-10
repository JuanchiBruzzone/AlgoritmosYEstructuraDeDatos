public class NumberHolder {

    //fields should be private, not public
    private int anInt;

    //fields should be private, not public
    private float aFloat;

    public int getAnInt() {
        return anInt;
    }

    public float getaFloat() {
        return aFloat;
    }

    public NumberHolder(int anInt, float aFloat) {
        this.anInt = anInt;
        this.aFloat = aFloat;
    }
}
