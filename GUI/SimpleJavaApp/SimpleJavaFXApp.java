import javafx.application.Application;
import javafx.scene.Scene;
//import javafx.scene.control.Button;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.layout.*;
//import javafx.scene.layout.Pane;
//import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.text.*;



/* public class SimpleJavaFXApp extends Application {

    @Override
    public void start(Stage primaryStage){
        Button btOk = new Button("Semere");
        Scene scene = new Scene(btOk, 200, 250);
        primaryStage.setTitle("Example2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String args[]){
        launch(args);
    }
}
*/
/* 

//multistage
public class SimpleJavaFXApp extends Application {
    @Override
    public void start(Stage primaryStage){
        Scene scene = new Scene(new Button("ok"), 250, 200);
        primaryStage.setTitle("Multi stage1");
        primaryStage.setScene(scene);
        primaryStage.show();

        Stage stage = new Stage();
        stage.setTitle("multistage2");
        stage.setScene(new Scene(new Button("cancel"), 300, 350, Color.BLUE));
        //to disable auto resizing
        //stage.setResizable(false);
        //stage.setFullScreen(true);
        stage.show();
        }
        public static void main(String args[]){
            launch(args);
        }
}
*/

/* 
//Button inside pane
public class SimpleJavaFXApp extends Application{
    public void start(Stage primaryStage){
        StackPane pane = new StackPane();
        pane.getChildren().add(new Button("OK"));
       // StackPane pane = new StackPane(new Button("OK"));
        Scene scene = new Scene(pane,200,50);
        primaryStage.setTitle("ButtonInsidePane");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    public static void main(String args[]){
        launch(args);
    }
}
    */
/* 
public class SimpleJavaFXApp extends Application {
    public void start(Stage primaryStage){
        Circle circle = new Circle();
        
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.GREEN);

        Pane pane = new Pane(circle);

        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));

        pane.setRotate(45);
        pane.setStyle("-fx-border:blue; -fx-background-color: gray;");
        Scene scene = new Scene(pane,400,400);

        primaryStage.setTitle("Show CIrcle");
        primaryStage.setScene(scene);
        primaryStage.show();

        Stage stage = new Stage();
        Button btOK = new Button("OK");
        btOK.setStyle("-fx-border-color: red;");
        StackPane pane2 = new StackPane(btOK); 
        Scene scene2 = new Scene(pane2, 400, 400);
        stage.setTitle("Styled Button");
        stage.setScene(scene2);
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}
    */
public class SimpleJavaFXApp extends Application {
    public void start(Stage primaryStage){
        Pane pane = new StackPane();
        Circle circle = new Circle();
        circle.setRadius(50);
        circle.setFill(new Color(0.5, 0.5, 0.5, 0.1));
        circle.setStroke(Color.BLACK);
        pane.getChildren().add(circle);

        Label label = new Label("JAVAFX");
        label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
        pane.getChildren().add(label);

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Font");
        primaryStage.show();
        }
        public static void main(String args[]){
            launch(args);
        }
}