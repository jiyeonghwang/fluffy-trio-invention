package JiYeong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main2979JY {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] charge = br.readLine().split(" ");
//        int one = Integer.parseInt(charge[0]);
//        int two = Integer.parseInt(charge[1]);
//        int three = Integer.parseInt(charge[2]);
//
//        List<int[][]> truckList = new ArrayList<>();
//        int readCount = 0;
//        while (readCount < 3) {
//            String[] arr = br.readLine().split(" ");
//            int[][] tempTrunk = new int[1][2];
//            tempTrunk[0][0] = Integer.parseInt(arr[0]);
//            tempTrunk[0][1] = Integer.parseInt(arr[1]);
//            truckList.add(tempTrunk);
//            readCount++;
//        }
//
//        int total = truckList.get(truckList.size()-1)[0][1]+1;
//        int[] truckCount = new int[total];
//        for (int i=1; i<total; i++) {
//            int count = 0;
//            for (int j=0; j<truckList.size(); j++) {
//                if ( i > truckList.get(j)[0][0] && i <= truckList.get(j)[0][1]) {
//                    count++;
//                }
//            }
//            truckCount[i] = count;
//        }
//
//        int result = 0;
//        for (int i=0; i<total; i++) {
//            if (truckCount[i] == 1) result += one * 1;
//            if (truckCount[i] == 2) result += two * 2;
//            if (truckCount[i] == 3) result += three * 3;
//        }
//
//        System.out.println(result);
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int A = Integer.parseInt(st.nextToken());	// 1대 요금
        int B = Integer.parseInt(st.nextToken());	// 2대 요금
        int C = Integer.parseInt(st.nextToken());	// 3대 요금
        int first = 101; // 가장 먼저 주차장에 도착한 트럭의 시간
        int last = 0;	 // 가장 늦게 주차장에 도착한 트럭의 시간
        int[][] truck = new int[3][2];
        int[] arr = new int[100];
        int fee = 0;

        /* 입력받기 */
        for(int i=0; i<3; i++) {
            st = new StringTokenizer(bf.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            truck[i][0] = start;
            truck[i][1] = end;

            for(int j=start; j<end; j++) {
                arr[j] ++;
            }
        }

        for(int i=0; i<3; i++) {
            for(int j=0; j<2; j++) {
                if(truck[i][j] < first)	first = truck[i][j];
                if(truck[i][j] > last)	last = truck[i][j];
            }
        }

        for(int i=first; i<last; i++) {
            fee += (arr[i] == 1) ? arr[i] * A : 0;
            fee += (arr[i] == 2) ? arr[i] * B : 0;
            fee += (arr[i] == 3) ? arr[i] * C : 0;
        }

        System.out.println(fee);
        bf.close();
    }
}
