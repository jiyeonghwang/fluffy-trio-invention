package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main3077DH {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer correct = new StringTokenizer(br.readLine());
        HashMap<String,Integer> correctMap = new HashMap<String,Integer>();
        for (int i=0;i<n;i++) {
            correctMap.put(correct.nextToken(), i+1);
        }

        StringTokenizer input = new StringTokenizer(br.readLine());
        String[] inputArr = new String[n];
        for (int i=0;i<n;i++) {
            inputArr[i] = input.nextToken();
        }

        int count = 0;
        for (int i=0;i<n;i++) {
            for (int j=i+1;j<n;j++) {
                if (correctMap.get(inputArr[i]) < correctMap.get(inputArr[j])) {
                    count++;
                }
            }
        }

        System.out.println(count+"/"+((n-1)*n/2));
    }
}
