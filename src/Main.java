import java.util.Scanner;

public class Main {


    static int collatzConjecture(int num)
    {
        if (num % 2 == 0)
        {
            return num / 2;
        }
        else
        {
            return 3 * num + 1;
        }
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number;



        System.out.print("Enter a number: ");
        number = keyboard.nextInt();
        System.out.print(number + " ");

        if(number > 0){
            while(number != 1){
                number = collatzConjecture(number);
                System.out.print(number + " ");

            }

            System.out.println("");
        }
    }


}