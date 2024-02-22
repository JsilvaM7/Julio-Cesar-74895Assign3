public class Assign3Question5 {
    public static void main(String args[]) {
        int currentValue = 5;
        System.out.println("The number is: " + currentValue);




        int factorial = 1;
        int i = 1;
        while (i <= currentValue) {
            factorial *= i;
            System.out.println("The factorial of " + currentValue + " is: " + factorial);
            i++;
        }
    }
}