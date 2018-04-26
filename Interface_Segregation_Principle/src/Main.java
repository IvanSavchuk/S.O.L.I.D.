public class Main {
    public static void main(String[] args) {
        IWorker iWorker = new Cook();
        iWorker.work();
        iWorker.eat();
        iWorker.work();
    }
}
