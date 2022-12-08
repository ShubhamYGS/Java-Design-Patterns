package creational.abstractfactory;

public class CloudDeptDao implements Dao{
    @Override
    public void save() {
        System.out.println("Saving Department into Cloud");
    }
}
