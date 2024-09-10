/**
 * chapter 1 picture assignment, instantiates a total of 9 objects
 * additionally has the ability to change between black and white modes and the default color set
 * there are also a total of two animation features which move all objects from their default positions
 * finally there is the addition of newForegroundColor which changes all objects into base colors from template
 * 
 * Story of the picture is that there is a team at a big orb, sunrise animation puts the team in position to move
 * sunset animation places the team in a position which surrounds the orb
 * additional use of the sunrise animation and sunset animations move the team out of the frame.
 * 
 * @author: Don Santiago
 * @version 2024.9.10
 */
public class Picture
{
    private Square area;
    private Triangle prism;
    private Circle orb;
    private Person testDummy1;
    private Person testDummy2;
    private Person testDummy3;
    private Person testDummy4;
    private Person testDummy5;
    private Person testDummy6;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        area = new Square();
        prism = new Triangle();  
        orb = new Circle();
        testDummy1=new Person();
        testDummy2=new Person();
        testDummy3=new Person();
        testDummy4=new Person();
        testDummy5=new Person();
        testDummy6=new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            area.makeVisible();
            orb.makeVisible();
            prism.makeVisible();

            testDummy1.changeColor("turquoise");
            testDummy1.moveHorizontal(-20);
            testDummy1.makeVisible();
            
            testDummy2.changeColor("pink");
            testDummy2.moveHorizontal(20);
            testDummy2.makeVisible();
            
            testDummy3.changeColor("lime");
            testDummy3.moveHorizontal(80);
            testDummy3.makeVisible();
            
            testDummy4.changeColor("ruby");
            testDummy4.moveHorizontal(-80);
            testDummy4.makeVisible();
            
            testDummy5.changeColor("navy");
            testDummy5.moveHorizontal(-180);
            testDummy5.makeVisible();
            
            testDummy6.changeColor("aqua");
            testDummy6.moveHorizontal(180);
            testDummy6.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        area.changeColor("black");
        orb.changeColor("white");
        prism.changeColor("black");
        testDummy1.changeColor("white");
        testDummy2.changeColor("white");
        testDummy3.changeColor("black");
        testDummy4.changeColor("black");
        testDummy5.changeColor("black");
        testDummy6.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {

        area.changeColor("sandstone");
        orb.changeColor("slate");
        prism.changeColor("beige");
        testDummy1.changeColor("turquoise");
        testDummy2.changeColor("pink");
        testDummy3.changeColor("lime");
        testDummy4.changeColor("ruby");
        testDummy5.changeColor("navy");
        testDummy6.changeColor("aqua");
    }
    
    /**
     * This should create an animated display
     */
    public void setSunrise()
    {   

        orb.slowMoveVertical(-280);
        prism.slowMoveVertical(-280);
        testDummy1.slowMoveVertical(100);
        testDummy1.slowMoveHorizontal(-20);
        testDummy2.slowMoveVertical(100);
        testDummy2.slowMoveHorizontal(20);
        testDummy3.slowMoveVertical(160);
        testDummy3.slowMoveHorizontal(45);
        testDummy4.slowMoveVertical(160);
        testDummy4.slowMoveHorizontal(-45);
        testDummy5.slowMoveVertical(220);
        testDummy5.slowMoveHorizontal(-60);
        testDummy6.slowMoveVertical(220);
        testDummy6.slowMoveHorizontal(60);
    }
    
    /**
     * This should create an animated display, it also moves the testDummys object after orbset
     */
    public void setSunset()
    {
        orb.slowMoveVertical(280);
        prism.slowMoveVertical(280);
        testDummy1.slowMoveVertical(-300);
        testDummy2.slowMoveVertical(-300);
        testDummy3.slowMoveVertical(-160);
        testDummy3.slowMoveHorizontal(55);
        testDummy4.slowMoveVertical(-160);
        testDummy4.slowMoveHorizontal(-55);
        testDummy5.slowMoveHorizontal(120);
        testDummy6.slowMoveHorizontal(-120);
        
    }
    
    /**
     * This should swap all the colors to a different set of colors
     */
    public void setForegroundColor()
    {
        area.changeColor("red");
        orb.changeColor("green");
        prism.changeColor("magenta");
        testDummy1.changeColor("blue");
        testDummy2.changeColor("blue");
        testDummy3.changeColor("blue");
        testDummy4.changeColor("blue");
        testDummy5.changeColor("blue");
        testDummy6.changeColor("blue");    
    }
}