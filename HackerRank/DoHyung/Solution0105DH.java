import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Solution0105DH {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stream<String> input = br.lines();

        Iterator iter = input.iterator();
        while (iter.hasNext()) {
            String[] parts = ((String)iter.next()).split(";");

            StringBuilder sb = new StringBuilder();
            if (parts[0].equals("S")) {
                if (parts[1].equals("M") || parts[1].equals("V")) {
                    for (char c:parts[2].toCharArray()) {
                        if (c >= 'A' && c <= 'Z') {
                            sb.append(" "+Character.toLowerCase(c));
                        } else if (c >= 'a' && c <= 'z'){
                            sb.append(c);
                        }
                    }
                } else if (parts[1].equals("C")) {
                    char[] className = parts[2].toCharArray();
                    sb.append(Character.toLowerCase(className[0]));
                    for (int i=1;i<className.length;i++) {
                        char c = className[i];
                        if (c >= 'A' && c <= 'Z') {
                            sb.append(" "+Character.toLowerCase(c));
                        } else if (c >= 'a' && c <= 'z'){
                            sb.append(c);
                        }
                    }
                }
            } else {
                String[] words = parts[2].split(" ");
                if (parts[1].equals("C")) {
                    for (String word:words) {
                        sb.append(Character.toUpperCase(word.charAt(0)));
                        sb.append(word.substring(1));
                    }
                } else {
                    sb.append(words[0]);
                    for (int i=1;i<words.length;i++) {
                        sb.append(Character.toUpperCase(words[i].charAt(0)));
                        sb.append(words[i].substring(1));
                    }
                    if (parts[1].equals("M")) {
                        sb.append("()");
                    }
                }
            }

            System.out.println(sb);
        }
    }
}
