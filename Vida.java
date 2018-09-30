import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vida extends Actor
{
    
    private SimpleTimer timer;
    private Counter contador;
    
    public Vida()
    {
        //timer = new SimpleTimer();
        contador = new Counter("Vidas: ");
        contador.setValue(3);
    }
    
    //Se ejecuta al momento de agregar el objeto al mundo
    protected void addedToWorld(World world)
    {
        world.addObject(contador, 53, 53);
    }
    
    public void act() 
    {
        if(isTouching(Crab.class))
        {
            //*System.out.println(timer.millisElapsed());
            contador.setValue(contador.getValue() - 1);
            if(contador.getValue() == 0)
            {
                removeTouching(Crab.class);
                Greenfoot.stop();
            }
            //timer.mark();
        }
    }     
}
