 import java.util.Scanner;

public class Exericise2 {
    public static final int  ARRAY_SIZE = 10;
    public static void main(String [] args){
        printLargerAverage();

    }

    public static void printLargerAverage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter a  ten numbers");
        double numbers [] = new double[ARRAY_SIZE];
        double average = 0;

        for (int i =0; i< numbers.length; i++ ) {
            numbers[i] = scanner.nextInt();
            average = average + numbers[i];
        }
         average = average/10;

        for (int i=0; i < numbers.length; i++){
            if (numbers[i] > average){
                System.out.print(numbers[i] + " ");
            }

            }





        }
    }

