import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends greenfoot.World
{
    private Lobster lobster;
    private Crab crab;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CrabWorld(int numGusano)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 520, 1); 
        Tiempo tiempo = new Tiempo();
        this.addObject(tiempo, 60, 20);
        crab = new Crab();
        addObject(crab,88,85);
        lobster = new Lobster();
        addObject(lobster,410,82);
        prepare(numGusano);
    }
    
    public Lobster accedeLangosta()
    {
        return lobster;
    }
    

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare(int numGusano)
    {
        
        for(int i = 0; i < numGusano; i++)
        {
            Worm worm = new Worm();
            int x = Greenfoot.getRandomNumber(600) + 20;
            int y = Greenfoot.getRandomNumber(520) + 20;
            addObject(worm,x,y);
        }

        Tiempo tiempo = new Tiempo();
        addObject(tiempo,29,15);
    }
}
