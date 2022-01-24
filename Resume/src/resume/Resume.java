/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resume;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author nexon
 */
public class Resume extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        GridPane GridP = new GridPane();
        Text text1 =  new Text ("Hello, my name is Landon Davies, and this is my interactive resume");
        Text text2 = new Text(" I felt a paper, hand-drafted one was insufficient and didnt quite capture how I do things.");
        Text text3 = new Text ("So i made this one instead, whether you are seeing this or not.");
        
        Button btn1 = new Button();
        btn1.setText("Page 1");
        Button btn2 = new Button();
        btn2.setText("Page 2");
        Button btn3 = new Button();
        btn3.setText("Page 3");
        Button btn4 = new Button();
        btn4.setText("Page 4");
        Button home = new Button();
        home.setText("Home");
        
        
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("this is page 1");
                Text Ctext = new Text ("Lkdftw96@gmail.com");
                GridP.getChildren().remove(0,0);
                GridP.add(Ctext,0,0);
            }
        });
        
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("page 2");
            }
        });
        
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("3");
            }
        });
        
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("4");
            }
        });
        
        home.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                GridPane gpane = new GridPane();
                Text text7 =new Text("hi im a new gridpane");
                gpane.add(text7,0,0);
                
                Scene scene = new Scene(gpane, 50, 40);
        
        primaryStage.setTitle("test");
        primaryStage.setScene(scene);
        primaryStage.show();
            }
        });
        GridP.setAlignment(Pos.CENTER);
        
        GridP.add(text1,0,0);
        GridP.add(text2,0,1);
        GridP.add(text3,0,2);
        GridP.add(btn1,0,3);
        GridP.add(btn2,1,3);
        
        /*GridP.add(btn3,2,3);
        GridP.add(btn4,3,3);
        GridP.add(home,4,3);*/
        
        Scene scene = new Scene(GridP, 500, 400);
        
        primaryStage.setTitle("Interactive Resume");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
