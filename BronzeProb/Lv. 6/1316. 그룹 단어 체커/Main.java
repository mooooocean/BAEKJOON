package BronzeProb.Lv6.그룹단어체커;

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int s = 0;

        for (int i = 0; i < N; i++) {
            String S = sc.next();
            boolean check[] = new boolean[26];
            boolean tmp = true;

            for (int j = 0; j < S.length(); j++) {
                int index = S.charAt(j) - 'a';
                if(check[index]) {
                    if(S.charAt(j) != S.charAt(j - 1)) {
                        tmp = false;

                        break;
                    }
                } else {
                    check[index] = true;
                }
            }
            if(tmp) s++;
        }
        System.out.println(s);
    }
}