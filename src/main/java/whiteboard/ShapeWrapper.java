package whiteboard;

import java.awt.*;

public class ShapeWrapper {

    //TODO: YP
    //Shape shape?
    //String color?
    //TextBox text?

    private Shape shape;
    private String color;
    private String textPane; //FIXME: not implemented

    // Getters and setters
    public Shape getShape() {return this.shape;}
    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public String getColor() {return this.color;}
    public void setColor(String color) {
        this.color = color;
    }

    // FIXME: I haven't figured out how to add textPane on canvas
    public String getTextPane() {return this.textPane;}
    public void setTextPane(String textPane) {
        this.textPane = textPane;
    }
}
