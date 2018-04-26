public class Square implements Shape{
    int wigh;

    public int getWigh() {
        return wigh;
    }

    public void setWigh(int wigh) {
        this.wigh = wigh;
    }

    @Override
    public int getSquare() {
        return wigh * wigh;
    }
}
