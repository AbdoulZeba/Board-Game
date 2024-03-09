/*Abdoul H. Zeba
 * 10/02/2022
 * Comp167 section 01
 * This program is designed to create a board game with 2d array.
 */


import java.util.Random;
import  java.util.Scanner;

public class abdoulzeba_AggieGame {

    //This method check each row of the 2d array if any 4 consecutive Xs are found, it returns true.
    public static boolean checkIfconsecutive(char[] board){
        int c = 0; // position of each element
        int count = 0; // count holds the value of consecutive Xs
        
        while( c < 10){ 
                
            if (board[c] == 'X'){ // if element at position c is equal to X, count is incremented

                count+=1;
                c+=1;
                
            }
            //if the next element is not X then the else statement executes
            else{
                if (count >= 4){ // if 4 consecutive Xs was already found, then the function returns true
                    return true;
                }

                else{       //otherwise count is set to zero to check the next consecutive Xs.
                count = 0;  
                c +=1;
                
                }
                
            }
            
        }

        return false; //the function returns false if none of the conditions are executed

    }



    public static boolean   checkIfconsecutive(char[][] board){
        int j = 0; //number of clomuns
        int count = 0;
        int i;
        while (j <= 9){ 
            i = 9; 

            while(i>=0){ // this loop check the current column c
                if (board[i][j] == 'X'){ // if current element at column c is equal to X, count is incremnted
                    count+=1;
                    i-=1;
                }
                else{       //if the next element in the column is not, this statement exceute
                    if (count >= 4){ // if 4 consecutive Xs was already found, then the function returns true

                        return true;
                    }
                    count = 0; // else count is set back to zero to check the next elements
                    i-=1;

                }

            }

            j+=1;

        }
       
        if (count >= 4){
            
            return true; // if 4 consecutive Xs was already found, then the function returns true
        }

        return  false; //the function returns false if none of the conditions are executed


    }

