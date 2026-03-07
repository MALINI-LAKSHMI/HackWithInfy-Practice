import java.util.*;
public class GymExercise{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int E=sc.nextInt();
        int N=sc.nextInt();
        int[]A=new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        Arrays.sort(A);
        int count=0;
        for(int i=N-1;i>=0;i--){
            for(int j=0;j<2;j++){
                E-=A[i];
                count++;
            if(E<=0){
                System.out.println(count);
                return;
             }
           }
        }
          System.out.println(-1);
    }
}