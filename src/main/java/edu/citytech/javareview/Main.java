package edu.citytech.javareview;
import java.util.Date;
import java.util.function.*;
import java.util.Date;




import java.util.function.Predicate;

import javax.sound.sampled.FloatControl;

public class Main {
    
    public static boolean isPassing(float grade){
        
        if (grade >= 65){
            return true;
        }
        return false;
    }

    static Predicate<Float> midtermGrade = grade -> grade >= 95;


    public static void main(String[] args) {
                
        float grade = 95;
        boolean status = isPassing(grade);

        Predicate<Float> predicate = Main::isPassing;

        System.out.println("grade is " + grade + " status: " + status);
        System.out.println("grade is " + grade + " status: " + midtermGrade.test(grade));
        System.out.println("grade is " + grade + " status: " + predicate.test(grade));
        System.out.println("Abdallah, Salem " + new Date());



    }
}