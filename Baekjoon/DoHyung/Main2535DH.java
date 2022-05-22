package DoHyung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main2535DH {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Record[] arr = new Record[n];
        for (int i=0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = new Record(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(arr);

        int[] countryCnt = new int[n];
        int count = 0;
        int idx = 0;
        while (count < 3) {
            if (countryCnt[arr[idx].country] < 2) {
                System.out.println(arr[idx].country+" "+arr[idx].number);
                countryCnt[arr[idx].country]++;
                count++;
            }
            idx++;
        }

    }
}

class Record implements Comparable<Record> {
    public int country;
    public int number;
    public int score;

    public Record(int country, int number, int score) {
        this.country = country;
        this.number = number;
        this.score = score;
    }

    @Override
    public int compareTo(Record r) {
        return r.score-this.score;
    }

    @Override
    public String toString() {
        return country+" "+number+" "+score;
    }
}

