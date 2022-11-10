package com.cydeo.utitlities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    // 1- Create the object of Properties class
    // We need properties class to use methods coming from class like load(), getProperty("key")
   private static Properties properties = new Properties();//It's static because we are using it in static method

   static  { // We want to use this block before other method in the property object, it can be only one time reading

        try {
            // 2- Create the object of FileInputStream
            // We need this object to open file as a stream in Java memory
            FileInputStream file = new FileInputStream("config.properties");



            // 3- Load the properties object using FileInputStream object
            // Load "properties" object with the "file" we opened using FileInputStream
            properties.load(file);

            //Close the file after loading if we don't close, It will just take extra memory in the java memory
            file.close();
        } catch (IOException e) {
                e.printStackTrace();
        }

    }
    //This method is used to read value from a configuration.properties file
    //keyword --> key name is configuration.properties file
    //return --> value for the key. returns null if key is not found
    //instead of using driver.get(Configuration.getProperty("env")
    public static String getProperty(String keyword){

       return properties.getProperty(keyword);
    }


}
