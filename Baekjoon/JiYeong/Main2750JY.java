package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main2750JY {
    //선택정렬
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        ArrayList<Integer> list = new ArrayList<>();
//        int min = 0;
//        int minT = 0;
//        int cnt = Integer.parseInt(br.readLine());
//
//        for (int i=0; i<cnt; i++) {
//            list.add(Integer.parseInt(br.readLine()));
//        }
//
//        for (int i=0; i<list.size(); i++) {
//            min = i;
//            for (int j=i+1; j< list.size(); j++) {
//                if (list.get(min) > list.get(j)) min = j;
//            }
//
//            minT = list.get(i);
//            list.set(i, list.get(min));
//            list.set(min, minT);
//        }
//
//        for(int i : list) {
//            System.out.println(i);
//        }
//     }

    //삽입 정렬
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        int cnt = Integer.parseInt(br.readLine());

        for (int i=0; i<cnt; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        for (int i=1; i<cnt; i++) {
            int target = list.get(i);
            int j = i-1;

            while (j>=0 && target<list.get(j)) {
                list.set(j+1, list.get(j));
                j--;
            }
            list.set(j+1, target);
        }

        for(int i : list) {
            System.out.println(i);
        }
    }
}
