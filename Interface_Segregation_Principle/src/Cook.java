public class Cook implements IWorker {

    @Override
    public void work() {
        System.out.println("Work");
    }

    @Override
    public void eat() {
        System.out.println("Eat");
    }
}
