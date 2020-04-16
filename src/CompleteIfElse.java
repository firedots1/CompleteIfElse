import java.util.Scanner;

public class CompleteIfElse {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Enter Input:");
        Scanner prompt = new Scanner(System.in);
        number = prompt.nextInt();


        if (number > 10)
        {
            System.out.println(number + " " + "is greater than 10.");
        }
        else if (number < 10)
        {
            System.out.println(number + " " + "is less than 10.");
        }
        else
        {
            System.out.println(number + " " + "is equal to 10.");
        }
    }
}
