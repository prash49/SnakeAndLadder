package com.bridglabz.snakeladder;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int position = 0;
        int IS_SNAKE = 1;
        int IS_LADDER = 2;
        int WINNING_POSITION = 100;
        int diceCount =0;

        while (position < WINNING_POSITION) {
            diceCount++;

            int diceNumber = (int) (Math.floor(Math.random() * 10) % 6 + 1);

            int option = (int) (Math.floor(Math.random() * 10) % 2 + 1);

            if (option == IS_SNAKE) {
                System.out.println("Snake for the Player");
//                position -= diceNumber;
//                if (position < 0) {
//                    position = 0;
//                }
                if ( position - diceNumber > 0){
                    position -= diceNumber;
                }
            } else if (option == IS_LADDER) {
                System.out.println("ladder for the player");
                position += diceNumber;
                if(position > 100){
                    position -= diceNumber;
                }
            } else {
                System.out.println("No Play for the Player");
            }
            System.out.println("dice: "+diceNumber);
            System.out.println("Dice count :"+diceCount);
            System.out.println("Position " + position);
        }
    }
}
