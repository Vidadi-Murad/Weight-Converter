// Weight Converter 

// Import Library
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        // Scanner

        System.out.println("---------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Weight Conversion Program");

        // Options
        String firstOption = "1: Convert LBS to KGS";
        String secondOption = "2: Convert KGS to LBS";

        System.out.println(firstOption);
        System.out.println(secondOption);

        int option;

        System.out.print("Choose an option:");
        option = scanner.nextInt();

        // First Option ( LBS -> KGS )
        if(option == 1){
         double firstConvert;
         double resultWeight1 = 0;
         System.out.print("Enter the weight in LBS:");
         firstConvert = scanner.nextDouble();
         resultWeight1 = firstConvert / 2.20462;
         System.out.printf("The new weight KGS is: %.2fkg\n", resultWeight1);
        }
        // Second Option ( KGS -> LBS )
         else if(option == 2){
         double secondConvert;
         double resultWeight2 = 0;
         System.out.print("Enter the weight in KGS:");
         secondConvert = scanner.nextDouble();
         resultWeight2 = secondConvert * 2.20462;
         System.out.printf("The new weight LBS is: %.2fkg\n", resultWeight2);
        }
        // Error Handling
        else{
            System.out.println("Oops Error Try Again Pls.... :(");
        }
        scanner.close();
    }
}
