/*
 * 2023.02.15.수
 * 10430번 나머지
 *
 * 1일 1알고리즘 JAVA 다시 시작!
 * 손풀기로 쉬운 문제들을 풀어보자 (단계별로 풀어보기 - 입출력과 사칙연산)
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_10430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] ABC = br.readLine().split(" ");
        int A = Integer.parseInt(ABC[0]);
        int B = Integer.parseInt(ABC[1]);
        int C = Integer.parseInt(ABC[2]);

        System.out.println((A+B) % C);
        System.out.println(((A%C) + (B%C)) %C);
        System.out.println((A*B) % C);
        System.out.println(((A%C) * (B%C)) % C);
    }
}
