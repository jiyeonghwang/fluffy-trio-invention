package Jisu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main1713JS {
    public static class Student{
        int idx;
        int recommend;
        int period;
        public Student(int idx, int recommend, int period){
            this.idx = idx;
            this.recommend= recommend;
            this.period = period;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int picture = Integer.parseInt(br.readLine());
        int recommend = Integer.parseInt(br.readLine());
        int[] recommendArr = new int[recommend];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<recommend; i++){
            recommendArr[i] = Integer.parseInt(st.nextToken());
        }

        Queue<Student> queue = new LinkedList<>();
        for(int i=0; i<recommend; i++){
            boolean isDup = false;
            Student student = new Student(recommendArr[i], 1, i);
            for (Student x : queue) {
                if (student.idx == x.idx) {
                    x.recommend += 1;
                    isDup = true;
                    break;
                }
            }
            if (!isDup){
                if (queue.size() >= picture) {
                    PriorityQueue<Integer> minQueue = new PriorityQueue<>();
                    for (Student x : queue) minQueue.add(x.recommend);
                    int idx = 0;
                    int min = minQueue.poll();
                    for (int j = 0; j < picture; j++) {
                        Student innerStudent = queue.poll();
                        if (innerStudent.recommend == min) {
                            while (idx < queue.size()) {
                                queue.add(queue.poll());
                                idx += 1;
                            }
                            break;
                        } else {
                            queue.add(innerStudent);
                            idx += 1;
                        }
                    }
                }
                queue.add(student);
            }
        }

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        for(Student x:queue){
            priorityQueue.add(x.idx);
        }
        while (!priorityQueue.isEmpty()){
            sb.append(priorityQueue.poll()).append(" ");
        }
        System.out.println(sb);
    }
}
