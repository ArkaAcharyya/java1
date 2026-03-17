package string;

import java.util.Arrays;

public class Manipulate {

	public static void print(String str) {
        int[] arr = new int[26];
        int[] visited = new int[26];
        Arrays.fill(visited, 1);

        StringBuilder str1 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'a']++; 
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = ch - 'a';

            if (arr[idx] == 1) {
                str1.append(ch);
            } else {
                visited[idx]++;
                for (int j = 0; j < visited[idx]; j++) {
                    str1.append(ch);
                }
            }
        }

        System.out.println("Original string is: " + str);
        System.out.println("Modified string is: " + str1.toString());
    }

    public static void main(String[] args) {
        String str = "assassinate";
        print(str);
    }

}
