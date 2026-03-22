package project_1_quis;

// No need to import classes in the same dir but a good practices
//import project_1_quis.*; // This is optional as this main is also in the same package
public class Main{
    public static void main(String[] args) {
        Quis_services quiz = new Quis_services(); // Fixed object creation
        quiz.start_the_quis(); // Fixed method call
    }
}
