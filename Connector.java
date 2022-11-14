import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class CLIent {

    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("No URL provided");
            System.exit(1);
            return;
        }
        URL url = new URL(args[0]);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setConnectTimeout(30000);
        con.setReadTimeout(30000);
        try (InputStream stream = con.getInputStream()) {
            System.out.println(new String(stream.readAllBytes(), StandardCharsets.UTF_8));
        }
    }
}
