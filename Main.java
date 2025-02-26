package main;
import javax.swing.JFrame;

public class Main{
	
    public static void main(String[] args) throws Exception {
        JFrame window=new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Lets the window close when X is clicked.
        window.setResizable(false);
        // Restricts the window from being resized.
        window.setTitle("Realm of the Forest");

        gamePanel gamepanel=new gamePanel();
        window.add(gamepanel);
        window.pack();
        // Allows the window to be sized to fit the size and layouts of gamePanel

        window.setLocationRelativeTo(null);
        // Window will be centered at the screen when opened.
        window.setVisible(true);

        gamepanel.setUpGame();
        gamepanel.startGameThread();
        

    }
}
