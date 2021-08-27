package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main7785JS {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        HashSet<String> people = new HashSet<>(num);
        for (int i =0; i<num; i++){
            st = new StringTokenizer(br.readLine());
            String person = st.nextToken();
            String access = st.nextToken();
            if (access.equals("enter")) people.add(person);
            else people.remove(person);
        }

        List<String> peopleList = new ArrayList<>(people);
        peopleList.sort(Collections.reverseOrder());
        for (String x:peopleList){
            sb.append(x).append("\n");

        }
        System.out.print(sb);
    }
}
