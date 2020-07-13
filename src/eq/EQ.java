/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eq;

/**
 *
 * @author Antonio
 */
public class EQ {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        GAME g = new GAME();
        g.setVisible(true);

        for(int i=0;i<8;i++){
            for (int j = 0; j < 8; j++) {
                positions[i][j] = 0;   
            }
        }
    }
    
    public static String setValue(int X, int Y, int queens){
        positions[X][Y] = 1;
        
        if (isWinner(checkGameX(0,0) && checkGameY(0,0) && checkGameD(X,Y),queens)) {
            return "Ganaste! :D";
        }else if(checkGameX(0,0) && checkGameY(0,0) && checkGameD(X,Y)){
            return "Jugando...";
        }else{
            return "Perdiste! :(";
        }
    }
 
    private static boolean isWinner(boolean iscorrect, int queens){
        
        if (iscorrect && queens == 8) {
            return true;
        }
        return false;
    }
    
    private static boolean checkGameX(int x,int countX){

        if (x < 8) {
                for (int i = 0; i < 8; i++) {
                    if (positions[x][i] == 1) {
                        countX = countX+1;
                        if (countX>1) {
                             return false;
                         }
                    }
                }
                return checkGameX(x+1,0);
            }else{
                return true;
            }
    }
    
    private static boolean checkGameY(int y,int countY){  
        if (y < 8) {
                for (int i = 0; i < 8; i++) {
                    if (positions[i][y] == 1) {
                        countY = countY+1;
                        if (countY>1) {
                             return false;
                         }
                    }
                }
                return checkGameY(y+1,0);
            }else{
                return true;
            }
    }
    
    private static boolean checkGameD(int x, int y){
           
        if (!checkDLIZ(x,y)) {
            return false;
        }else if(!checkDLID(x,y)){
            return false;
        }else if(!checkDLTI(x,y)){
            return false;
        }else if(checkDLTD(x,y)){
            return true;
        }
        
       return false;
    }
    
    
    private static boolean checkDLIZ(int x, int y){
        int limit = limitD(x,y);
        
        for (int i = 0; i < limit; i++) {
            x= x-1;
            y= y-1;
            if (positions[x][y]==1) {
                return false;
            }
        }
        return true;
    }
    
    
    
    
    private static boolean checkDLID(int x, int y){
        int limit = limitD(7-x,y);
        
        for (int i = 0; i < limit; i++) {
            x= x+1;
            y= y-1;
            if (positions[x][y]==1) {
                return false;
            }
        }
        return true;
    }
    
    
    private static boolean checkDLTI(int x, int y){
        int limit = limitD(x,7-y);
        
        for (int i = 0; i < limit; i++) {
            x= x-1;
            y= y+1;
            if (positions[x][y]==1) {
                return false;
            }
        }
        return true;
    }
    
    
    private static boolean checkDLTD(int x, int y){
        int limit = limitD(7-x,7-y);
        
        for (int i = 0; i < limit; i++) {
            x= x+1;
            y= y+1;
            if (positions[x][y]==1) {
                return false;
            }
        }
        return true;
    }
    
    
    
    private static int limitD(int x, int y){
           
        if (y<=x) {
            return y;
        }
        else{
            return x;
        }
    } 
    
    public static void resetGame(){
        for(int i=0;i<8;i++){
            for (int j = 0; j < 8; j++) {
                positions[i][j] = 0;   
            }
        }
    }
        
    private static final int[][] positions = new int[8][8];
}
