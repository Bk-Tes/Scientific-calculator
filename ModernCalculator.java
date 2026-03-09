import java.util.Scanner;

public class ModernCalculator {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        int  answer=7;

        while (answer!=0){

             System.out.println("*****************");

             System.out.println("1 ADDITION");
             System.out.println("2 SUBTRACTION");
             System.out.println("3 DIVISION");
             System.out.println("4 MULTIPLICATION");
             System.out.println("5 POWERING");
             System.out.println("6 ROOTING");
             System.out.println("0 Exit the program");
             System.out.println("*******************");
        System.out.println("what operation you would like to perfom ");
             answer= scanner.nextInt();
if(answer==0){
    break;
            }

            System.out.println("Enter the first number");
           Double  first = scanner.nextDouble();
            System.out.println("Enter the second number");
           Double  second = scanner.nextDouble();

            switch (answer) {
                case 1 ->
                        System.out.println("The sum of " + first + " " + second + " is " + (first+second));
                case 2 -> System.out.println("The subtraction of " + first + " to " + second + " is " +(first-second));
                case 3 -> {if(second==0){
                    System.out.println("No divisin by zero please enter another double number");
                }
                else {
                    System.out.println("The division of "+first+" "+second +" is numbers is "+(first/second));
                }}
                case 4 ->
                        System.out.println("The multiplication of " + first + " to " + second + " is numbers is " + (first*second));
                case 5 -> System.out.println("The " + second + " power of " + first + " is " + (Math.pow(first,second)));
                case 6 -> System.out.println("The " + second + " root of " + first + " numbers is " + (Math.pow(first,1.0/second)));
            }
        }

      }
    }

