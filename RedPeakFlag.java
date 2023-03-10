import ecs100.*;
import java.awt.Color;
/**
 * Making the RedPeakFlag.
 *
 * @author Pheoeb williamson)
 * @version (6/3/23)
 */
public class RedPeakFlag
{
    public RedPeakFlag(){   
        UI.addButton("Quit", UI::quit);
        UI.addButton("Clear", this::doClear);
        UI.addButton("Draw black square", this::doBlackSquare);
        UI.addButton("Draw blue square", this::doBlueSquare);
        UI.addButton("Draw red triangle", this::doRedTriangle);
        UI.addButton("Draw white triangle", this::doWhiteTriangle);
        
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
     * black square
     */
    public void doBlackSquare() {
        UI.setLineWidth(20);
        UI.setColor(Color.black);
        UI.fillRect(10, 10, 200, 200);
    }
    // (double left , double top, double width, double height)
    /**
     * blue square
     */
    public void doBlueSquare() {
        UI.setLineWidth(20);
        UI.setColor(Color.blue);
        UI.fillRect(210, 10, 200, 200);
    }
    
    /**
     * white triangle
     */
    public void doWhiteTriangle() {
        UI.setColor(Color.white);
        double[] a = {10, 210, 410};
        double[] b = {210, 10, 210};
        UI.fillPolygon(a,b, 3);
    }
    
    /**
     * red triangle
     */
    public void doRedTriangle() {
        UI.setColor(Color.red);
        double[] a = {80, 210, 340};
        double[] b = {210, 90, 210};
        UI.fillPolygon(a,b, 3);
    }
}
