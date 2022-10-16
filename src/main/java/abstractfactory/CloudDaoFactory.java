package abstractfactory;

public class CloudDaoFactory extends DaoAbstractFactory{
    @Override
    public Dao createDao(String type) {
        if(type.equals("Employee"))
            return new CloudEmployeeDao();
        else if(type.equals("Department"))
            return new CloudDeptDao();
        return null;
    }
}
