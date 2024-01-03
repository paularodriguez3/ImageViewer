package software.ulpgc.imageviewer.control;

import java.util.HashMap;


public class ImageAccessCounter {

    private final HashMap<Integer, Integer> accesses = new HashMap<>();


    private ImageAccessCounter(){

    }

    private static final ImageAccessCounter instance = new ImageAccessCounter();

    public static ImageAccessCounter getInstance(){
        return instance;
    }

    public Integer increment(Integer key){
        final Integer count;

        if(this.accesses.containsKey(key)){
            count = this.accesses.get(key) + 1;
        }else{
            count = 1;
        }
        this.accesses.put(key, count);
        return count;
    }
}

