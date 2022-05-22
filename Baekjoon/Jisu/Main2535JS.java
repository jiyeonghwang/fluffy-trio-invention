package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main2535JS {
    public static class Student {
        int nationNum;
        int studentNum;
        public Student(int nationNum, int studentNum){
            this.nationNum = nationNum;
            this.studentNum = studentNum;
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Map<Integer, Student> studentMap = new TreeMap<>(Comparator.reverseOrder());
        Map<Integer, Integer> medalMap = new TreeMap<>(Comparator.reverseOrder());

        for (int i=0; i<n; i++){
            String[] input = br.readLine().split(" ");
            int nationNum = Integer.parseInt(input[0]);
            int studentNum = Integer.parseInt(input[1]);
            int score = Integer.parseInt(input[2]);
            Student student = new Student(nationNum, studentNum);

            studentMap.put(score, studentMap.getOrDefault(score, student));
        }

        boolean gold = false, silver = false, bronze = false;
        for(Map.Entry<Integer, Student> student : studentMap.entrySet() ){
            int nationNum = student.getValue().nationNum;
            int studentNum = student.getValue().studentNum;
            if(! gold) {
                medalMap.put(nationNum, medalMap.getOrDefault(nationNum, 0)+1);
                System.out.println(nationNum +" "+studentNum);
                gold = true;
            }
            else if(! silver) {
                medalMap.put(nationNum, medalMap.getOrDefault(nationNum, 0)+1);
                System.out.println(nationNum +" "+studentNum);
                silver = true;
            }
            else if(! bronze) {
                if (medalMap.containsKey(nationNum) && medalMap.get(nationNum) >=2) continue;
                medalMap.put(nationNum, medalMap.getOrDefault(nationNum, 0)+1);
                System.out.println(nationNum +" "+studentNum);
                bronze = true;
            } else break;
        }


    }
}
