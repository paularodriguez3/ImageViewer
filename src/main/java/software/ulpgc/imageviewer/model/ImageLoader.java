package software.ulpgc.imageviewer.model;

import software.ulpgc.imageviewer.model.Image;

public interface ImageLoader {
    Image load();
    Image next();
    Image prev();
}

