package com.company;

import java.util.HashMap;
import java.util.Scanner;


class Notes {
    private final Scanner scanner = new Scanner(System.in);
    HashMap<String,String> glossary = new HashMap<String,String>();

    public Notes(){}
    
    public void run(){
        String questionText = "What do you want from me?";
        String userAnswer;

        while (true){
            System.out.println(questionText);
            userAnswer = scanner.nextLine();
            if (userAnswer.equals("write")){
                write();
            } else if (userAnswer.equals("read")){
                read();
            } else if (userAnswer.equals("quit")){
                break;
            }
        }
    }
    private void write() {
        String keyWord;
        String valueWord;
        System.out.println("What should I rememberKeyWord?");
        keyWord = scanner.nextLine();
        valueWord = scanner.nextLine();
        glossary.put(keyWord, valueWord);
    }
    private void read() {
        String keyWord;
        String programRepeatTextToRead = "Yes, your value is: ";
        String programReactionForUnKnowText = "Now, I do not know it";
        System.out.println("What should I read");
        Scanner getKeyWord = scanner;
        keyWord = getKeyWord.nextLine();
        System.out.println(keyWord);
        if (glossary.containsKey(keyWord)){
            System.out.println(programRepeatTextToRead + glossary.get(keyWord));
        } else{
            System.out.println(programReactionForUnKnowText);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Notes notes = new Notes();
        notes.run();
    }
}
