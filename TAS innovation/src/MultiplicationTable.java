import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to get its multiplication table (up to 10 multiply)");
        int num = input.nextInt();

        for (int i = 1; i <=10; i++)
        {
            int ans = i * num;
            System.out.println(num +" X "+ i +" = " +ans );
        }

    }
}
