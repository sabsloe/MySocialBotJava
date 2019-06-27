import javafx.application.Application;

import javafx.stage.Stage;


/**
 * Hauptanwendung
 */

public class App extends Application {

    public void start(Stage stage)
    {
      

        SpassBot s = new SpassBot("Mixi");
        s.nachrichtSenden();

    }
    public static void main(String[] args) {
        Application.launch(args);
    }

}
