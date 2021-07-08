package JiYeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main14584JY {
    public String solution(String x, ArrayList<String> list) {
        String result = "";
        char[] charList = x.toCharArray();

        for(int i=0; i<26; i++) {
            for(int j=0; j<charList.length; j++){
                if(charList[j]+1 > 122) {
                    charList[j] = (char)(charList[j]-25);
                } else {
                    charList[j] = (char)(charList[j]+1);
                }
            }
            for(String s : list) {
                if (String.valueOf(charList).contains(s)) {
                    return String.valueOf(charList);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        ArrayList<String> list = new ArrayList<>();

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            String x = br.readLine();
            int n = Integer.parseInt(br.readLine());
            for(int i=0; i<n; i++) {
                list.add(br.readLine());
            }

            Main14584JY main = new Main14584JY();
            System.out.println(main.solution(x, list));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
    }
}
