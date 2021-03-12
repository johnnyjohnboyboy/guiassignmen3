
package guiassignmen3;
//imports necessary classes
import javafx.application.Application;

import javafx.scene.Group;

import javafx.scene.Scene;

import javafx.scene.paint.Color;

import javafx.scene.shape.Circle;


import javafx.scene.shape.Polyline;

import javafx.scene.shape.Rectangle;

import javafx.stage.Stage;

//extended gui class with javafx application class
public class Guiassignmen3 extends Application {

  
  //create a group that group shapes
  Group gp;
  

   public static void main(String[] args) {

      //extends gui class with javafx application class
    launch(args);

  }
//Override allows subclass or child class to provide a specific implentation of a method that is already
//provided by one of its super-classes or parent class
    @Override
    //starting the stage to construct shapes and lines
    public void start(Stage stage) throws Exception {
        
        //Rectangle objects are made using new and then setting up x, y, and then things like the color, arc width, etc.
        Rectangle background = new Rectangle(700, 500, Color.LIGHTBLUE);
        Rectangle grass = new Rectangle(700, 300, Color.GREEN);
        grass.setLayoutX(0);
        grass.setLayoutY(200);
        
        
        
        
        //polyline that makes triangle by making three points and a fourth point that is the same as first
        Polyline triangle = new Polyline();
        triangle.getPoints().addAll(new Double[]{
        70.0, 100.0,
        345.0, 10.0,
        618.0, 100.0,
        70.0, 100.0
    });
        
        //fills color with white and stroke to black
        triangle.setFill(Color.WHITE);
        triangle.setStroke(Color.BLACK);
       
       
        //rectangle below triangle
        Rectangle below = new Rectangle(550, 10, Color.WHITE);
        below.setStroke(Color.BLACK);
        below.setLayoutX(70);
        below.setLayoutY(100);
        //rct is main red part of house,
        Rectangle rct = new Rectangle(550, 300, Color.MAROON);
        rct.setLayoutX(70);
        rct.setLayoutY(100);
        rct.setStroke(Color.BLACK);
        
        
Rectangle pillar = new Rectangle(35, 270, Color.WHITE); //pillar
pillar.setStroke(Color.BLACK);
pillar.setLayoutX(90);
pillar.setLayoutY(110);

//circles of pillar
//sets up horizontal center, vertical center, radius of circle
Circle cp =new Circle();
cp.setStroke(Color.BLACK);
cp.setFill(Color.WHITE);
cp.setCenterX(70.0f);
cp.setCenterY(70.0f);
cp.setRadius(15.0f);
cp.setLayoutX(15);
cp.setLayoutY(55);

Circle cp2 =new Circle();
cp2.setStroke(Color.BLACK);
cp2.setFill(Color.WHITE);
cp2.setCenterX(70.0f);
cp2.setCenterY(70.0f);
cp2.setRadius(15.0f);
cp2.setLayoutX(55);
cp2.setLayoutY(55);

Rectangle pillar2 = new Rectangle(35, 270, Color.WHITE); //second pillar
pillar2.setStroke(Color.BLACK);
pillar2.setLayoutX(250);
pillar2.setLayoutY(110);


//second pair of circles of pillar
Circle cp3 =new Circle();
cp3.setStroke(Color.BLACK);
cp3.setFill(Color.WHITE);
cp3.setCenterX(70.0f);
cp3.setCenterY(70.0f);
cp3.setRadius(15.0f);
cp3.setLayoutX(175);
cp3.setLayoutY(55);


Circle cp4 =new Circle();
cp4.setStroke(Color.BLACK);
cp4.setFill(Color.WHITE);
cp4.setCenterX(70.0f);
cp4.setCenterY(70.0f);
cp4.setRadius(15.0f);
cp4.setLayoutX(215);
cp4.setLayoutY(55);




//third pillar     
Rectangle pillar3 = new Rectangle(35, 270, Color.WHITE); //pillar
pillar3.setStroke(Color.BLACK);
pillar3.setLayoutX(400);
pillar3.setLayoutY(110);

//third pair of circles of pillar
Circle cp5 =new Circle();
cp5.setStroke(Color.BLACK);
cp5.setFill(Color.WHITE);
cp5.setCenterX(70.0f);
cp5.setCenterY(70.0f);
cp5.setRadius(15.0f);
cp5.setLayoutX(325);
cp5.setLayoutY(55);

Circle cp6 =new Circle();
cp6.setStroke(Color.BLACK);
cp6.setFill(Color.WHITE);
cp6.setCenterX(70.0f);
cp6.setCenterY(70.0f);
cp6.setRadius(15.0f);
cp6.setLayoutX(365);
cp6.setLayoutY(55);
        
Rectangle pillar4 = new Rectangle(35, 270, Color.WHITE); // fourth pillar
pillar4.setStroke(Color.BLACK);
pillar4.setLayoutX(560);
pillar4.setLayoutY(110);

//fourth pair of circles
Circle cp7 =new Circle();
cp7.setStroke(Color.BLACK);
cp7.setFill(Color.WHITE);
cp7.setCenterX(70.0f);
cp7.setCenterY(70.0f);
cp7.setRadius(15.0f);
cp7.setLayoutX(485);
cp7.setLayoutY(55);

Circle cp8 =new Circle();
cp8.setStroke(Color.BLACK);
cp8.setFill(Color.WHITE);
cp8.setCenterX(70.0f);
cp8.setCenterY(70.0f);
cp8.setRadius(15.0f);
cp8.setLayoutX(525);
cp8.setLayoutY(55);
        
        //door is the door/vertical black rectangle of the house
        Rectangle door = new Rectangle(55.4, 100, Color.BLACK);
        door.setLayoutX(314.786);
        door.setLayoutY(272);
        
        //doorknob is the orange circle in the door
        Circle doorknob = new Circle();
        doorknob.setFill(Color.ORANGE);
        doorknob.setCenterX(50.0f);
        doorknob.setCenterY(50.0f);
        doorknob.setRadius(3.0f);
        doorknob.setLayoutX(314.786);
        doorknob.setLayoutY(279);
        
        //stairs in array form
     int size=6, stp=4;
        Rectangle[] stairs = new Rectangle[size];
        
        
//support is the floor that holds the pillars        
Rectangle support = new Rectangle(230, 20, Color.LIGHTGRAY);
support.setLayoutX(70);
support.setLayoutY(380);
support.setStroke(Color.BLACK);

        
Rectangle support2 = new Rectangle(235, 20, Color.LIGHTGRAY);
support2.setLayoutX(385);
support2.setLayoutY(380);
support2.setStroke(Color.BLACK);
        
        //groups all shapes into gp
        //extras are put in using gp.getChildren().add();
       gp = new Group(background, grass, rct, below, door, pillar, doorknob, cp, cp2, pillar2, cp3, cp4, pillar3, cp5, cp6, pillar4, cp7, cp8, support, support2);
        
        //gets list of children of this parent and adds the triangle polygon
        //getChildren shortens required code for adding a child to group
        gp.getChildren().add(triangle);
        
        //this for loop ensures that each step becomes wider starting from top to bottom
        for (int i = 0; i<size; i++)
        {
            
            stairs[i] = new Rectangle(45 - (i*stp) + 1*i, (3 +  (i*stp)), ( 55 + (i*stp) + 2*i), (5 + (i*stp) - 3.5*i));
            
            stairs[i].setFill(Color.LIGHTGRAY);
            stairs[i].setStroke(Color.BLACK);
            stairs[i].setLayoutX(270);
            stairs[i].setLayoutY(369.5);
            
            //adds stairs to group
            gp.getChildren().add(stairs[i]);
        }
       
        
        //creates scene with the group of shapes on a 700x500 window
        Scene sn = new Scene (gp, 700, 500);
        //attachs scene object to stage
        stage.setScene(sn);
        //creates title "My House" as title of window
        stage.setTitle("My house");
        //displays stage
        stage.show();
    }
}
