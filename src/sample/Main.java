package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/*

Stage: Full entire window
Scene: Content inside your stage. Contains things like buttons.
Layout: How to arrange everything on the scene
setCoordinates method: Position every object exactly where you want it to be *
*/


public class Main extends Application { //get functionality for a JavaFX program
    //to hand user events, implement EventHandler
    Stage window;
    Button button;

    @Override
    public void start(Stage primaryStage) throws Exception {

        final Group rootGroup = new Group();
        StackPane layout = new StackPane();
        Scene scene1 = new Scene(layout, 300, 275); //replace layout with rootGroup to use
        // rootGroup.getChildren()
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        final Text text1 = new Text(25, 25, "Quack");
        text1.setFill(Color.CHOCOLATE);
        text1.setFont(Font.font(java.awt.Font.SERIF, 25));
        layout.getChildren().add(text1);


        primaryStage.setTitle("Duck Game");

        primaryStage.setScene(scene1);

        button = new Button();
        button.setText("Start");
        button.setOnAction(e -> System.out.println("lamb")); //Using Lambada expressions for less button code


        //button.setOnAction(this) //whenever user clicks the button, look in this class for the handle method
        // this file


        layout.getChildren().add(button);

        primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/Duck.png")));
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
