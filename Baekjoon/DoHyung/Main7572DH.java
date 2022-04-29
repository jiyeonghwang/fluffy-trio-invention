package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main7572DH {
    public static void main(String[] args) throws IOException {
        char[] kan = {'6','7','8','9','0','1','2','3','4','5'};
        char[] eji = {'I','J','K','L','A','B','C','D','E','F','G','H'};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());

        System.out.println(eji[year%12]+String.valueOf(kan[year%10]));
    }
}
