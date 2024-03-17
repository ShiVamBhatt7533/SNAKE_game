import javax.swing.*;
import java.awt.*;

public class gameframe extends JFrame {
    public gameframe()  {
        game_menu menu=new game_menu();
        this.add(menu);
        this.setTitle("SNAKE");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
