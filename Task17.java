/*Create a program that categorize a person into different age groups
Child -> below 13       Teen -> below 20
Adult -> below 60       Senior-> above 60 */

import java.util.*;
public class Task17 {
    public static void main(String[] args) {
        System.out.println("\n===================categorize a person into different age group=====================\n");
        Scanner sc = new Scanner(System.in);
         System.out.print("Plz Enter Your Age And Check The Categorize : ");
        int age = sc.nextInt();

        if (age >= 60 ) {
            System.out.println("You are a Senior !");
        }else if (age < 60  && age > 20) {
            System.out.println("You are Adult !");
        }else if (age <=20 && age > 13) {
            System.out.println("You are Teen !");
        }else if (age <= 13 && age > 0) {
            System.out.println("Your age is Child !");
        }else {
            System.out.println("your are not living");
        }
    }
}
