import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * TitleScreen.
 * 
 * @author (Hasher) 
 * @version (June 2022)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Elephant", 60);
    Label condition = new Label("Collect 20 apples to win!", 40);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, getHeight()/2);
        addObject(condition, getWidth()/2, getHeight()/2+100);
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
   
}

