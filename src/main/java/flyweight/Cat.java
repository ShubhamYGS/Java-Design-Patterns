package flyweight;

public class Cat implements Animal{

    private String animalName = null;

    @Override
    public void setName(String name) {
        this.animalName = name;
    }

    @Override
    public void printAnimalAttributes() {
        System.out.println("Name of Animal: "+this.animalName);
        System.out.println("Number of legs of Animal is: "+CommonSharableClass.eyes);
        System.out.println("Number of legs of Animal is: "+CommonSharableClass.nose);
        System.out.println("Number of legs of Animal is: "+CommonSharableClass.legs);
        System.out.println("Number of legs of Animal is: "+CommonSharableClass.tail);
    }
}
