// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Worm extends Actor
{

    /**
     * Act - do whatever the Worm wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movingWorm();
    }

    /**
     * 
     */
    public void movingWorm()
    {
        if (Greenfoot.getRandomNumber(10) == 1) {
            move(Greenfoot.getRandomNumber(90) - 45);
        }
    }
}
