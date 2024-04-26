package APP;
import player.Player;
import triple.Triple;
import board.Board;

import java.util.ArrayList;

import Game.game;
public class app {
    public static void main(String args[]){
        Player p1 = new Player();
        p1.setdetails("charana", "703178888", "Husnabad");
        p1.getdetails();
        Board b = new Board(9);
        ArrayList<Triple> list = new ArrayList<>();
        list.add(new Triple(1,5,7));
        list.add(new Triple(1,4,8));
        list.add(new Triple(2,5,1));
        list.add(new Triple(3,5,2));
        list.add(new Triple(4,3,3));
        list.add(new Triple(5,5,4));
        list.add(new Triple(7,6,6));
        list.add(new Triple(6,7,2));
        list.add(new Triple(8,2,1));
        list.add(new Triple(4,6,3));
        list.add(new Triple(3,2,2));
        list.add(new Triple(2,5,5));
        b.printboard();
        b.setConfig(list);
        game g = new game(b, p1);
        g.play();
        


    }
    
}
