package JiYeong;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main10815JY {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> tgList = new ArrayList<>();
        int tgCnt = 0, l=0, r=0, mid=0;

        tgCnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            tgList.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(tgList);
        StringBuilder sb = new StringBuilder();

        br.readLine();
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int temp = Integer.parseInt(st.nextToken());
            l = 0;
            r = tgCnt-1;
            while(l <= r){
                mid = (l+r) / 2;
                int target = temp;
                if (tgList.get(mid) == target){
                    sb.append(1+" ");
                    break;
                } else if(tgList.get(mid) > target){
                    r = mid-1;
                } else {
                    l = mid+1;
                }
                if (l>r) {
                    sb.append(0+" ");
                }
            }
        }
        System.out.println(sb);
    }
}
