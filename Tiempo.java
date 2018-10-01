import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tiempo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tiempo extends Actor
{
    /**
     * Act - do whatever the Tiempo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private SimpleTimer timer;
    private Counter contador;
    
    //Se ejecuta al momento de crear un objeto
    public Tiempo()
    {
        timer = new SimpleTimer();
        contador = new Counter("Tiempo: ");
        contador.setValue(10);
    }
    
    //Se ejecuta al momento de agregar el objeto al mundo
    protected void addedToWorld(World world)
    {
        world.addObject(contador, 60, 18);
    }
    
    public void act() 
    {
        if(timer.millisElapsed() >1000)
        {
            //*System.out.println(timer.millisElapsed());
            contador.setValue(contador.getValue() - 1);
            if(contador.getValue() == 0)
            {
                Greenfoot.stop();
            }
            timer.mark();
        }
    }    
}
