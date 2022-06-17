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
    GreenfootImage idleRight = new GreenfootImage("images/elephant_idle/idle0.png");
    
    // Direction the elephant is facing
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    public Elephant()
    {
        setImage(idleRight);
        idleRight.scale(75, 75);
        if(animationTimer.millisElapsed() < 50)
        {
            return;
        }
        animationTimer.mark();
    }
    

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
