package maps;

import ru.rzd.train.Wagon;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class WagonMap {

    public Map<String, Object> getMapWagon(Wagon wagon) {
        Map<String, Object> map = new HashMap<>();
        map.put("WagonId",  UUID.fromString(wagon.getId()));
        map.put("WagonNum", wagon.getNum());
        map.put("WagonSeats", wagon.getSeats());
        map.put("WagonType", wagon.getType());
        map.put("UUIDTrain", UUID.fromString(wagon.getUuidTrain()));
        return map;
    }
}