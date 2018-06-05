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

import javax.swing.*;
import java.io.File;
import java.io.InputStream;

//import javax.xml.bind.JAXBContextFactory;


public class Map1 {


    public static Scene loadMap1() {

//        TMXMapReader mapReader = new TMXMapReader();
//        Map map = null;

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


        final TMXMapReader reader = new TMXMapReader();
        final InputStream stream = Map1.class.getClassLoader().getResourceAsStream("/Tiles/SkyMap/SkyMap.tmx");
        final Map map;

        try {
            map = reader.readMap(stream);
        } catch (Exception e) {
            e.printStackTrace();
        }




//
//        final File file = new File("/Tiles/SkyMap/SkyMap.tmx");
//
//        final String fileName = file.getAbsolutePath();
//
//        try {
//            final Map map = new TMXMapReader().readMap("file:" + "C:\\Users\\dhava\\Stuff\\Duck Game\\src\\Tiles\\SkyMap\\SkyMap.tmx");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//
//        Map map = new Map();
//
//        try {
//            TMXMapReader mapReader = new TMXMapReader();
//            map = mapReader.readMap("file:" + "C:\\Users\\dhava\\Stuff\\Duck Game\\src\\Tiles\\SkyMap\\SyMap.tmx");
//        } catch (Exception e) {
//            System.out.println("Error" + e.getMessage() + " Class: " + e.getClass().getName());
//            e.printStackTrace();
//        }
//
//        System.out.println(map.toString() + " Loaded");
//
//        JScrollPane scrollPane = new JScrollPane();
//
//        JScrollPane scrollPane = new JScrollPane(new MapView(map));

        return scene2;
    }
}
