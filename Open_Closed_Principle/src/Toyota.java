public class Toyota implements Car{
    void getPassangers(){
        System.out.println("get passangers");
    }

    @Override
    public void workInTaxi() {
        getPassangers();
    }
}
