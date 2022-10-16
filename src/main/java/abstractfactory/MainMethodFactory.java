package abstractfactory;

/*AbstractFactory: Factory of factories.
* 1. Create Dao Interface
* 2. Create four classes which implements Dao Interface (CloudDeptDao, CloudEmployeeDao, DBDeptDao, DBEmployeeDao)
* 3. Create DaoAbstractFactory abstract class. Which has createDao abstract method which returns Dao.
* 4. Create two factory classes DBDaoFactory & CloudDaoFactory which extends DaoAbstractFactory and implement their createDao methods. (return either cloud or emplooyee object resp.)
* 5. Create Parent DaoFactoryProducer class which has the static method produce which returns either DBDaoFactory or CloudDaoFactory.
* 6. In main method: Call parent class DBDaoFactoryProducer.produce(with type cloud or db) which returns DaoAbstractFactory.
* 7. Take the object of DaoAbstractFactory and call createDao method. on either employee or dept.
 */

public class MainMethodFactory {
    public static void main(String[] args) {
        DaoAbstractFactory daf = DaoFactoryProducer.produce("Cloud");
        daf.createDao("Employee").save();
    }
}