    //This method check if there is any 4 consecutive Xs in any direction diagonally.
    public static boolean checkIfconsecutiveDiagonally(char[][] board){

        //the first while loop iterate through the board diagonally from top left corner to the middle of the board.
        int i; 
        int j;
        int k = 3; //k represent the number of of diagonal lines where 4 consecutive Xs are possible.
        int count = 0; //count keep track of the number of X's found 

        while(k <= 9){ 
            i = k;  
            j = 0;

            while(j <= k && i>=0){  // this loop keeps track of every elements in diagonal k.
                
                if (board[i][j] == 'X'){ // if any element X is found,then count is incremnented.
                    
                    count+=1;
                    i-=1;
                    j+=1;
                }
                else{             //if count was already 4 before reaching a non-X element, the function returns true.
                    if (count>=4 ){
                        return true;
                    }
                    count = 0; //otherwise count is set back  to 0 and the loop increments to check the next elements in 
                    i-=1;      // in the current diagonal line.
                    j+=1;
                }
            }

            if (count>=4 ){  //after the diagonal line  k is checked and 4 consecutive Xs were found, then the function returns true 
                return true;
            } 

            count = 0; //otherwise count is set back to 0 and k is incremented to check the next diagonal line elements.
            k+=1;         

        }
       
        //if no consecutive Xs were found in the previous iterations
        // This loop iterate through the board diagonally from the middle of the board to bottom right.
        int i2;
        int j2;
        int k2 = 1;

        while(k2 <= 9){
            i2 = k2;
            j2 = 9;

            while(j2 >= k2 && i2>=0){ // this loop keeps track of every elements in diagonal k2.
                
                if (board[i2][j2] == 'X'){ // if any element X is found,then count is incremnented.
                   
                    count+=1;
                    i2+=1;
                    j2-=1;
                }
                else{
                    if (count>=4 ){
                        return true;
                    }   //if count was already 4 before reaching a non-X element, the function returns true.
                        
                    count = 0; //otherwise count is set back  to 0 and the loop increments to check the next elements 
                    i2+=1;      // in the current diagonal line k2.
                    j2-=1;
                }
            }

            if (count>=4 ){  //after the diagonal line  k2 is checked and 4 consecutive Xs were found, then the function returns true 
                return true;
            } 
            count = 0;
            k2+=1;        //otherwise count is set back to 0 and k2 is incremented to check the next diagonal line elements.

        }
    
        //if no consecutive Xs were found in the previous iterations
        // This loop iterate through the board diagonally from the bottom left to the middle
        int i3;
        int j3;
        int k3 = 0;

        while(k3 <= 9){ // this loop keeps track of every elements in diagonal k3.
            i3 = k3;
            j3 = 0;

            while(i3<=9){
                
                if (board[i3][j3] == 'X'){ // if any element X is found,then count is incremnented.
                    
                    count+=1;
                    i3+=1;
                    j3+=1;
                }
                else{
                    if (count>=4 ){ 
                        return true; //if count was already 4 before reaching a non-X element, the function returns true.
                    }
                    count =0; //otherwise count is set back  to 0 and the loop increments to check the next elements 
                    i3+=1; // in the current diagonal line k3.
                    j3+=1;
                }
            }

            if (count>=4 ){  //after the diagonal line  k3 is checked and 4 consecutive Xs were found, then the function returns true 
                return true;
            } 
            count = 0;
            k3+=1;       //otherwise count is set back to 0 and k3 is incremented to check the next diagonal line elements.

        }
    
        //if no consecutive Xs were found in the previous iterations
        // This loop iterate through the board diagonally from the middle to top right
        int i4;
        int j4;
        int k4 = 0;

        while(k4 <= 9){ // this loop keeps track of every elements in diagonal k4.
            i4 = k4;
            j4 = 9;

            while(i4>=0){
                
                if (board[i4][j4] == 'X'){ // if any element X is found,then count is incremnented.
                    
                    count+=1;
                    i4-=1;
                    j4-=1;
                }
                else{
                    if (count>=4 ){
                        return true; //if count was already 4 before reaching a non-X element, the function returns true.
                    }
                    count = 0; //otherwise count is set back  to 0 and the loop increments to check the next elements 
                    i4-=1;    // in the current diagonal line k4.
                    j4-=1;
                }
            }

            if (count>=4 ){  //after the diagonal line  k4 is checked and 4 consecutive Xs were found, then the function returns true 
                return true;
            } 
            count = 0;
            k4+=1;     //otherwise count is set back to 0 and k4 is incremented to check the next diagonal line elements.

        }
    
        return false; //after all possible cases of consecutive Xs are checked diagonally, and none is found, 
                    //the function returns false

    }




    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        char[][] board = new char[10][10];
        int i;
        int j;
        int numTimesPlayed = 0; //this variable keeps track of how many times the loop execute to
                                //help determine the winner of the game

        Random rand = new Random();
        int row ;
        int column ;
        int playerTwoRow ;
        int playerTwoColumn = 0;
        boolean gameOn = true;

        for(i = 0; i<10; ++i){
            for(j = 0; j < 10; ++j){
                board[i][j] = '_';
            }
        }
        
        System.out.println();
        System.out.println("Welcome to Aggie Game!!");
        System.out.println();
        System.out.print("Enter mode: 1 for solo or 2 for multiplayer: ");
        int mode = scnr.nextInt();
        System.out.println();
      
       
        
