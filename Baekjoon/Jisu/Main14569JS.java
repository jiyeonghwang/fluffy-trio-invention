package Jisu;

import java.io.InputStreamReader;
import java.util.*;

public class Main14569JS {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new InputStreamReader(System.in));
        int n = sc.nextInt();
        sc.nextLine();
        Map<Integer, List<Integer>> subjectMap = new HashMap<>();
        for(int i =0; i<n; i++){
            int k = sc.nextInt();
            List<Integer> subjectTime = new ArrayList<>();
            for(int j=0; j<k; j++) subjectTime.add(sc.nextInt());

            subjectMap.put(i, subjectTime);
            sc.nextLine();
        }

        int m = sc.nextInt();
        sc.nextLine();
        Map<Integer, List<Integer>> studentMap = new HashMap<>();
        for(int i=0; i<m; i++){
            int p = sc.nextInt();
            List<Integer> studentTime = new ArrayList<>();
            for(int j=0; j<p; j++) studentTime.add(sc.nextInt());

            studentMap.put(i, studentTime);
            sc.nextLine();
        }

        for(int i =0; i<m; i++){
            List<Integer> studentTime = studentMap.get(i);
            int count = 0;

            for (int j=0; j<n; j++){
                List<Integer> subjectTime = subjectMap.get(j);
                boolean flag = true;

                for (Integer integer : subjectTime) {
                    if (!studentTime.contains(integer)) {
                        flag = false;
                        break;
                    }
                }
                if(flag) count+=1;
            }
            System.out.println(count);
        }
    }
}
