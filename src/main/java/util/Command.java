package util;

import java.util.Scanner;

public class Command {
    static Scanner keyboard = new Scanner(System.in);
    static String person = null;

    public static String login(){
        System.out.println("Please enter your account: ");
        keyboard.nextLine();
        System.out.println("Please enter your password");
        return keyboard.nextLine();
    }

    /**
     *
     * @return 0 for quit, 1 for move on
     */
    public static void getDataStu(){
        System.out.println("what do you want to do?");
        System.out.println("1.quiz score 2.exam score 3.final score 4.average score 5.median score 6.ranking");
        int i = keyboard.nextInt();
        switch (i) {
            case 1 :
                System.out.println("quiz 1 : 88");
                System.out.println("quiz 2 : 92");
                System.out.println("quiz 3 : 75");
                System.out.println("quiz 4 : 100");
                break;
            case 2 :
                System.out.println("exam 1 : 76");
                System.out.println("exam 1 : 95");
                break;
            case 3 :
                System.out.println("final : 90");
                break;
            case 4 :
                System.out.println("average score of the class : 85.7");
                break;
            case 5 :
                System.out.println("median score of the class : 84.5");
                break;
            case 6 :
                System.out.println("your ranking in class is : 12");
                break;
        }

        System.out.println("What's next? 1.main page 2.quit");
        int j = keyboard.nextInt();
        switch (j) {
            case 1 :
                getDataStu();
                break;
            case 2 :
                break;
        }
    }

    public static void run(){
        person = login();
        if ("teacher".equals(person)) { //teacher
            System.out.println("teacher's feature is going to be designed...");
        } else { //student
            getDataStu();
        }

    }}
