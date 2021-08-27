package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main2531DH {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int dishOnRail = Integer.parseInt(st.nextToken());
        st.nextToken();
        int consecutive = Integer.parseInt(st.nextToken());
        String coupon = st.nextToken();

        String[] rail = new String[dishOnRail];
        for (int i=0;i<dishOnRail;i++) {
            rail[i] = br.readLine();
        }

        HashMap<String, Integer> eaten = new HashMap<String, Integer>();
        int max = 0;

        //initial
        for (int i=0;i<consecutive;i++) {
            if (eaten.containsKey(rail[i])) {
                eaten.put(rail[i], eaten.get(rail[i])+1);
            } else {
                eaten.put(rail[i], 1);
            }
        }
        //add coupon
        if (eaten.containsKey(coupon)) {
            eaten.put(coupon, eaten.get(coupon)+1);
        } else {
            eaten.put(coupon, 1);
        }

        //count
        if (max < eaten.size()) {
            max = eaten.size();
        }

        for (int i=1;i<dishOnRail;i++) {
            //remove previous
            if (eaten.get(rail[i-1]) == null || eaten.get(rail[i-1]) == 1) {
                eaten.remove(rail[i-1]);
            } else {
                eaten.put(rail[i-1], eaten.get(rail[i-1])-1);
            }

            //add next
            int index = i+consecutive-1;
            if (index > dishOnRail-1) {
                index -= dishOnRail;
            }

            if (eaten.containsKey(rail[index])) {
                eaten.put(rail[index], eaten.get(rail[index])+1);
            } else {
                eaten.put(rail[index], 1);
            }

            //count
            if (max < eaten.size()) {
                max = eaten.size();
            }
        }
        System.out.println(max);
    }
}
