import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

public class ShowImage {
    public static void main(String[] args) throws Exception {
        BufferedImage img = ImageIO.read(new File("Screenshot_20251201_200607.jpg"));

        JFrame frame = new JFrame("Image Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(img.getWidth(), img.getHeight());

        JLabel label = new JLabel(new ImageIcon(img));
        frame.add(label);

        frame.pack();
        frame.setVisible(true);
    }
}

