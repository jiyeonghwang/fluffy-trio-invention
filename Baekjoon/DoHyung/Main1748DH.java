package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1748DH {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        if (n.length() == 1) {
            System.out.println(n);
            return;
        }

        //가장 긴 길이 숫자들 더해줌
        long answer = (int)(Integer.parseInt(n)-Math.pow(10,n.length()-1)+1) * n.length();
        //가장 긴 길이 숫자들 제외한 수들 더해줌
        long count = 9;
        for (int i=1;i<n.length();i++) {
            answer += i*count;
            count*=10;
        }

        System.out.println(answer);
    }
}

//9
//(99-9)*2=90*2=180
//21*3=63

//(9-0)*1=9*1=9
//(99-9)*2=90*2=180
//(999-99)*3=900*3=2700

