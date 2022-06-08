package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProp {
    static Properties prop = new Properties();
    static FileInputStream input;
    static String properiesFileLocation = "src/test/java/TestData/TestConfig.properties.properties";

    public String getProperty(String Key) {
        try {
            input = new FileInputStream(properiesFileLocation);
            prop.load(input);
            input.close();

        }catch (IOException e){
            e.printStackTrace();
        }

        return prop.getProperty(Key);


    }


}



