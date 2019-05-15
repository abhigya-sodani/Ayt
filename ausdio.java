import javax.sound.sampled.AudioInputStream; 
import javax.sound.sampled.AudioSystem; 
import javax.sound.sampled.Clip; 
import javax.sound.sampled.LineUnavailableException; 
import javax.sound.sampled.UnsupportedAudioFileException; 
import java.util.*;
import java.io.*;

public class ausdio { 
    Long currentFrame; 
    Clip clip; 
    String status; 
      
    AudioInputStream audioInputStream; 
    static String filePath; 
  
    // constructor to initialize streams and clip 
    public ausdio(String file) throws UnsupportedAudioFileException, IOException, LineUnavailableException  
    { 
        audioInputStream =  
                AudioSystem.getAudioInputStream(new File(file).getAbsoluteFile()); 
          
        // create clip reference 
        clip = AudioSystem.getClip(); 
          
        // open audioInputStream to the clip 
        clip.open(audioInputStream); 
          
        //clip.loop(Clip.LOOP_CONTINUOUSLY); 
    } 

public void play()  
{ 
    //start the clip 
    clip.start(); 
      
    status = "play"; 
} 
public void stop() throws UnsupportedAudioFileException, IOException, LineUnavailableException  
{ 
    currentFrame = 0L; 
    clip.stop(); 
    clip.close(); 
} 
  
}
  