package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main2531JY {
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> temp = new ArrayList<>();
//        int lt=0, result=0, eat=0;
//
//        //접시 수, 초밥 종류, 연속접시 수, 쿠폰번호
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int plate = Integer.parseInt(st.nextToken());
//        int kinds = Integer.parseInt(st.nextToken());
//        int cnt = Integer.parseInt(st.nextToken());
//        int coupon = Integer.parseInt(st.nextToken());
//
//        for(int i=0; i<plate; i++) {
//            list.add(Integer.parseInt(br.readLine()));
//        }
//
//        for(int rt=0; rt<plate; rt++) {
//            eat++;
//            temp.add(list.get(rt));
//            while (eat>cnt) {
//                temp.remove(list.get(lt++));
//                eat--;
//            }
//            if(temp.contains(coupon)) result=eat;
//            else if (!temp.contains(coupon)) result=eat+1;
//        }
//        System.out.println(result);
//    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //접시 수, 초밥 종류, 연속접시 수, 쿠폰번호
        StringTokenizer st = new StringTokenizer(br.readLine());
        int plate = Integer.parseInt(st.nextToken());
        int kinds = Integer.parseInt(st.nextToken());
        int cnt = Integer.parseInt(st.nextToken());
        int coupon = Integer.parseInt(st.nextToken());

        int[] eat = new int[kinds+1];
        int[] arr = new int[plate];
        int max=0, total=0;

        //plate 세팅
        for(int i=0; i<plate; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        //연속접시 수만큼 초밥 먹기
        for (int i = 0; i < cnt; i++) {
            if (eat[arr[i]] == 0) total++;
            eat[arr[i]]++;
        }

        //plate 세팅 돌면서 초밥 먹기
        for(int i=1; i<plate; i++) {
            //먹은 초밥이 최대 수보다 클 때
            if(max<=total){
                if(eat[coupon]==0){
                    max=total+1;
                }else {
                    max=total;
                }
            }

            //먹은 초밥 중 가장 처음에 먹은 초밥 -1
            eat[arr[i-1]]--;
            if(eat[arr[i-1]]==0) total--;
            //다음초밥 계산
            if(eat[arr[(i+cnt-1)%plate]]==0) total++;
            eat[arr[(i+cnt-1)%plate]]++;
        }
        System.out.println(max);
    }
}
