// package Game;
// import board.Board;
// import player.Player;
// public class game {
//     Board b;
//     Player p;
//     public game(Board b, Player p){
//         this.b=b;
//         this.p=p;
//     }
//     public void play(){
//         solvesudoko(0,0);
//     }
//     public void solvesudoko(int r,int c){
//         if(r==b.size){
//             System.err.println("Sudokoo Solved...!!!");
//             b.printboard();
//             return;
//         }
//         int nrow=0; int ncol=0;
//         if(r==b.size-1){
//             nrow=r+1;
//             ncol=0;
//         }else{
//             ncol=c+1;
//             nrow=r;
//         }
//       if(b.mat[r][c]!=0){
//         solvesudoko(nrow, ncol);
//       }else{
//         for(int i =1;i<=9;i++){
//             if(valid(b.mat,r,c,i)==true){
//                 b.mat[r][c]=i;
//                 solvesudoko(nrow, ncol);
//                 b.mat[r][c]=0;

           
              
//             }
//         }
          
//       }
//     }
//     private boolean valid(int[][] mat, int r,int c, int val){
//         for(int i =0;i<mat.length;i++){
//             if(mat[r][i]==val){
//                 return false;
//             }
//         }
//         for(int i =0;i<mat.length;i++){
//             if(mat[i][c]==val){
//                 return false;
//             }
//         }
//         int nrw=r/3*3;
//         int ncl = c/3*3;
//       for(int i=0;i<3;i++){
//         for(int j =0;j<3;j++){
//             if(mat[nrw+i][ncl+j]==val){
//                 return false;
//             }
//         }
//       }
//       return true;
//     }
// }
package Game;

import board.Board;
import player.Player;

public class game {
    Board b;
    Player p;

    public game(Board b, Player p) {
        this.b = b;
        this.p = p;
    }

    public void play() {
        solveSudoku(0, 0);
    }

    public void solveSudoku(int r, int c) {
        if (r == b.size) {
            System.out.println("Sudoku Solved...!!!");
            b.printboard();
            return;
        }
        int nrow = 0;
        int ncol = 0;
        if (c == b.size - 1) {
            nrow = r + 1;
            ncol = 0;
        } else {
            ncol = c + 1;
            nrow = r;
        }
        if (b.mat[r][c] != 0) {
            solveSudoku(nrow, ncol);
        } else {
            for (int i = 1; i <= 9; i++) {
                if (isValid(b.mat, r, c, i)) {
                    b.mat[r][c] = i;
                    solveSudoku(nrow, ncol);
                    b.mat[r][c] = 0;
                }
            }
        }
    }

    private boolean isValid(int[][] mat, int r, int c, int value) {
        for (int i = 0; i < mat.length; i++) {
            if (mat[r][i] == value) {
                return false;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            if (mat[i][c] == value) {
                return false;
            }
        }
        int startRow = r / 3 * 3;
        int startCol = c / 3 * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (mat[startRow + i][startCol + j] == value) {
                    return false;
                }
            }
        }
        return true;
    }
}
