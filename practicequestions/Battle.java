import java.util.*;
import java.io.*;

public class Battle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int H = Integer.parseInt(br.readLine());
        int V[] = new int[N];
        for(int i=0;i<N;i++){
            V[i] = Integer.parseInt(br.readLine());
        }
        int res = N;
        for(int remove=0; remove<=N; remove++){
            int heroes = M;
            int health = H;
            int i = remove;
            while(i < N && heroes > 0){
                if(health > V[i]){
                    health -= V[i];
                    i++;
                }
                else if(health < V[i]){
                    heroes--;
                    health = H;
                }
                else{
                    heroes--;
                    health = H;
                    i++;
                }
            }

            if(i == N){
                res = remove;
                break;
            }
        }

        System.out.println(res);
    }
}