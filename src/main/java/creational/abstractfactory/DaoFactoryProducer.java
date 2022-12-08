package creational.abstractfactory;

public class DaoFactoryProducer {

    public static DaoAbstractFactory produce(String factoryType) {
        if(factoryType.equals("DB"))
            return new DBDaoFactory();
        else if (factoryType.equals("Cloud"))
            return new CloudDaoFactory();

        return null;
    }

}
