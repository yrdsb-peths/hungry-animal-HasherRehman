import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    SimpleTimer oldTimer = new SimpleTimer(); 
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Elephant eMan = new Elephant();
        Apple frapple = new Apple();
        addObject(eMan, 200, 100);
        addObject(frapple , 300, 100);
        
    }
    
    public void act()
    {
        if(oldTimer.millisElapsed() > 2000)
        {
            Apple grapple = new Apple();
            int randomX = Greenfoot.getRandomNumber(600);
            int randomY = Greenfoot.getRandomNumber(400);
            addObject (grapple, randomX, randomY);
            oldTimer.mark();
        }
    }
    
    
}