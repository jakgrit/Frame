import java.util.Scanner;
public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int j=0;j<n;j++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int min = a<b?a:b;
            int gcd = 1;
            for(int i=1;i<=min;i++){
                if(a%i==0 && b%i==0){
                gcd = i;
                }
            }
            System.out.println("Case "+ (j+1) +" : "+gcd);
        }            
        
    }
}