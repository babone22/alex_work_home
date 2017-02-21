import com.mashape.unirest.http.HttpResponse;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by alex on 20/01/2017.
 */
public class testRest {

    public static void mageGet() throws Throwable {
        HttpResponse<String> response = RestFacade.get("http://localhost:3000/api/products");
    }

    public static void makeGetAsObject(String address) throws Throwable {
        // HttpResponse<JsonNode> myOwnObject = RestFacade.getRequestAsObject(address, MyObject.class);
    }
}

@Data
@AllArgsConstructor
class MyObject {
    private String userId;
    private String id;
    private String title;
    private String body;
}
