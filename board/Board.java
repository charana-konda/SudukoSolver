package board;
import java.util.ArrayList;


import triple.Triple;
public class Board {
    public int size;
   public int[][] mat;
    public Board(int size){
        this.size=size;
        mat = new int[size][size];
    }
   public void printboard(){
        for(int i =0;i<this.size;i++){
            for(int j =0;j<this.size;j++){
            System.out.print(mat[i][j]+" ");
        }
        System.out.println();
    }
}
    public void setConfig(ArrayList<Triple> list){
        for(int i=0;i<list.size();i++){
            mat[list.get(i).row][list.get(i).col]=list.get(i).val;
        }
    }
    }

