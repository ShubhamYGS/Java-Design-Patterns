package template;

/*
*Template Pattern: Define the skeleton of program in base class and let the subclasses override the steps without changing the overall algorithm's structure.
* 1. Create parent abstract class DataRender with render() as parent method which invokes all other abstract method of that class like readData and processData.
* 2. Create subclasses(XMLDataRender, CSVDataRender) that extends parent DataRender class. Override the abstract methods (readData and processData).
* 3. In main method Create Parent reference of DataRenderer and child's memory object (either XMLDataRenderer or CSVDataRenderer) and call render() method. (Which internally calls all other abstract methods.)
 */

public class MainMethodTemplate {
    public static void main(String[] args) {
        DataRenderer dr = new XMLDataRenderer();
        dr.render();
    }
}
