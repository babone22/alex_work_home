import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;


/**
 * Created by alex on 20/01/2017.
 */
public class RestFacade {
    public static HttpResponse<String> get(final String address) throws UnirestException {
        return Unirest.get(address).asString();
    }

    public static <T> HttpResponse<T> getRequestAsObject(String address, Class<T> clazz) throws UnirestException {
        return Unirest.get(address).asObject(clazz);
    }
}


