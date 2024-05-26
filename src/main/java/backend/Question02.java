package backend;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Question02 {
    public static void Question2(){
        Stack<String> interview = new Stack<>();
        interview.push("Nguyễn Văn Nam");
        interview.push("Nguyễn Văn Huyên");
        interview.push("Trần Văn Nam");
        interview.push("Nguyễn Văn A");
        PrintInterview(interview);
    }
    private static void PrintInterview(Stack<String> interview) {
        System.out.println("Thu tu danh sach pv");
        while (!interview.empty()) {
            System.out.println(interview.pop());
        }

    }

}
