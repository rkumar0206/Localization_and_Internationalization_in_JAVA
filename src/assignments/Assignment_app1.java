package assignments;/*
        Write a program to illustrate the use of ResourceBundle objects
        to display locale specific values from properties files.
 */

// https://www.javatpoint.com/ResourceBundle-class

import java.util.Locale;
import java.util.ResourceBundle;

public class Assignment_app1 {

    public static void main(String[] args) {

        ResourceBundle bundle_en = ResourceBundle.getBundle("Messages", Locale.US);
        System.out.println("Message in "+Locale.US +": "+bundle_en.getString("message"));

        ResourceBundle bundle_fr = ResourceBundle.getBundle("Messages", Locale.FRENCH);
        System.out.println("Message in "+Locale.FRENCH +": "+bundle_fr.getString("message"));

    }
}
