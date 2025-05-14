/*XOR Operator (^): Performs on two integers. Each bit of the output is 1 if the
corresponding bits of the operands are different. */

import java.util.*;
public class Task20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n========================XOR Operator (^): Performs on two integers========================\n");
        System.out.print("Enter the frist number : ");
        int frist = sc.nextInt();
        System.out.print("Enter the second number : ");
        int second = sc.nextInt();

        int result = frist ^ second;
        System.out.println("The Result is ==>> "+ result);
    }
}
