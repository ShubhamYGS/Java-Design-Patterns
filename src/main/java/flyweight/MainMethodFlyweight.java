package flyweight;

/*
* FlyWeight Pattern/ Cache Pattern: (Saving memory) Reuse already existing similar kind of object by storing them and create a new object when no matching is found.
* Key points: USe hashmap to store reference to the object (if object is present then will take it from hashmap), Separate the intrinsic values (common things) in common class and refer them each time you want instead of recreating them again and again.
* Steps to implement flyweight design pattern:
* 1) Create Animal Interface with setName and setAnimalAttributes method
* 2) Extend this interface with Cat, Dog and Cow classes. In all these classes only the name of animal will be different and attributes of animal will remain the same.
* 3) Separate the intrinsic values (common values). Create a CommonSharableClass which has all the animal attributes which are common in all animals (nose, legs, tail, eyes)
* 4) Write methods inside class with setName as a custom name and printAttributes method prints the name of animal and attributes with help of CommonSharableClass.
* 5) Create a factory class which returns all the objects as per the requirement. Inside this create a private final hashmap to store the Animal object. So, everytime the same object will be returned.
* 6) Inside factory class add getCat/getDog/getCow methods which creates Animal object only if it's null and then store it in hashmap. (for reuse)
* 7) Call the required method from Main method and if we compare the hashmap of these objects then those will always remain the same.
* ** It uses singleton + factory design pattern internally.
 */
public class MainMethodFlyweight {
    public static void main(String[] args) {
        Animal catAnimal1 = AnimalFactory.getCat("CAT");
        catAnimal1.printAnimalAttributes();

        Animal catAnimal2 = AnimalFactory.getCat("CAT");
        catAnimal2.printAnimalAttributes();

        Animal dogAnimal = AnimalFactory.getDog("DOG");
        dogAnimal.printAnimalAttributes();

        Animal cowAnimal = AnimalFactory.getCow("COW");
        cowAnimal.printAnimalAttributes();

        System.out.println("Hashcode of CAT1: "+catAnimal1.hashCode());
        System.out.println("Hashcode of CAT2: "+catAnimal2.hashCode());
        System.out.println("Hashcode of DOG: "+dogAnimal.hashCode());
        System.out.println("Hashcode of COW: "+cowAnimal.hashCode());
    }
}
