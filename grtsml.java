import java.util.*;
public class grtsml{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == b){
            System.out.println(a + "equals" + b);
        }else if (a>b) {
            System.out.println(a + "IS greater" + b);
        } else {
            System.out.println(b + "is greater" + a);
        }
        
    }
}
/* (a>b) {
    System.out.println("a IS greater");
} else {
    System.out.println("b is greater");
}
}*/