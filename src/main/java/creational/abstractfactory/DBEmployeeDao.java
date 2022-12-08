package creational.abstractfactory;

public class DBEmployeeDao implements Dao{
    @Override
    public void save() {
        System.out.println("Saving Employee into Database");
    }
}
