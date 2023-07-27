package com.mycompany.simpletrafficlightsystem;

public class GrennLightThread extends Thread
{
     public void run()
    {
        while(true)
        {
             try
    { 
         System.out.println("Green light");
        Thread.sleep(2000); 
    }
    catch(InterruptedException e)
    {
        System.out.println(e);
    } 
        }
    }
}
