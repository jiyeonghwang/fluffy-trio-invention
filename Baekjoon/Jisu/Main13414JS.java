package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main13414JS {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] testData = br.readLine().split(" ");
        int k = Integer.parseInt(testData[0]), l = Integer.parseInt(testData[1]);

        Set<String> studentSet = new LinkedHashSet<>();
        for(int i=0; i<l; i++){
            String studentId = br.readLine();
            if (studentSet.contains(studentId)) studentSet.remove(studentId);
            studentSet.add(studentId);
        }

        int count = 0;
        ArrayList<String> studentList = new ArrayList<>(studentSet);
        for(String studentId:studentList){
            if (count < k) System.out.println(studentId);
            else break;
            count++;
        }
    }
}
