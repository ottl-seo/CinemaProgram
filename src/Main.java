import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.sql.*;

public class Main extends Application {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://database-master.cjg477cwca9i.ap-northeast-2.rds.amazonaws.com";

    static final String USER = "admin";
    static final String PASS = "ewhacyber19";

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("롯데베시네마 ~ ♡");
        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {

        System.out.println("Connecting to database...");
        // try (
        //     Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        //     Statement stmt = conn.createStatement();
        //     ) {
        //     stmt.executeQuery("use cinema");
        // } catch(SQLException se) {
        //     se.printStackTrace();
        // }
        launch(args);
    }
}
