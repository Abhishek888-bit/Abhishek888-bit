package TestNGpractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import org.junit.Test;
public class PropertFile {
	
    Properties prop;
    
    String path="D:\\Feb_19\\MavenProject19\\abc.properties";
    
    @Test
    public void test() throws IOException {
    	FileInputStream ip=new FileInputStream(path);
    	
    	prop=new Properties();
    	prop.load(ip);
    	
    	System.out.println(prop.getProperty("browser"));
    	System.out.println(prop.getProperty("url"));
    }
    

}
