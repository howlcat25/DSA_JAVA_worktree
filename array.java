import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();

        
        System.out.print("Enter number of columns: ");
        int column = sc.nextInt();

        
        int[][] myArray = new int[row][column];

   
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                myArray[i][j] = sc.nextInt();
            
            }
        }

        System.out.println("The elements of the 2D array are:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }

        
        sc.close();
    }
}
