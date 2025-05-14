/*Create a program that shows bitwise OR of two numbers*/

import java.util.*;
public class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n==================OR Operator (|): Performs on two integers======================\n");
        System.out.print("Enter the frist number : ");
        int frist = sc.nextInt();
        System.out.print("Enter the second number : ");
        int second = sc.nextInt();

        int result = frist | second;
        System.out.println("The Result is ==>> "+ result);
    }
}
