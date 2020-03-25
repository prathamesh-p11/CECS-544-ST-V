/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniplayer;


import java.net.URL;

/**
 *
 * @author prathamesh
 */
public class BasicPlayer {
    public int status;
    public double gain;
    public static int UNKOWN, OPENED, PLAYING, STOPPED;
    
    
    public BasicPlayer()
    {   
        System.out.println("MBP - Creating BasicPlayer object with UNKNOWN\n");
        this.UNKOWN = 0;
        this.OPENED = 1;
        this.PLAYING = 2;
        this.STOPPED = 3;
        this.gain = 0.5;
        this.status = 0;
    } 
    public int getStatus()
    {
        System.out.println("MBP - Getting status - status is" + this.status);
        return this.status;
    }
    
    public void setGain(double g)
    {
        System.out.println("MBP - Setting gain to"+ this.gain);
        this.gain = g;
    }
    
    public void stop()
    {   
        this.status = this.STOPPED;
        System.out.println("MBP - Stopping Play");
    }
    
    public void open(URL u)
    {   
        this.status = this.OPENED;
        System.out.println("MBP - Opening URL File " + u);
    }
    
    public void play()
    {
        this.status = this.PLAYING;
        System.out.println("MBP - Playing....");
    }
    
    public void resume()
    {
        System.out.println("MBP - Resuming playback");    
    }
}