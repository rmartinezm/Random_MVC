package randomfx;

/**
 *
 * @author rmartinezm
 */

import java.util.Random;

public class Modelo {
    
    public int dameRandom(int range){
        return new Random().nextInt(range);
    }
    
}
