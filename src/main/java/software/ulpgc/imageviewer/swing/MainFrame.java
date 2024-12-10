package software.ulpgc.imageviewer.swing;

import software.ulpgc.imageviewer.ImageDisplay;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class MainFrame extends JFrame {
    private ImageDisplay imageDisplay;

    public MainFrame() {
        this.setTitle("Image Viewer");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(createImageDisplay());
    }

    public ImageDisplay getImageDisplay() {
        return imageDisplay;
    }

    private Component createImageDisplay() {
        Map<String, String> imagePaths = Map.of(
                "image1", "src/main/java/software/ulpgc/imageviewer/images/1.jpg",
                "image2", "src/main/java/software/ulpgc/imageviewer/images/2.jpg",
                "image3", "src/main/java/software/ulpgc/imageviewer/images/3.jpg"
        );
        SwingImageDisplay display = new SwingImageDisplay(imagePaths);
        this.imageDisplay = display;
        return display;
    }
}
