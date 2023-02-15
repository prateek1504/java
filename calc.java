import java.util.*;
public class calc{
    public static void main(String args[]){
        //operator
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose operator from + - * / % : ");
        char operator = sc.next().charAt(0);
        //number1
        
        System.out.println("Enter Number 1 : ");
        int a = sc.nextInt();
        //number 2 
        
        System.out.println("Enter Number 2 :");
        int b = sc.nextInt();

        if (operator == '+'){
            int sum = a + b;
            System.out.println(sum);
        } else if(operator == '-'){
            int sub = a - b;
            System.out.println(sub);
        } else if(operator == '*'){
            int mul = a * b;
            System.out.println(mul);
        }  else if(operator == '/'){
            int div = a / b;
            System.out.println(div);
        }  else if(operator == '%'){
            int mod = a % b;
            System.out.println(mod);
        }  else {
            System.out.println("Invalid Operator");
        }
    }
}
