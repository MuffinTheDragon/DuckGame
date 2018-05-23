package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileInputStream;


/*

Stage: Full entire window
Scene: Content inside your stage. Contains things like buttons.
Layout: How to arrange everything on the scene
setCoordinates method: Position every object exactly where you want it to be *
*/


public class Main extends Application { //get functionality for a JavaFX program
    //to hand user events, implement EventHandler
    Stage window;
    Button buttonStart;
    Button buttonHelp;
    ImageView imgView1;

    @Override
    public void start(Stage primaryStage) throws Exception {

        final Group rootGroup = new Group();
        final Group rootGroup2 = new Group();
        StackPane layout = new StackPane();
        Scene scene1 = new Scene(rootGroup, 1300, 650); //replace layout with rootGroup to use

        primaryStage.setResizable(false);

        // rootGroup.getChildren()
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));



        final Text text1 = new Text("Duck Game");
        text1.setFill(Color.CHOCOLATE);
        text1.setFont(Font.font(java.awt.Font.MONOSPACED, 125));


        Tools.setCoordinates(text1, 600, 100);
        rootGroup.getChildren().add(text1);

        //Add Game logo
        Image img1 = new Image("/Images/Logo.png");
        imgView1.setImage(img1);
        rootGroup.getChildren().add(imgView1);

        primaryStage.setTitle("Duck Game");

        primaryStage.setScene(scene1);

        buttonStart = new Button();
        buttonStart.setText("Start");
        buttonStart.setOnAction(e -> System.out.println("lamb")); //Using Lambada expressions for less code
        Tools.setCoordinates(buttonStart, 650, 155);
        Scene scene2 = new Scene(rootGroup2, 300, 275);
        buttonHelp = new Button();
        buttonHelp.setText("Help");
        buttonHelp.setOnAction(e -> {
            System.out.println("Help");
            primaryStage.setScene(scene2);
        });
        Tools.setCoordinates(buttonHelp, 130, 175);

        //button.setOnAction(this) //whenever user clicks the button, look in this class for the handle method
        // this file


        rootGroup.getChildren().add(buttonStart);
        rootGroup.getChildren().addAll(buttonHelp);

        primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/Duck.png")));
        primaryStage.setFullScreen(false);
        primaryStage.show();

    }

    /*
    @Override
    public void handle(ActionEvent event) { //this method is called whenever user clicks a button or does an action
        if(event.getSource() == button) { //identify which button was clicked
            System.out.println("Nice");
        }
    }
    */
    public static void main(String[] args) {
        launch(args); //method inside application class. Calls start method in Application class
    }
}
