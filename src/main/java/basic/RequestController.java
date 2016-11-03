package basic;

import service.DataPaddingService;
import service.GoogleCalendarService;
import com.google.api.services.calendar.model.FreeBusyResponse;
import com.google.gson.Gson;
import model.Greeting;
import model.RoomSource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by peixu on 7/3/16 12:41.
 */
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class RequestController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private Gson gson = new Gson();

    @RequestMapping(value = "/hello-world", method = RequestMethod.GET)
    public Greeting sayHello(@RequestParam(value = "name", required = false, defaultValue = "Stranger") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @RequestMapping(value = "/busyFree")
    public FreeBusyResponse getRoomBusyfree(@RequestParam(value = "name", required = false, defaultValue = "Melbourne") String name) throws IOException {
        return new GoogleCalendarService(name).getFreeBusy();
    }
}