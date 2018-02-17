import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
    	Robot hi = new Robot();{	 
    		// 3. ask the user what color they would like the Robot to draw
String color=JOptionPane.showInputDialog("pick a color");
String red = "red";
String blue = "blue";
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
if(color.equals(red)) {
	hi.setPenColor(255, 0, 0);}
	else if(color.equals(blue)) {
		hi.setPenColor(0, 0, 255);
		
		
	}
}
   	 // 2. set the pen width to 10
    
    	hi.setPenWidth(10);
   	 // 1. make the Robot draw a shape
 hi.setSpeed(10);
    	  hi.penDown();
    	  for(int i=1;i<5;i++) {
    			  hi.move(100);
    hi.turn(90);


}}}
