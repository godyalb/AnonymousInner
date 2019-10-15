
package anonymousinnerclass;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @Alberto Godino Berrocal
 * Crear una caja con 3 botones de forma anónima
 */
public class AnonymousInnerClass extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        // Creamos nuestro contenedor
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(5);
        
        // Creamos los botones
        Button btn1 = new Button("New");
        Button btn2 = new Button("Open");
        Button btn3 = new Button("Save");
        Button btn4 = new Button("Print");
        
        // Añadimos los botones al contenedor
        hbox.getChildren().add(btn1);
        hbox.getChildren().add(btn2);
        hbox.getChildren().add(btn3);
        hbox.getChildren().add(btn4);
        
        // Creamos la anonymous inner class para el boton new
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("New");
            }
        });
        
        // Creamos la anonymous inner class para el boton Open
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Open");
            }
        });
        
        // Creamos la anonymous inner class para el boton Save
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Save");
            }
        });
        
        // Creamos la anonymous inner class para el boton Print
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Print");
            }
        });
        
        
        Scene scene = new Scene(hbox, 200, 100);
        
        primaryStage.setTitle("Anonymous Inner Class");
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
