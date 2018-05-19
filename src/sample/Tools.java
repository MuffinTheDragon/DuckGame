package sample;

import javafx.scene.Node;

public class Tools {


    public static void setCoordinates(Object a, int x, int y) {
        ((Node) a).setLayoutX(x);
        ((Node) a).setLayoutY(y);
    }

}