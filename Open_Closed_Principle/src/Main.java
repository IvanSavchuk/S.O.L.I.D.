public class Main {
    public static void main(String[] args) {
//        Toyota toyota = new Toyota();
        Celica celica = new Celica();
        workInTaxi(celica);
    }
    static void workInTaxi(Car car){
        car.workInTaxi();
    }
}
