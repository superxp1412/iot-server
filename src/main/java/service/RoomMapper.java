package service;

import com.google.common.collect.ImmutableMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xiaoxu on 10/17/16.
 */
public class RoomMapper {
    private static Map<String, String> mapperRes = new HashMap<String, String>();

    static {
        mapperRes.putAll(roomNameMapper());
    }

    public static String getRoomID(String roomName) {
        return mapperRes.get(roomName);
    }

    public static Map<String, String> roomNameMapper() {
        return ImmutableMap.<String, String>builder()
                .put("Melbourne", "thoughtworks.com_3735393532393133393437@resource.calendar.google.com")
                .put("Sydney", "thoughtworks.com_35383732363538302d373235@resource.calendar.google.com")
                .put("Bangalore", "thoughtworks.com_3536353930303538353530@resource.calendar.google.com")
                .put("Calgary", "thoughtworks.com_2d3534353636383337363332@resource.calendar.google.com")
                .put("London", "thoughtworks.com_3433393438323335333838@resource.calendar.google.com")
                .build();
    }

}
