import java.util.*;
/* 
public class JavaBasics{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int tax;

        if(amount<500000){
            tax = 0;
            System.out.println("Tax calculated :"+tax);
        }
        else if(amount>=500000 && amount<=1000000){
            tax = (int) (amount * 0.2);
            System.out.println("Tax calculated :"+tax);
        }
        else{
            tax = (int) (amount * 0.3);
            System.out.println("Tax calculated :"+tax);
        }
    }
}
*/


// //  Ternary operator ---> variable = cond 1 ? statement 1 : statement 2;


/* 
public class JavaBasics {

    public static void main(String[] args) {
        int num = 5;

        //ternary operator
        String type = ((num%2)==0)? "even":"odd";
        System.out.println(type);
    }
}
*/


public class JavaBasics {

    public static void main(String[] args) {
        int number =2;
        switch(number){
            case 1: System.out.println("sam");
                        break;
            case 2: System.out.println("sami");
                        break;
            case 3: System.out.println("samir");
                        break;
            default: System.out.println("samira");
        }
    }
}