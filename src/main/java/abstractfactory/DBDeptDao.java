package abstractfactory;

public class DBDeptDao implements Dao{
    @Override
    public void save() {
        System.out.println("Saving Department into Database");
    }
}
