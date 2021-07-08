package JiYeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main1316JY {
    public int solution(ArrayList<String> list) {
        int result = 0;

        for (String s : list) {
            char[] c = s.toCharArray();
            ArrayList<Character> charList = new ArrayList<>();
            if(c.length == 1) {
                charList.add(c[0]);
            } else {
                charList.add(c[0]);
                for(int i=0; i<c.length-1; i++) {
                    if(c[i] != c[i+1]) {
                        charList.add(c[i+1]);
                    }
                }
            }

            Set<Character> set = new HashSet<>(charList);
            if(set.size() == charList.size()) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        ArrayList<String> list = new ArrayList<>();

        try {
            br = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(br.readLine());
            for(int i=0; i<n; i++) {
                list.add(br.readLine());
            }

            Main1316JY main = new Main1316JY();
            System.out.println(main.solution(list));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
    }
}
