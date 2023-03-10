import ecs100.*;
import java.awt.Color;
/**
 * draws french flag
 *
 * @author (Phoeb Williapsn)
 * @version.1 (3/3/23)
 */
public class drawFlag
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class drawFlag
     */
    public drawFlag()
    {
        UI.initialise();
        UI.addButton("Draw flag 1", this::doDrawFlag1);
        UI.addButton("Draw flag 2", this::doDrawFlag2);
        UI.addButton("Draw flag 3", this::doDrawFlag3);
        UI.addButton("Quit", UI::quit);
        UI.addButton("Clear", this::doClear);
    }
    
    /**
     * make the screen clear
     * 
     */
    public void doClear() {
        UI.setColor(Color.white);
        UI.fillRect(0, 0, 100000, 100000);
        
    }
    
    /**
     * Draw the french flag
     */
    // (double left , double top, double width, double height)
    public void doDrawFlag1(){
        // flag pole
        UI.setLineWidth(20);
        UI.setColor(Color.black);
        UI.fillRect(40, 50, 10, 200);
        
        // line 1
        UI.setLineWidth(20);
        UI.setColor(Color.blue);
        UI.fillRect(50, 50, 50, 70);
        
        // line 2
        UI.setLineWidth(20);
        UI.setColor(Color.white);
        UI.fillRect(100, 50, 50, 70);
        
        
        // line 3
        UI.setLineWidth(20);
        UI.setColor(Color.red);
        UI.fillRect(150, 50, 50, 70);
        
        
    }
    
    /**
     * Draw the italy flag
     */
    // (double left , double top, double width, double height)
    public void doDrawFlag2(){
        // flag pole
        UI.setLineWidth(20);
        UI.setColor(Color.black);
        UI.fillRect(240, 50, 10, 200);
        
        // line 1
        UI.setLineWidth(20);
        UI.setColor(Color.green);
        UI.fillRect(250, 50, 50, 70);
        
        // line 2
        UI.setLineWidth(20);
        UI.setColor(Color.white);
        UI.fillRect(300, 50, 50, 70);
        
        
        // line 3
        UI.setLineWidth(20);
        UI.setColor(Color.red);
        UI.fillRect(350, 50, 50, 70);
        
        
    }
    
    /**
     * Draw the germany flag
     */
    // (double left , double top, double width, double height)
    public void doDrawFlag3(){
        // flag pole
        UI.setLineWidth(20);
        UI.setColor(Color.black);
        UI.fillRect(410, 50, 10, 200);
        
        // line 1
        UI.setLineWidth(20);
        UI.setColor(Color.black);
        UI.fillRect(420, 50, 50, 70);
        
        // line 2
        UI.setLineWidth(20);
        UI.setColor(Color.yellow);
        UI.fillRect(470, 50, 50, 70);
        
        
        // line 3
        UI.setLineWidth(20);
        UI.setColor(Color.red);
        UI.fillRect(520, 50, 50, 70);
        
        
    }
}
