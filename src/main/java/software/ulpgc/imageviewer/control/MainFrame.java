package software.ulpgc.imageviewer.control;

import software.ulpgc.imageviewer.model.FileImageLoader;
import software.ulpgc.imageviewer.view.ImageDisplay;
import software.ulpgc.imageviewer.view.SwingImageDisplay;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class MainFrame extends JFrame {

    private ImageDisplay imageDisplay;
    private final FileImageLoader imageLoader;

    public MainFrame(FileImageLoader imageLoader) {
        this.imageLoader = imageLoader;
        this.setTitle("Image Viewer");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.getContentPane().add(imageDisplay());
        this.getContentPane().add(toolBar(), BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public ImageDisplay getImageDisplay() {
        return imageDisplay;
    }

    private JPanel imageDisplay() {
        SwingImageDisplay imageDisplay = new SwingImageDisplay();
        this.imageDisplay = imageDisplay;
        return imageDisplay;
    }

    private JPanel toolBar() {
        JPanel panel = new JPanel();
        panel.add(prevButton());
        panel.add(nextButton());
        return panel;
    }

    private JButton prevButton() {
        JButton button = new JButton("<");
        button.addActionListener(prevImage());
        return button;
    }

    private JButton nextButton() {
        JButton button = new JButton(">");
        button.addActionListener(nextImage());
        return button;
    }

    private ActionListener prevImage() {
        return (ActionEvent ae) -> {
            imageDisplay.show(imageLoader.prev());
        };
    }

    private ActionListener nextImage() {
        return (ActionEvent ae) -> {
            imageDisplay.show(imageLoader.next());
        };
    }
}

