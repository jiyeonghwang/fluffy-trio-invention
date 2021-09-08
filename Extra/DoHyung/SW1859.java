package DoHyung;

import java.util.Scanner;

public class SW1859 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<n;i++) {
            int days = sc.nextInt();
            int[] prices = new int[days];

            for (int j=0;j<days;j++) {
                prices[j] = sc.nextInt();
            }

            long sum = 0;
            int index = days-2;
            int highest = prices[days-1];
            while (index >= 0) {
                if (highest > prices[index]) {
                    sum+=(highest - prices[index]);
                } else {
                    highest = prices[index];
                }
                index--;
            }

            sb.append("#").append(i+1).append(" ").append(sum).append("\n");
        }

        System.out.println(sb);
    }
}
