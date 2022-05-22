package DoHyung;

public class Main4673DH {
    public static void main(String[] args) {
        int[] nums = new int[10001];
        for (int i=1;i<=10000;i++) {
            try {
                nums[d(i)] = 1;
            } catch (IndexOutOfBoundsException e) {
                continue;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i=1;i<=10000;i++) {
            if (nums[i]!=1) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb.toString());
    }

    public static int d(int num) {
        int sum = num;
        while (num != 0) {
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}
