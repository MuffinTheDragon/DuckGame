package sample;

import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
import org.mapeditor.core.Map;
import org.mapeditor.core.Tile;
import org.mapeditor.core.TileLayer;
import org.mapeditor.io.TMXMapReader;

import javax.xml.bind.JAXBContextFactory;



public class Map1 {



    public static Scene loadMap1() {

//        TMXMapReader mapReader = new TMXMapReader();
//        Map map = null;
//        TileLayer layer = null;

       final Pane pane = new Pane();



        Scene scene2 = new Scene(pane, 1300, 650); //replace layout with rootGroup to use
        Stage window = new Stage();

        ImageView background = new ImageView();
        background.setImage(new Image("/Images/SkyMap.png"));
//        background.setImage(new Image("file:" + "C:\\Users\\dhava\\Stuff\\Duck Game\\Icons\\SkyMap.png"));


        Button buttonStart = new Button("Start");
        buttonStart.setOnAction(e -> AlertBox.display("Alert!", "Winner!"));
        //Using Lambada expressions for less code
        Tools.setCoordinates(buttonStart, 620, 510);


        buttonStart.getStyleClass().add("button");
        pane.getChildren().add(background);
        pane.getChildren().add(buttonStart);


        Map map = null;
        try {
            new TMXMapReader().readMap("file:" + "C:\\Users\\dhava\\Desktop\\DuckGame\\src\\Tiles\\SkyMap\\SkyMap.tmx");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Booboo");
        }

        TileLayer layer = null;
        assert false;
        layer = (TileLayer)map.getLayer(0);
        if (layer == null) {
            System.out.println("can't get map layer");
            System.exit(-1);
        }




        return scene2;
    }
}
