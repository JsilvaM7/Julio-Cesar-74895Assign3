public class Assign3Question2 {
    public static void main(String[] args) {
        String currentMonth = "February";
        System.out.println("The current month is: " + currentMonth);
        // Insert your code here
      
      
      
        switch (currentMonth) {
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println("31 days");
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println("30 days");
                break;
            case "February":
                System.out.println(" 29 days");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
    }
}