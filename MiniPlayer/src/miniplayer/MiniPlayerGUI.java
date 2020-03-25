package miniplayer;
//java stuff
import java.awt.GridLayout;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
//import javazoom.jlgui.basicplayer.BasicPlayer;
//import javazoom.jlgui.basicplayer.BasicPlayerException;

/**
 * @author The mean old bastard
 */

class MiniPlayerGUI extends JFrame {
    JPanel  panel = new JPanel();
    //JTextField songPath = new JTextField();
    OpenDlg opendlg;
    JButton play = new JButton(">");
    JButton stop = new JButton("[]");
    //JLabel label = new JLabel("Enter song path below");
    JButton openFile = new JButton("Open");
    JSlider volSlider = new JSlider();
    //share the one listener with both buttons
    PlayStopListener psl = new PlayStopListener();
    JList   songPath = new JList();
    
    BasicPlayer player = new BasicPlayer();
    
    public MiniPlayerGUI(){
        this.setTitle("Mini Player 2.5 by Dr. H (DND to JList)");
        this.setSize(300, 220);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(new GridLayout(5,1));
        //add the gui components to the panel
        //panel.add(label);
        openFile.addActionListener(new openFileListener());
        openFile.setSize(298,20);
        panel.add(openFile);
        
        songPath.setSize(298, 110);
        songPath.setDropTarget(new MyDropTarget());
        panel.add(songPath);
        
        //add the actionListener
        play.addActionListener(psl);
        stop.addActionListener(psl);
        
        panel.add(play);
        panel.add(stop);
        
        //set the slider
        volSlider.addChangeListener(sliderListener);
        panel.add(volSlider);
        //put the panel in the frame
        this.add(panel);     
    }
    
    public void go(){
        //this starts the gui
        setVisible(true);
    }
    
    class PlayStopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //String song = songPath.getText();
            //songPath.setSelectedIndex(0);
            String song = (String) songPath.getSelectedValue();
            if(song == null)
                return;
            if(e.getActionCommand().equals(">")){
                
                try {
                    //if already playing a song, stop it
                    if(player.getStatus()==BasicPlayer.PLAYING)
                        player.stop();
                    //open the song in the player
                    player.open(new URL("file:///" + song));  
                    //play the song in the player
                    player.play();
                    //set the loudness / volume /gain
                    //slider defaults to 50 so set the volume to .5
                    player.setGain(.5);//volume is from 0.00 to 1.0
                    
                    //trace message to output
                    System.out.println("Playing:" + song);
                    
                    if(false)
                    {
                        throw new BasicPlayerException ();
                    }
                } catch (BasicPlayerException | MalformedURLException ex ) {
                    Logger.getLogger(MiniPlayerGUI.class.getName()).log(Level.SEVERE, null, ex);
                }                 
            }            
            else {
                //only two buttons so if it isn't play it must be stop
                try {
                    player.stop();
                    System.out.println("Stopping:" + songPath.getSelectedValue() );
                    if(false)
                    {
                        throw new BasicPlayerException ();
                    }
                    } catch (BasicPlayerException ex) {
                    Logger.getLogger(MiniPlayerGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }      
    }
    
    class openFileListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            opendlg = new OpenDlg();
          
            
            opendlg.setVisible(true);
            
            if(opendlg.Ok){
                String[] songs = new String[12];
                songs[0] = opendlg.filename;
                songPath.setListData(songs);
                System.out.println("File selected is " + opendlg.filename);
            }    
            opendlg.setVisible(false);
        }   
    }
    javax.swing.event.ChangeListener sliderListener = (ChangeEvent e) -> {
        JSlider source = (JSlider)e.getSource();
        if(volSlider.getValueIsAdjusting()){
            int vol = (int) source.getValue();
            try {
                player.setGain(vol/100.0);
                player.resume();
                 if(false)
                {
                        throw new BasicPlayerException ();
                }
            } catch (BasicPlayerException we){
                System.out.println(we.getMessage());
            }
        }
    };//Change
    
    class MyDropTarget extends DropTarget {
            @Override
            public  void drop(DropTargetDropEvent evt) {
                try {
                    evt.acceptDrop(DnDConstants.ACTION_COPY);
                  
                    List result = new ArrayList();
                    result = (List) evt.getTransferable().getTransferData(DataFlavor.javaFileListFlavor);
                    
                    String[] songs = new String[12];
                    int i = 0;
                    for(Object o : result){
                        System.out.println(o.toString());
                        songs[i++] = o.toString();
                    }
                    
                    
                    songPath.setListData(songs);   
                 
                }
                catch (Exception ex){
                    ex.printStackTrace();
                }
            }
           
        }

}