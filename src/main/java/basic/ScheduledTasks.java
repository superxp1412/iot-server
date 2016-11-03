package basic;

import model.RoomSource;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import service.DataPaddingService;

import java.util.List;

/**
 * Created by xiaoxu on 24/10/2016.
 */
@Component
public class ScheduledTasks {
    private static final Logger LOGGER = LoggerFactory.getLogger(ScheduledTasks.class);
    private final static String url = "http://localhost:8080/";

    @Scheduled(fixedRate = 120000)
    public void saveData() {
        LOGGER.info("time is: " + DateTime.now());
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getForObject(url + "get",List.class);
    }
}
