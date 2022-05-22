package Jisu;

public class Main4673JS {
    public static int makeConstructor(int num) {
        int constructor = num;
        for(char x:String.valueOf(num).toCharArray()){
            constructor += Integer.parseInt(String.valueOf(x));
        }
        return constructor;
    }
    public static void main(String[] args) throws Exception{
        boolean[] check = new boolean[10001];
        for(int i=1; i<=10000; i++){
            int constructor = makeConstructor(i);
            if (constructor <= 10000) check[constructor] = true;
            if (!check[i]) System.out.println(i);
        }
    }
}
