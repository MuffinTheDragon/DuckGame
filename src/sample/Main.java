package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
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


        BorderPane bp = new BorderPane();
        BorderPane bp2 = new BorderPane();
        final Pane p = new Pane();


        final Group rootGroup = new Group();
        final Group rootGroup2 = new Group();

        StackPane layout = new StackPane();
        Scene scene1 = new Scene(p, 1300, 650); //replace layout with rootGroup to use
//        Scene scene2 = new Scene(rootGroup2, 1300, 650); //replace layout with rootGroup to use

        primaryStage.setResizable(false);


//       File css = new File(getClass().getResource("/StyleSheets/Button.css").toURI().toString());
//       scene1.getStylesheets().clear();
//        String styles = getClass().getResource("/sample/Button.css").toExternalForm();


//        Tooltip tooltip = new Tooltip("Start Game");
//        Tooltip.install(buttonStart, tooltip);


        // rootGroup.getChildren()
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));


//        final Text text1 = new Text("Duck Game");
//        text1.setFill(Color.CHOCOLATE);
//        text1.setFont(Font.font(java.awt.Font.MONOSPACED, 125));
//
//
//        Tools.setCoordinates(text1, 600, 100);
//        rootGroup.getChildren().add(text1);


        //Add Game logo


        //Add Start Screen Background Image
//        try {
//            BackgroundImage bimg1= new BackgroundImage(new Image("file:" +
//                    "C:\\Users\\dhava\\Stuff\\Duck Game\\Icons\\Screen.jpeg",
//                    32,32,false,true),
//                    BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
//                    BackgroundSize.DEFAULT);
//
//                Background background1 = new Background(bimg1);
//                    bp.setBackground(background1);
//        }catch (NullPointerException e) {
//            System.out.println("Error");
//        }


        primaryStage.setTitle("Duck Game");

        primaryStage.setScene(scene1);


//        String uriString = new File("C:\\Users\\dhava\\Stuff\\Duck Game\\Music\\Title.mp3").toURI().toString();
//        String uriString = new File("file:///Music/Title.mp3").toURI().toString();
//        MediaPlayer player = new MediaPlayer(new Media(uriString));

        Media media = new Media(getClass().getResource("/Music/Title.mp3").toURI().toString());
        MediaPlayer player = new MediaPlayer(media);
        player.setCycleCount(MediaPlayer.INDEFINITE);
        player.play();


        button = new Button("Start");


        button.getStyleClass().clear();
        button.getStyleClass().add("buttonStart");



        button.setOnAction(e -> {
            primaryStage.setScene(Map1.loadMap1());
            Tools.stopMusic(player);
        });


//        scene1.getStylesheets().add(this.getClass().getResource("/StyleSheets/Button.css").toExternalForm());


        //Using Lambada expressions for less code
        Tools.setCoordinates(button, 620, 510);
//        buttonHelp = new Button();
//        buttonHelp.setText("Help");
//        buttonHelp.setOnAction(e -> {
//            System.out.println("Help");
//            primaryStage.setScene(scene2);
//        });
//        Tools.setCoordinates(buttonHelp, 650, 470);

        //button.setOnAction(this) //whenever user clicks the button, look in this class for the handle method
        // this file


//        bp.getChildren().add(buttonStart);

//        bp.getChildren().addAll(buttonHelp);

        primaryStage.getIcons().add(new Image(Main.class.getResourceAsStream("/Images/Duck.png")));
        primaryStage.setFullScreen(false);
        primaryStage.show();


        ImageView background = new ImageView();
        background.setImage(new Image("/Images/StartScreen.jpg"));
        background.setFitWidth(1310);
        background.setFitHeight(670);


        p.getChildren().add(background);
        p.getChildren().add(button);

        try {
            Image img1 = new Image("/Images/Logo.png");
            ImageView imgView1 = new ImageView(img1);
//            Tools.setCoordinates(img1, 650, 150);
            Tools.setCoordinates(imgView1, 350, 150);
            p.getChildren().add(imgView1);
        } catch (NullPointerException e) {
            System.out.println("Error");
        }

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
