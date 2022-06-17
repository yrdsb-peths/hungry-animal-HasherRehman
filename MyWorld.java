import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    SimpleTimer oldTimer = new SimpleTimer(); 
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        //Create 2 objects and add them to the world
        Elephant eMan = new Elephant();
        Apple frapple = new Apple();
        addObject(eMan, 200, 100);
        addObject(frapple , 300, 100);
        
        //Create a label
        scoreLabel = new Label(0,80);
        addObject(scoreLabel, 20, 30);
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
     if(score >= 20)
     {
         gameOver();
     }
    }
    
    public void increaseScore()
    {
        score++;    
        scoreLabel.setValue(score);
    }
    public void gameOver()
    {
        Label gameOverLabel = new Label("You Win!", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
}