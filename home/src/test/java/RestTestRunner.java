import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * Created by alex on 30/01/2017.
 */
public class RestTestRunner {
    public static void main(String[] args) throws Throwable {
        BasicConfigurator.configure();
        Logger.getRootLogger().setLevel(Level.INFO);

        final HttpResponse<String> response = RestFacade.get("https://jsonplaceholder.typicode.com/posts/1");
        final HttpResponse<MyObject> responseObject = Unirest.get("https://jsonplaceholder.typicode.com/posts/1").asObject(MyObject.class);

        Gson gson = new Gson();
        final MyObject object = gson.fromJson(String.valueOf(response.getBody()), MyObject.class);
    }
}