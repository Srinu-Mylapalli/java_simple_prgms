    import javax.imageio.ImageIO;
    import java.awt.image.BufferedImage;
    import java.io.File;

    public class ImageReader {
        public static void main(String[] args) {
            try {
                BufferedImage image = ImageIO.read(new File("Screenshot_20251201_200607.jpg"));
                // Now you can work with the 'image' object
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
