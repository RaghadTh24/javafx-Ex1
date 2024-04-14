package com.mycompany.ex1;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
  * @author raghad
 */
public class Excercise1 extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Text t1 = new Text("Welcome to java");
        t1.setX(120);
        t1.setY(90);
        Pane p = new Pane();
        p.setMinHeight(200);
        p.setStyle("-fx-border-color: black; -fx-border-width: 1px");
        p.getChildren().addAll(t1);
        RadioButton r1 = new RadioButton("Red");
        RadioButton r2 = new RadioButton("Yellow");
        RadioButton r3 = new RadioButton("Black");
        RadioButton r4 = new RadioButton("Orange");
        RadioButton r5 = new RadioButton("Green");
        r3.setSelected(true);
        HBox forRadio = new HBox(20);
        forRadio.getChildren().addAll(r1, r2, r3, r4, r5);
        forRadio.setAlignment(Pos.CENTER);
        ToggleGroup radio = new ToggleGroup();
        r1.setToggleGroup(radio);
        r2.setToggleGroup(radio);
        r3.setToggleGroup(radio);
        r4.setToggleGroup(radio);
        r5.setToggleGroup(radio);
        HBox forbutton = new HBox(10);
        Button left = new Button("<=");
        Button right = new Button("=>");
        forbutton.getChildren().addAll(left, right);
       forbutton.setPadding(new Insets(0,0,0,170));
        VBox root = new VBox(20);
        root.getChildren().addAll(forRadio, p,forbutton);

        r1.setOnAction(e -> {
            t1.setFill(Color.RED);
        });

        r2.setOnAction(e -> {
            t1.setFill(Color.YELLOW);

        });
        r3.setOnAction(e -> {
            t1.setFill(Color.BLACK);

        });
        r4.setOnAction(e -> {
            t1.setFill(Color.ORANGE);

        });
        r5.setOnAction(e -> {
            t1.setFill(Color.GREEN);

        });
        right.setOnAction(e -> {
            t1.setX(t1.getX()+10);

        });
        left.setOnAction(e -> {
            t1.setX(t1.getX()-10);

        });
        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("Lab4");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

}