public class Ques02 {
    public static void main(String[] args) {
        
        int intVar = 25;
        double doubleVar = 10.5;
        char charVar = 'A';
        boolean boolVar = true;

       
        System.out.println("Original Values:");
        System.out.println("int value: " + intVar);
        System.out.println("double value: " + doubleVar);
        System.out.println("char value: " + charVar);
        System.out.println("boolean value: " + boolVar);

        // Type conversion
        double convertedDouble = intVar; 
        int convertedInt = charVar; 
        int convertedIntFromDouble = (int) doubleVar;

        // Print converted values
        System.out.println("\nValues After Conversion:");
        System.out.println("Converted double from int: " + convertedDouble);
        System.out.println("Converted int from char: " + convertedInt);
        System.out.println("Converted int from double: " + convertedIntFromDouble);
    }
}
