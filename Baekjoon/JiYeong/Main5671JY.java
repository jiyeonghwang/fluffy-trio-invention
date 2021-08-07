package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main5671JY {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String temp = "";
        int count = 0;
        int result = 0;

        while ((temp = br.readLine()) != null) {
            String[] hotel = temp.split(" ");

            int start = Integer.parseInt(hotel[0]);
            int end = Integer.parseInt(hotel[1]);
            result = 0;

            for (int i = start; i <= end; i++) {
                String room = String.valueOf(i);
                for (int j = 0; j < room.length(); j++) {
                    count = 0;
                    if (room.substring(j + 1).contains(String.valueOf(room.charAt(j)))) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    result++;
                }
            }
            sb.append(result + "\n");
        }
        System.out.println(sb);
    }
}
