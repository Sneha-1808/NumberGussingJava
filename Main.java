package com.snehajava;

import java.util.Random;
import java.util.Scanner;

class Game{
    int r;
    int userInput;
    int count=0;
    boolean ans=true;

    public void setUserInput(){
        System.out.println("Guess the number between 0-100: ");
        Scanner sr= new Scanner(System.in);
        userInput=sr.nextInt();
    }

    public Game(){
        Random rand=new Random();
        r=rand.nextInt(100);

    }

    public void toCheck(){
        count++;
        if(userInput==r){
            System.out.println("Congrats!! you guessed the correct number");
            System.out.println("You took "+count+" attempts to guess.");
            ans=false;
        }
        else if(userInput>r){
            System.out.println("Guessed number is too high!!");
            ans=true;
        }
        else{
            System.out.println("Guessed number is too low!!");
            ans=true;
        }
    }

    public boolean bool(){
        return ans;
    }


}

public class Main{
    public static void main(String[] args){
        Game g=new Game();
        boolean b=true;
        while(b) {
            g.setUserInput();
            g.toCheck();
            b = g.bool();
        }
    }
}
