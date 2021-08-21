package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main14653JY {
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        boolean[] read = new boolean[26];
//        int[] array = new int[10001];
//        int[] count = new int[10001];
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int people = Integer.parseInt(st.nextToken());
//        int total = Integer.parseInt(st.nextToken());
//        int target = Integer.parseInt(st.nextToken());
//
//        for (int i = 1; i <= total; i++) {
//            String temp = br.readLine();
//            count[i] = Integer.parseInt(temp.split(" ")[0]);
//            array[i] = temp.split(" ")[1].charAt(0)- 'A';
//        }
//
//        if (count[target] == 0) {
//            System.out.println(-1);
//            return;
//        }
//
//        for (int i = total; i >= target; i--) {
//            read[array[i]] = true;
//        }
//
//        //이전 메시지와 읽지 않은 사람 수가 같을 경우
//        for (int i = target; i > 1; i--) {
//            if (count[i] != count[i - 1]) {
//                break;
//            }
//            read[array[i]] = true;
//            read[array[i - 1]] = true;
//        }
//
//        for (int i = 1; i < people; i++) {
//            if (!read[i]) {
//                System.out.print((char) (i + 'A') + " ");
//            }
//        }
//    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        HashSet<String> temp = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int people = Integer.parseInt(st.nextToken());
        int total = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        for(int i=0; i<total; i++) {
            list.add(br.readLine());
        }

        if (list.get(target-1).split(" ")[0].equals("0")) {
            System.out.println(-1);
        } else if (target < list.size()) {
            temp.add(list.get(target-1).split(" ")[1]);
            for(int i=target; i<list.size(); i++) {
                temp.add(list.get(i).split(" ")[1]);
            }

            for(int i=0; i<people; i++) {
                if( !String.valueOf((char) (i+65)).equals("A") && !temp.contains( String.valueOf((char) (i+65)) )) {
                    sb.append(((char) (i+65)) + " ");
                }
            }

            System.out.println(sb);
        } else {
            temp.add(list.get(target-1).split(" ")[1]);
            for(int i=target-1; i<list.size()-1; i++) {
                temp.add(list.get(i).split(" ")[1]);
            }

            for(int i=0; i<people; i++) {
                if( !String.valueOf((char) (i+65)).equals("A") && !temp.contains( String.valueOf((char) (i+65)) )) {
                    sb.append(((char) (i+65)) + " ");
                }
            }

            System.out.println(sb);
        }
    }
}
