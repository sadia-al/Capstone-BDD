package capstone.cucumber.utilities;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

import org.yaml.snakeyaml.Yaml;
public class ReadYamlFiles {
    private static ReadYamlFiles readYamlFiles;
    private HashMap propertyMap;
    //singleton single object of class
    
    //this method create the instance
    //the constructor is private which it means more than one instance can not be created outside of class
    private ReadYamlFiles(String filepath) throws FileNotFoundException {
    	FileInputStream fileInputStream = FileUtility.getFileInputStream(filepath);
        Yaml yaml = new Yaml(); //call Yaml file
        this.propertyMap = yaml.load(fileInputStream); //store Yaml in Hash Map
    }
    //this method return an instance if the object is created it will only return that object instance if not it will return instance alone 
    //and will not create a new one
    public static ReadYamlFiles getInstance(String filePath) throws FileNotFoundException {
        if(readYamlFiles == null)
            return new ReadYamlFiles(filePath);
        return readYamlFiles; 
    }
    
    
    //this method send values from Yaml file by sending key you will get the value
    public HashMap getYamlProperty(String key) {
        return (HashMap) this.propertyMap.get(key);
    } 
    
  
}