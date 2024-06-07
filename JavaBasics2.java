/*  
//loops

public class JavaBasics2 {
    public static void main(String[] args) {
        for(int i = 1; i<=4; i++){
            
                System.out.println("*");
               
        }
    }  
}

*/

import java.util.Scanner;

public class JavaBasics2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String type = ((num>=0))? "positive":"negative";
        System.out.println(type);

    }
}
