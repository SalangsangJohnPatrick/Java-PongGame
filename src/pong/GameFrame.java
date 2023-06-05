package pong;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author JP Salangsang
 */
public class GameFrame extends JFrame {
    
    GamePanel gPanel;
    
    GameFrame() {
        gPanel = new GamePanel();
        this.add(gPanel);
        this.setTitle("Pong Game");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
