package abstractfactory;

public class CloudEmployeeDao implements Dao{
    @Override
    public void save() {
        System.out.println("Saving Employee into Cloud");
    }
}
