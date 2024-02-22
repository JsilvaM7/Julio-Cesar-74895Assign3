public class Assign03Question6 {
    public static void main(String[] args) {
        // Pattern 1
        System.out.println("1)");
        int pattern1Row = 0;
        while (pattern1Row < 3) {
            int pattern1Column = 0;
            while (pattern1Column < 10) {
                System.out.print("*");
                pattern1Column++;
            }
            System.out.println();
            pattern1Row++;
        }
        
        
        
        
        
        // Pattern 2
        System.out.println("\n2)");
        int pattern2Row = 1;
        while (pattern2Row <= 5) {
            int pattern2Column = 1;
            while (pattern2Column <= pattern2Row) {
                System.out.print("*");
                pattern2Column++;
            }
            System.out.println();
            pattern2Row++;
        }
        
        
        
        
        
        
        // Pattern 3
        System.out.println("\n3)");
        int pattern3Row = 1;
        while (pattern3Row <= 5) {
            int pattern3ColumnSpace = 5;
            while (pattern3ColumnSpace > pattern3Row) {
                System.out.print(" ");
                pattern3ColumnSpace--;
            }
            int pattern3ColumnStar = 1;
            while (pattern3ColumnStar <= pattern3Row) {
                System.out.print("*");
                pattern3ColumnStar++;
            }
            System.out.println();
            pattern3Row++;
        }
        
        
        
        
        // Pattern 4
        System.out.println("\n4)");
        int pattern4Row = 1;
        while (pattern4Row <= 5) {
            int pattern4ColumnSpace = 5;
            while (pattern4ColumnSpace > pattern4Row) {
                System.out.print(" ");
                pattern4ColumnSpace--;
            }
            int pattern4ColumnStar = 1;
            while (pattern4ColumnStar <= 2 * pattern4Row - 1) {
                System.out.print("*");
                pattern4ColumnStar++;
            }
            System.out.println();
            pattern4Row++;
        }
        
        
        
        
        // Pattern 5
        System.out.println("\n5)");
        int pattern5Row = 1;
        while (pattern5Row <= 5) {
            int pattern5ColumnSpace = 5;
            while (pattern5ColumnSpace > pattern5Row) {
                System.out.print(" ");
                pattern5ColumnSpace--;
            }
            int pattern5ColumnNumber = 1;
            while (pattern5ColumnNumber <= 2 * pattern5Row - 1) {
                System.out.print(pattern5Row);
                pattern5ColumnNumber++;
            }
            System.out.println();
            pattern5Row++;
        }
        
        
        
        
        
        // Pattern 6
        System.out.println("\n6)");
        int pattern6Row = 1;
        while (pattern6Row <= 5) {
            int pattern6ColumnSpace = 5;
            while (pattern6ColumnSpace > pattern6Row) {
                System.out.print(" ");
                pattern6ColumnSpace--;
            }
            int pattern6ColumnNumber = pattern6Row;
            while (pattern6ColumnNumber >= 1) {
                System.out.print(pattern6ColumnNumber);
                pattern6ColumnNumber--;
            }
            int pattern6ColumnIncrement = 2;
            while (pattern6ColumnIncrement <= pattern6Row) {
                System.out.print(pattern6ColumnIncrement);
                pattern6ColumnIncrement++;
            }
            System.out.println();
            pattern6Row++;
        }
    }
}