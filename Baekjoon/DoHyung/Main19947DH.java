package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main19947DH {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer input = new StringTokenizer(br.readLine());
        int money = Integer.parseInt(input.nextToken());
        int year = Integer.parseInt(input.nextToken());

        double planA = 0.0d, planB = 0.0d, planC = 0.0d;
        if (year-1 >= 0) {
            planA = invest(money, year-1, 'A');

            if (year-3 >= 0) {
                planB = invest(money, year-3, 'B');

                if (year-5 >= 0) {
                    planC = invest(money, year-5, 'C');
                }
            }
        }

        double answer = Math.max(planA, Math.max(planB, planC));
        System.out.println(Double.valueOf(answer).intValue());
    }

    public static double invest(double money, int year, char type) {
        if (year < 0) {
            return money;
        }

        if (type == 'A') {
            money += Math.floor(money/100d*5);
        } else if (type == 'B') {
            money += Math.floor(money/100d*20);
        } else {
            money += Math.floor(money/100d*35);
        }

        if (year == 0) {
            return money;
        }


        double planA = (year-1>=0)?invest(money, year-1, 'A'):money;
        double planB = (year-3>=0)?invest(money, year-3, 'B'):money;
        double planC = (year-5>=0)?invest(money, year-5, 'C'):money;

        return Math.max(planA, Math.max(planB, planC));
    }
}
