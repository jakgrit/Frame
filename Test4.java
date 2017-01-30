import java.util.Scanner;
public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            String s="";
            while(x > 0){
                s = (char)(x%2+48) + s;
                x /= 2;
            }
            System.out.println("Case " + (i+1) + " : "+s);
        }
    }
}