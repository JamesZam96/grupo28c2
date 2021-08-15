package view;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Properties;

public class Files {
    public static void main(String[] args) {

        try {
            InputStream ins = new FileInputStream("./data/data.properties");
            Properties prop = new Properties();

            prop.load(ins);
            prop.forEach((key,value) -> System.out.println(key+" "+value));
            System.out.println(prop.getProperty("No. triple3"));
  
        } catch (Exception e) {
            //TODO: handle exception
        }


        // try {
        //     OutputStream ous = new FileOutputStream("./data/data.properties");
        //     Properties prop = new Properties();

        //     // prop.setProperty("nombre", "James");
        //     // prop.setProperty("edad", "25");

        //     for (int i = 1; i < 101; i++) {
        //         int numero = 3*i;
        //         prop.setProperty("No. triple"+i,""+numero);
        //     }

        //     prop.store(ous, null);
            
        //     System.out.println(prop);
        
        // } catch (Exception e) {
        //     //TODO: handle exception
        // }
    }
}
