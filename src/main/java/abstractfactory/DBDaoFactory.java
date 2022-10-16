package abstractfactory;

public class DBDaoFactory extends DaoAbstractFactory{
    @Override
    public Dao createDao(String type) {
        if(type.equals("Employee"))
            return new DBEmployeeDao();
        else if(type.equals("Department"))
            return new DBDeptDao();
        return null;
    }
}
