package programmers;

import java.util.Arrays;

public class looking_for_kim_seoul {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};

        String answer = "";
        int index = Arrays.asList(seoul).indexOf("Kim");
        answer = "김서방은 " + index + "에 있다";

        System.out.println(answer);
    }
}
