import java.util.Scanner;
public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i=2;i<=n;i++){
            int cnt2 =0;
            for(int j=1;j<=i;j++){
                if(i%j ==0)cnt2++;
                     
          }  
                if(cnt2 == 2)cnt++;
                    
        }
                System.out.println(cnt);
        }
            
        }
    }
}
