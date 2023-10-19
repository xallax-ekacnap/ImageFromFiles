import java.awt.Color;
import javax.swing.JFileChooser;

public class PictureCall {

    public static void main(String[] args) {
        Picture picture = new Picture();

        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            String selectedFilePath = fileChooser.getSelectedFile().getAbsolutePath();
            picture.load(selectedFilePath);
            picture.draw(); // Display the loaded picture
            System.out.println("X: " + picture.getWidth() + " Y: " + picture.getHeight());
        } else {
            System.out.println("No file selected.");
        }
    }
}
