import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome To Binary to Decimal Converter \n");
        System.out.println("Enter Binary Number: ");
        Scanner scan = new Scanner(System.in);
        String buffer = scan.nextLine();
        int result = Binary2Decimal(buffer);
        System.out.print("You have entered " + buffer + " as your input ");
    }

    public static int Binary2Decimal(String binary){
        int result =0;
        for(int i=0; i < binary.length(); i++){

            int digit = Character.getNumericValue(binary.charAt(i));
            int position = binary.length()-i -1;
            result = result + (int) (digit * Math.pow(2, position));
        }
        return result;
    }
}
