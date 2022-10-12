package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main17479JS {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] menu = br.readLine().split(" ");
        int A = Integer.parseInt(menu[0]), B = Integer.parseInt(menu[1]), C = Integer.parseInt(menu[2]);

        Map<String, Long> normalMenuMap = new HashMap<>();   //일반
        Map<String, Long> specialMenuMap = new HashMap<>();  //특별
        String[] serviceMenuList = new String[C];  //서비스

        for(int i=0; i<A; i++){
            String[] normalMenu = br.readLine().split(" ");
            normalMenuMap.put(normalMenu[0], Long.parseLong(normalMenu[1]));
        }
        for(int i=0; i<B; i++){
            String[] specialMenu = br.readLine().split(" ");
            specialMenuMap.put(specialMenu[0], Long.parseLong(specialMenu[1]));
        }
        for(int i=0; i<C; i++){
            String[] serviceMenu = br.readLine().split(" ");
            serviceMenuList[i] = serviceMenu[0];
        }

        int N = Integer.parseInt(br.readLine());
        long normalPrice = 0, specialPrice = 0;
        int serviceCount = 0;
        for(int i=0; i<N; i++){
            String order = br.readLine();
            if(normalMenuMap.containsKey(order)) normalPrice += normalMenuMap.get(order);
            else if (specialMenuMap.containsKey(order)) specialPrice += specialMenuMap.get(order);
            else serviceCount += 1;
        }

        if (normalPrice < 20000 && specialPrice > 0) System.out.println("No");
        else if(serviceCount > 1) System.out.println("No");
        else if (normalPrice + specialPrice < 50000 && serviceCount > 0) System.out.println("No");
        else System.out.println("Okay");
    }
}
