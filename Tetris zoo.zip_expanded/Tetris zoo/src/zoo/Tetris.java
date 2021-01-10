package zoo;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;  
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;  

public class Tetris extends JFrame{
    JLabel statusbar;
    
    public Tetris() {
    	setLayout(new BorderLayout());
    	
    	setSize(600, 665); //ukuran window 
        setTitle("T E T R I S"); //title game
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
        statusbar = new JLabel("Score : 0"); //untuk status
        add(statusbar, BorderLayout.NORTH); //letak statusbar
        Board board = new Board(this);
        add(board);
        add(board, BorderLayout.CENTER);
        board.start(); //memulai game

   }

   public JLabel getStatusBar() { //untuk mendapatkan status
       return statusbar;
   }

    public static void main(String[] args) {
        Tetris game = new Tetris();
        game.setLocationRelativeTo(null);
        game.setVisible(true);

    } 
}