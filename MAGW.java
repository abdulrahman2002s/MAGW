package magw;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
/**
 *  @Abdulrahman - Abdulrahman.radhi.2002@gmail.com
 */
public class MAGW extends Application {
    @Override
    public void start(Stage primaryStage) {

        Label la1 = new Label();
        TextField t1 = new TextField();
        t1.setId("t1");
        Label la2 = new Label();
        TextField t2 = new TextField();
        t2.setId("t1");
        Label la3 = new Label();
        TextField t3 = new TextField();
        t3.setId("t1");
        
        Label laRes1 = new Label("Q1: ");
        Label laRes2 = new Label("Q2: ");
        Label laRes3 = new Label("Q3: ");
        Button btn = new Button("تأكد");
               
       int ssd1= (int) (Math.random()*10);
       int ssd2= (int) (Math.random()*10);
       la1.setText(String.valueOf("="+ssd1+"+"+ssd2));
       int ssd3= (int) (Math.random()*10);
       int ssd4= (int) (Math.random()*10);
       la2.setText(String.valueOf("="+ssd3+"+"+ssd4));
       int ssd5= (int) (Math.random()*10);
       int ssd6= (int) (Math.random()*10);
       la3.setText(String.valueOf("="+ssd5+"+"+ssd6));
        
       btn.setOnAction(event->{
       int h = Integer.parseInt(t1.getText()); 
       int h2 = Integer.parseInt(t2.getText());
       int h3 = Integer.parseInt(t3.getText());
       String Q1 = th(h,ssd1,ssd2);
       String Q2 = th(h2,ssd3,ssd4);
       String Q3 = th(h3,ssd5,ssd6);
       laRes1.setText("Q1: "+Q1+" "+""+" ");
       laRes2.setText("Q2: "+Q2+" "+""+" ");
       laRes3.setText("Q3: "+Q3+" "+""+"  ");
       });
       
        GridPane grid = new  GridPane();  
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new javafx.geometry.Insets(10,10,10,10));
        
        grid.add(la1,1,0);
        grid.add(t1,0,0);
        grid.add(la2,1,1);
        grid.add(t2,0,1);
        grid.add(la3,1,2);
        grid.add(t3,0,2);
        grid.add(laRes1,0,4);
        grid.add(laRes2,0,5);
        grid.add(laRes3,0,6);
        grid.add(btn,1,4);
     
        Scene scene = new Scene(grid,300,450);
        scene.getStylesheets().add(MAGW.class.getResource("MAGW.css").toExternalForm());
        primaryStage.setTitle("MAGW");
        primaryStage.setScene(scene);
        primaryStage.show(); 
  }
        public static void main(String[] args) { launch(args); }
    
   
        public static String th(int h,int ssd,int ssd2){
        String thfez=null;
        int s =ssd+ssd2;
        if(ssd+ssd2==h)
        thfez ="صح";
        else  
        thfez="["+s+"]"+"<--"+"خطأ";
        return thfez;
    }
        
}

