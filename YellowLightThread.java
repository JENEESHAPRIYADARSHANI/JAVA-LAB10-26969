
package com.mycompany.simpletrafficlightsystem;


public class YellowLightThread extends Thread
{
     public void run()
    {
        while(true)
        {
             try
    { 
         System.out.println("yellow light");
        Thread.sleep(2000); 
    }
    catch(InterruptedException e)
    {
        System.out.println(e);
    } 
        }
    }
}
