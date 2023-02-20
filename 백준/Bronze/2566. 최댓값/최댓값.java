import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[9][9];
        for(int i=0; i<9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] maxArr = new int[3];
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                if(arr[i][j] > maxArr[0]) {
                    maxArr[0] = arr[i][j];
                    maxArr[1] = i;
                    maxArr[2] = j;
                }
            }
        }
        System.out.println(maxArr[0]);
        System.out.println((maxArr[1]+1) + " " + (maxArr[2]+1));
    }
}