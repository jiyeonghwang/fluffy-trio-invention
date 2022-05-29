package Jisu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main112836JS {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong(), query = scanner.nextLong();

        Map<Long, Long> map = new HashMap<>();

        long idx = 1;
        while(idx<=query){
            int category = scanner.nextInt();
            long p = scanner.nextLong();
            if (category == 1){
                long x = scanner.nextLong();
                map.put(p, map.getOrDefault(p, 0L)+x);
            } else{
                long q = scanner.nextLong();
                long result = 0;
                for(long i=p; i<=q; i++){
                    result += map.getOrDefault(i, 0L);
                }
                System.out.println(result);
            }
            idx+=1;
        }
    }
}
