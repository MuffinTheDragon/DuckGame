package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Map1 {

    public static Scene loadMap1() {

        Pane pane = new Pane();

        Scene scene2 = new Scene(pane, 1300, 650); //replace layout with rootGroup to use


        ImageView background = new ImageView();
        background.setImage(new Image("file:" + "C:\\Users\\dhava\\Stuff\\Duck Game\\Icons\\SkyMap.png"));


        Button buttonStart = new Button("Start");
        buttonStart.setOnAction(e -> System.out.println("Hello"));
        //Using Lambada expressions for less code
        Tools.setCoordinates(buttonStart, 620, 510);

        pane.getChildren().add(buttonStart);
        pane.getChildren().add(background);

        return scene2;
    }
}
