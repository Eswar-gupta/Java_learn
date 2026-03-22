package project_1_quis;

import java.util.ArrayList;
import java.util.Scanner;

public class Quis_services{
    // Any varaible outside of fuction will be instances variable by deflaut
    ArrayList<Question> questions = new ArrayList<>();
    static int number_of_quis_services = 0;
    Quis_services(){

        questions.add(new Question(1, "size of int", "2", "6", "4", "8", 'C'));
        questions.add(new Question(2, "size of double", "2", "6", "4", "8", 'D'));
        questions.add(new Question(3, "size of char", "2", "6", "4", "8", 'A'));
        questions.add(new Question(4, "size of long", "2", "6", "4", "8", 'D'));
        questions.add(new Question(5, "size of boolean", "1", "2", "4", "8", 'A'));
        number_of_quis_services++;
    }

    Quis_services(ArrayList<Question> questions){
        if(questions.size() == 5){
            //questions = questions;
            this.questions = questions; // Fixing variable shadowing
            number_of_quis_services++;
        }else{
            System.out.println("Sorry number of questions is too high, can't fit in the quiz. Initializing default questions.");
        }
    }

    void start_the_quis(){
        System.out.println("Hello, welcome to the quiz! You will have 5 questions to answer.");
        Scanner sc1 = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            questions.get(i).display_question();
            System.out.print("Enter only the letter A, B, C, D: ");
            char ans = sc1.next().charAt(0);
            if(questions.get(i).verify_answer(ans)){
                System.out.println("Happy");
            }else{
                System.out.println("Sad");
            }
        }
    }
}