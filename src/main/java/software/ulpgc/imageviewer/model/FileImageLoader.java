package software.ulpgc.imageviewer.model;

import software.ulpgc.imageviewer.model.Image;
import software.ulpgc.imageviewer.model.VirtualImage;
import java.io.File;
import java.io.FileFilter;


public class FileImageLoader implements ImageLoader {
    private final File[] files;
    private int current;

    public FileImageLoader(File folder) {
        this.files = folder.listFiles(imageTypes());
        this.current = 0;
    }

    private FileFilter imageTypes() {
        return (File pathname) -> pathname.getName().endsWith(".jpg");
    }

    @Override
    public Image load() {
        return new VirtualImage(files[current]);
    }

    @Override
    public Image next() {
        if(this.current == this.files.length - 1){
            this.current = 0;
        }else{
            this.current++;
        }
        return this.load();
    }

    @Override
    public Image prev() {
        if(this.current == 0){
            this.current = this.current = this.files.length -1;
        }else{
            this.current--;
        }
        return this.load();
    }
}
