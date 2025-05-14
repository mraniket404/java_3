/* 9.Create a program that calculates grades based on marks
A -> above 90%        B -> above 75%
C -> above 60%        D -> above 30%
F -> below 30% 
*/

import java.util.*;
public class Task16 {
    public static void main(String[] args) {
        System.out.println("================grades based on marks================");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Marks : ");
        int Marks = sc.nextInt();

        if (Marks >= 90 && Marks <= 100) {
            System.out.println("The Grade is ===>>> A ");
        }else if (Marks >=75 && Marks <= 100) {
            System.out.println("The Grade is ===>>> B");
        }else if (Marks >= 60 && Marks <= 100) {
            System.out.println("The Grade is ===>>> C");
        }else if (Marks >= 30 && Marks <= 100) {
            System.out.println("The Grade is ===>>> D");
        }else if (Marks > 100) {
            System.out.println("Plz Enter 1 to 100 number only");
        }else {
            System.out.println("The Grade is ===>>> F");
        }
    }
}
