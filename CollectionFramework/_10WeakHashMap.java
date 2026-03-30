package CollectionFramework;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

class Image {
    private String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Image : " + name;
    }
}

public class _10WeakHashMap {

    public static void simulteApplicationRunning() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e){
             e.printStackTrace();
        }
    }

    public static void loadCache(Map<String, Image> imageCache){ // we can pass WeakHashMap in Map because WeakHashMap extends Map. or Map -> Parent Class and WeakHashMap -> Child Class.
        // Here even we created strong references but in different scope.
        String k1 = new String("IMG 1");
        String k2 = new String("IMG 2");
        imageCache.put(k1, new Image("image 1"));
        imageCache.put(k1, new Image("image 2"));
    }

    public static void main(String[] args) {
        WeakHashMap<String, Image>  imageCache = new WeakHashMap<>();
        // Here IMG 1 and IMG 2 both are string literals and stored string pool(stack memory) and will strong referenced through out the life-cycle of the program.
        // To garbage collection we need to create keys non literals (weak referenced)
//        imageCache.put("IMG 1", new Image("image 1"));
//        imageCache.put("IMG 2", new Image("image 2"));

        // Now Weak Referenced (non literals)
        imageCache.put(new String("IMG 1"), new Image("image 1"));
        imageCache.put(new String("IMG 2"), new Image("image 2"));
//

//        loadCache(imageCache);
        System.out.println(imageCache);

        System.gc();
        simulteApplicationRunning();
        System.out.println("Cache after running (some entries may be cleared) : " + imageCache);
    }
}
