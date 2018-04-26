public class Main {
    static Rectangle getRect(){
        return new Rectangle();
    }

    public static void main(String[] args) {
        Rectangle rectangle = getRect();
        rectangle.setHeight(10);
        rectangle.setWith(5);
        System.out.println(rectangle.getSquare());
    }
}