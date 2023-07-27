package com.mycompany.simpletrafficlightsystem;

public class SimpleTrafficLightSystem
{

    public static void main(String[] args)
    {
     
    RedLightThread t1=new  RedLightThread(); 
     YellowLightThread t2=new  YellowLightThread(); 
     GrennLightThread t3=new  GrennLightThread(); 
    t1.start(); 
    t2.start();
     t3.start();
    }
}
