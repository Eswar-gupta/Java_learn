package project_1_quis;

import java.util.Scanner;

public class Question{
    int id;
    private String question;
    private String[] option = new String[4]; // Fixed array declaration
    private char final_ans;

    Question(int id, String question, String option_A, String option_B, String option_C, String option_D, char final_ans){
        this.id = id;
        this.question = question;
        this.option[0] = option_A;
        this.option[1] = option_B;
        this.option[2] = option_C;
        this.option[3] = option_D;
        this.final_ans = final_ans;
    }

    public void display_question(){
        System.out.println(question);
        System.out.println("A) " + option[0]);
        System.out.println("B) " + option[1]);
        System.out.println("C) " + option[2]);
        System.out.println("D) " + option[3]);
    }

    public boolean verify_answer(char ans) {
        return final_ans == ans;
    }
}