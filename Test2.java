import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a;
        if(max < b){
            max = b;
        }
        if(max < c){
            max = c;
        }
        
        int min = a;
        if(min > b){
            min = b;        
        }
        if (min > c){
            min = c;            
        }
        System.out.println("Maximum"+" "+max);
        System.out.println("Minimum"+" "+min);
    }
}