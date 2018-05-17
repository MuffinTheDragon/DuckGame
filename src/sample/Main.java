package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        final Group rootGroup = new Group();
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        final Text text1 = new Text(25, 25, "Quack");
        text1.setFill(Color.CHOCOLATE);
        text1.setFont(Font.font(java.awt.Font.SERIF, 25));
        rootGroup.getChildren().add(text1);

        primaryStage.setTitle("Hello World");
        Scene scene1 = new Scene( rootGroup, 300, 275);

        primaryStage.setScene(scene1);

        primaryStage.getIcons().add(new Image("file:" + "C:\\Users\\dhava\\Stuff\\Duck Game\\Icons\\Duck.png"));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
