import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    
    public void act()
    {
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + 1, getY());
        }
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() - 1);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - 1, getY());
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + 1);
        }
        eat();
    }
    
    public void eat()
    {
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
            elephantSound.play();
        }
    }
}