        while (gameOn){
            if (mode == 1){

                System.out.println("Player 1");
                System.out.println("Where would you like to play next?: ");
                System.out.print("Enter row number (1-10): ");
                row = scnr.nextInt(); //user row choice to store x
                System.out.print("Enter column number(1-10): ");
                column = scnr.nextInt(); //user column choice to store x
                board[row-1][column-1] ='X';

                for(i = 0; i<10; ++i){
                    for(j = 0; j<10; ++j){
                        System.out.print(board[i][j]+" ");  //this displays the board
                    }
                    System.out.println();

                }
              

                playerTwoRow = rand.nextInt(9); //computer row choice to store x
                playerTwoColumn = rand.nextInt(9);// computer column choice to store x

                board[playerTwoRow][playerTwoColumn] ='X';
                System.out.println("Computer played at row "+(playerTwoRow+1)+" and column "+(playerTwoColumn+1));

                
                for(i = 0; i<10; ++i){
                    for(j = 0; j<10; ++j){
                        System.out.print(board[i][j]+" ");  //this displays the board
                    }
                    System.out.println();

                }
                
                

                for(i = 0; i < 10; ++i){
                   
                    if (checkIfconsecutive(board[i])){ //if any 4 consecutive Xs are made horizontally,the loop exits
                        gameOn = false;
                        
                    }
                    
                }

                if (checkIfconsecutive(board)){ //if any 4 consecutive Xs are made vertically,the loop exits
                    gameOn = false;
                    
                }
                if(checkIfconsecutiveDiagonally(board)){ //if any 4 consecutive Xs are made diagonally,the loop exits
                    gameOn = false;
                   
                }

            }

            else if (mode == 2){ //multipler mode

                System.out.println("Player 1");
                System.out.println("Where would you like to play next?: ");

                System.out.print("Enter row number (1-10): ");
                row = scnr.nextInt(); //user row choice to store x

                System.out.print("Enter column number (1-10): ");
                column = scnr.nextInt(); //user column choice to store x

                board[row-1][column-1] ='X';
                System.out.println("Player 1 played at row "+(row)+" and column "+(column));

                System.out.println();
                for(i = 0; i<10; ++i){
                    for(j = 0; j<10; ++j){
                        System.out.print(board[i][j]+" ");  //this displays the board
                    }
                    System.out.println();

                }
                //numTimesPlayed+=1;
                

                for(i = 0; i < 10; ++i){
                    if (checkIfconsecutive(board[i])){ //if any 4 consecutive Xs are made horizontally,the loop exits
                        gameOn = false;
                    }
                    
                }

                if (checkIfconsecutive(board)){ //if any 4 consecutive Xs are made vertically,the loop exits
                    gameOn = false;
                }
                else if(checkIfconsecutiveDiagonally(board)){ //if any 4 consecutive Xs are made diagonally,the loop exits
                    gameOn = false; 
                }
                
                
                else{ //otherwise player 2 proceeds on to play
                
                    System.out.println();
                    System.out.println("Player 2");
                    System.out.println("Where would you like to play next?: ");
                    System.out.print("Enter row number: ");
                    playerTwoRow = scnr.nextInt();
                    System.out.print("Enter column number: ");
                    playerTwoColumn = scnr.nextInt(); 

                    board[playerTwoRow-1][playerTwoColumn-1] ='X';
                    System.out.println("Player 2 played at row "+(playerTwoRow)+" and column "+(playerTwoColumn));
                    
                    
                    
                    for(i = 0; i<10; ++i){
                        for(j = 0; j<10; ++j){
                            System.out.print(board[i][j]+" ");  //this displays the board
                        }
                        System.out.println();

                    }
                    numTimesPlayed+=1; //numTimesPlayed is incremented
                    
                    for(i = 0; i < 10; ++i){
                        if (checkIfconsecutive(board[i])){  //if any 4 consecutive Xs are made horizontally,the loop exits
                           
                            gameOn = false;
                        }
                        
                    }

                    if (checkIfconsecutive(board)){  //if any 4 consecutive Xs are made vertically,the loop exits
                        gameOn = false;
                    }
                    else if(checkIfconsecutiveDiagonally(board)){ //if any 4 consecutive Xs are made diagonaally,the loop exits
                        gameOn = false;
                    }
            
                }


            }
            
        }

        System.out.println();
        for(i = 0; i<10; ++i){
            for(j = 0; j<10; ++j){
                System.out.print(board[i][j]+" ");  //this displays the board
            }
            System.out.println();

        }
        System.out.println();
        System.out.println("Game over!!"); // The game is  over after the loop exits
        System.out.println();
        System.out.println(numTimesPlayed );
        if (numTimesPlayed == 0){ 
            System.out.println("Player 1 is the winner. Congratulation!!");
        }
        else if (numTimesPlayed % 2 == 0){ //if numTimesPlayed is even then  player 2 is the winner because the loop executed 
                                            //one more time
            System.out.println("Player 2 is the winner. Congratulation!!");
        }
        else{       //otherwies player 1 is the winner
            System.out.println("Player 1 is the winner. Congratulation!!");
        }
        System.out.println();

    }

}

