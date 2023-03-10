import ecs100.*;
import java.awt.Color;
/**
 * Making the RedPeakFlag.
 *
 * @author Pheoeb williamson)
 * @version (6/3/23)
 */
public class FlagWithStar
{
    public FlagWithStar(){   
        UI.addButton("Quit", UI::quit);
        UI.addButton("Clear", this::doClear);
        UI.addButton("Draw blue background", this::doBlueBackground);
        UI.addButton("Draw star1", this::doDrawStar1);
        UI.addButton("Draw star2", this::doDrawStar2);
        UI.addButton("Draw star3", this::doDrawStar3);
        UI.addButton("Draw star4", this::doDrawStar4);
        UI.addButton("Draw star5", this::doDrawStar5);
        UI.addButton("tri1", this::doTri1);
        UI.addButton("tri2", this::doTri2);
        UI.addButton("tri3", this::doTri3);
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
    public void doBlueBackground() {
        UI.setLineWidth(20);
        UI.setColor(Color.blue);
        UI.fillRect(10, 10, 400, 400);
    }
    // (double left , double top, double width, double height)
    /**
     * blue square
     */
    public void doDrawStar1() {
        UI.setColor(Color.white);
        double[] a = {185 ,205, 225};
        double[] b = {120, 75, 120};
        UI.fillPolygon(a, b, 3);
    }
    
    public void doDrawStar2() {
        UI.setColor(Color.white);
        double[] a = {225, 235, 270}; // x axis
        double[] b = {120, 150, 120 };// y axis
        UI.fillPolygon(a, b, 3);
    }
    
    public void doDrawStar3() {
        UI.setColor(Color.white);
        double[] a = {205, 235, 250}; // x axis
        double[] b = {170, 150, 190 };// y axis
        UI.fillPolygon(a, b, 3);
    }
    
    public void doDrawStar4() {
        UI.setColor(Color.white);
        double[] a = {160, 175, 205}; // x axis
        double[] b = {190, 150, 170 };// y axis
        UI.fillPolygon(a, b, 3);
    }
    
    public void doDrawStar5() {
        UI.setColor(Color.white);
        double[] a = {140, 175, 185}; // x axis
        double[] b = {120, 150, 120 };// y axis
        UI.fillPolygon(a, b, 3);
    }
    
    public void doTri1(){
        UI.setColor(Color.white);
        double[] a = {175,185, 225}; // x axis
        double[] b = {150,120, 120};// y axis
        UI.fillPolygon(a, b, 3);
    }
    
    public void doTri2(){
        UI.setColor(Color.white);
        double[] a = {175, 225, 235}; // x axis
        double[] b = {150, 120, 150};// y axis
        UI.fillPolygon(a, b, 3);
    }
    
    public void doTri3(){
        UI.setColor(Color.white);
        double[] a = {175, 205, 235}; // x axis
        double[] b = {150, 170, 150};// y axis
        UI.fillPolygon(a, b, 3);
    }
}
