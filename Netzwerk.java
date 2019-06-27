import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import javafx.concurrent.*;

class Netzwerk
{
    String API_URL = "https://sabsloe-mysocialbot-1.glitch.me/api";
   

    public void post(String nachricht){  
        final Task<String> task = new Task<String>() {
                protected String call() throws Exception {
                    String erg = null;
                    try {
                        URL url = new URL(API_URL);  

                        HttpURLConnection con = (HttpURLConnection) url.openConnection();
                        con.setRequestMethod("POST");
                        con.setRequestProperty("Content-Type", "application/json");

                        
                        con.setDoOutput(true);
                        OutputStreamWriter out = new OutputStreamWriter(
                                con.getOutputStream());
                        out.write(nachricht);
                        out.close();

                        String readStream = readStream(con.getInputStream());
                        // Give output for the command line
                        System.out.println(readStream);
                        erg = readStream;
                        

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return erg;
                }
            };


        Thread thread = new Thread(task);
        thread.start();

    }

    
    private static String readStream(InputStream in) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(in));) {

            String nextLine = "";
            while ((nextLine = reader.readLine()) != null) {
                sb.append(nextLine);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

}
