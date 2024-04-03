import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerDemo extends JPanel implements ActionListener {
    private JLabel iconLabel;
    private Timer timer;
    private int x = 0;
    private int y = 0;

    TimerDemo() {
        ImageIcon imageIcon = createImageIcon("Mario.gif",
                "Mario image");
        iconLabel = new JLabel(imageIcon);
        iconLabel.setLocation(x, y);
        this.add(iconLabel);
        setBackground(Color.white);
        timer = new Timer(80, this);
        timer.start();
    }

    /** Returns an ImageIcon, or null if the path was invalid. */
    protected ImageIcon createImageIcon(String path,
                                        String description) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            ImageIcon imageIcon = new ImageIcon(imgURL, description);
            Image image = imageIcon.getImage();
            Image newSizeImage = image.getScaledInstance(500,300,Image.SCALE_DEFAULT);
            ImageIcon newImageIcon = new ImageIcon(newSizeImage);
            return newImageIcon;
        } else {
            System.err.println("Couldn't find file: " + path);
            throw new RuntimeException("No image was found to create the icon");
        }
    }

    public void actionPerformed(ActionEvent e) {
        x += 10;
        if (x > 800) x = 20;
        y += 10;
        if(y > 800) y = 30;
        iconLabel.setLocation(x, y);
        if(x==20 && y==30){
            timer.stop();
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Timer Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        TimerDemo pane = new TimerDemo();
        frame.setContentPane(pane);
        frame.setVisible(true);
    }
}

