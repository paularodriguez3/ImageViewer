package software.ulpgc.imageviewer.view;

import software.ulpgc.imageviewer.model.Image;

public interface ImageDisplay {
    Image current();
    void show(Image image);
}

