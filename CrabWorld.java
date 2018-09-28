import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends greenfoot.World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CrabWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,88,85);
        Lobster lobster = new Lobster();
        addObject(lobster,410,82);
        Worm worm = new Worm();
        addObject(worm,119,300);
        Worm worm2 = new Worm();
        addObject(worm2,308,261);
        Worm worm3 = new Worm();
        addObject(worm3,361,285);
        Worm worm4 = new Worm();
        addObject(worm4,457,254);
        Worm worm5 = new Worm();
        addObject(worm5,287,194);
        Worm worm6 = new Worm();
        addObject(worm6,132,349);
        Worm worm7 = new Worm();
        addObject(worm7,520,346);
        Worm worm8 = new Worm();
        addObject(worm8,240,349);
        Worm worm9 = new Worm();
        addObject(worm9,522,176);
        Worm worm10 = new Worm();
        addObject(worm10,555,88);
        Worm worm11 = new Worm();
        addObject(worm11,575,43);
        Worm worm12 = new Worm();
        addObject(worm12,57,218);
        Worm worm13 = new Worm();
        addObject(worm13,160,256);
        Worm worm14 = new Worm();
        addObject(worm14,292,334);
        Worm worm15 = new Worm();
        addObject(worm15,376,340);
        Worm worm16 = new Worm();
        addObject(worm16,452,315);
        Worm worm17 = new Worm();
        addObject(worm17,439,347);
        Worm worm18 = new Worm();
        addObject(worm18,554,269);
        worm5.setLocation(302,193);
    }
}
