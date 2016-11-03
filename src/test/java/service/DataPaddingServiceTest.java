package service;

import com.google.api.services.calendar.model.Event;
import com.google.gson.Gson;
import model.RoomSource;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaoxu on 10/19/16.
 */
public class DataPaddingServiceTest {
    Gson gson = new Gson();

    @Test
    public void testGetMeetingRoomDetails() throws Exception {
        List<RoomSource> rs = new ArrayList<>();
       System.out.println(new DataPaddingService(rs).getCalendarDetails());
    }
}
