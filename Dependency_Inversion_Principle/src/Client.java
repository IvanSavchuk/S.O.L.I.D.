public class Client {
    DAO dataAccess = new DataAccess();
    void doJob(){
        dataAccess.execute();
    }
}