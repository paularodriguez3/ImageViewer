package software.ulpgc.imageviewer.control;

import software.ulpgc.imageviewer.model.Image;
import software.ulpgc.imageviewer.model.FileImageLoader;
import java.io.File;


public class Main {
    public static void main(String[] args) {
        File folder = new File("C:/Users/paula/Downloads/imagenes");
        FileImageLoader imageLoader = new FileImageLoader(folder);
        Image image = imageLoader.load();
        MainFrame mainFrame = new MainFrame(imageLoader);
        mainFrame.getImageDisplay().show(image);
    }
}

