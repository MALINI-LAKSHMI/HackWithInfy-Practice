import java.util.*;
import java.io.*;
public class Gym{
public static void main(String[] args) throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int E = Integer.parseInt(br.readLine());
int N = Integer.parseInt(br.readLine());
int A[] = new int[N];
for(int i=0;i<N;i++){
    A[i] = Integer.parseInt(br.readLine());
}
Arrays.sort(A);
int count = 0;
int i = N-1;
while(E>0 && i>=0){
    for(int j=0;j<2;j++){
        E -= A[i];
        count++;
        if(E<=0){
            break;
        }
    }
    i--; 
}
System.out.print(E<=0 ? count : -1);
}
}
