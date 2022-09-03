package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main13022DH {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        Pattern pattern = Pattern.compile("[^w]w");
        Matcher matcher = pattern.matcher(input);

        List<Integer> splitPoints = new ArrayList<Integer>();
        int idx = 0;
        while  (matcher.find(idx)) {
            int found = matcher.start();
            splitPoints.add(found+1);
            idx = found+1;
        }

        splitPoints.add(0,0);
        splitPoints.add(input.length());
        for (int i=0;i<splitPoints.size()-1;i++) {
            String howl = input.substring(splitPoints.get(i), splitPoints.get(i+1));
            if (!isValidWolf(howl)) {
                System.out.println("0");
                return;
            }
        }
        System.out.println("1");
    }

    public static boolean isValidWolf(String wolf) {
        int wCnt = 0;

        for (int i=0;i<wolf.length();i++) {
            if (wolf.charAt(i) == 'w') {
                wCnt++;
            } else {
                break;
            }
        }

        if (wolf.length() != wCnt*4) {
            return false;
        }

        int index = wCnt;
        boolean oCheck = wolf.charAt(index) == 'o' && wolf.charAt(index+wCnt-1) == 'o';
        index+=wCnt;
        boolean lCheck = wolf.charAt(index) == 'l' && wolf.charAt(index+wCnt-1) == 'l';
        index+=wCnt;
        boolean fCheck = wolf.charAt(index) == 'f' && wolf.charAt(index+wCnt-1) == 'f';

        return oCheck && lCheck && fCheck;
    }
}
