package capstone.cucumber.utilities;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class FileUtility {
	
	//static method --class level method we don't need to call the object
	
    public static FileInputStream getFileInputStream(String filePath) throws FileNotFoundException {
        return new FileInputStream(new File(filePath));
    }
}