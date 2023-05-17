import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
while (true){
            try(scanner){
                System.out.println("Enter numerator");
                int numerator = scanner.nextInt();

                System.out.println("Enter denominator");
                int denominator = scanner.nextInt();

                int divide = numerator / denominator;
                System.out.println("answer" + divide);

            } catch (ArithmeticException e){
                System.out.println("Sorry cant use a zero");

            }catch (InputMismatchException e){
                System.out.println("Sorry got to use whole numbers ");
            }


        }



}
}
