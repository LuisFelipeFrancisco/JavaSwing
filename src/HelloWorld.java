import javax.swing.*;

public class HelloWorld {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Hello World Java Swing");

        // Setting the default close operation of the frame to exit the application when the frame is closed.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Setting the size of the frame.
        frame.setSize(800, 600);

        // Creating a new JLabel object with the text "Hello World!" and the alignment CENTER.
        JLabel lblText = new JLabel("Hello World!", SwingConstants.CENTER);

        // Adding the JLabel to the JFrame.
        frame.getContentPane().add(lblText);

        // Creating a frame and setting it to visible.
        frame.setVisible(true);

    }
}