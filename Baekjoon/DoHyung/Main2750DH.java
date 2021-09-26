package DoHyung;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2750DH {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int min;
        for (int i=0;i<n;i++) {
            min = i;
            for (int j=i+1;j<n;j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            int tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }

        /*
        int key, j;
		for (int i=1;i<n;i++) {
			key = arr[i];
			for (j=i-1;j>=0;j--) {
				if (arr[j] > key) {
					arr[j+1] = arr[j];
				} else {
					break;
				}
			}
			arr[j+1] = key;
		}
		*/

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<n;i++) {
            sb.append(arr[i]).append("\n");
        }

        System.out.println(sb);
    }
}
