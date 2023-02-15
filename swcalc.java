import java.util.*;
public class swcalc {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose operator from + - * / % : ");
            char operator = sc.next().charAt(0);
            //number1
        
            System.out.println("Enter Number 1 : ");
            int a = sc.nextInt();
            //number 2 
        
            System.out.println("Enter Number 2 :");
            int b = sc.nextInt();

            switch(operator){
                case '+' : int sum = a + b;
                System.out.println(sum);
                break;
                case '-' : int sub = a - b;
                System.out.println(sub);
                break;
                case '*' : int mul = a * b;
                System.out.println(mul);
                break;
                case '/' : int div = a / b;
                System.out.println(div);
                break;
                case '%' : int mod = a % b;
                System.out.println(mod);
                break;
                default : System.out.println("Invalid"); 
            }

        }
    
}
