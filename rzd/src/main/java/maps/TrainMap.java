package maps;

import ru.rzd.train.Train;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TrainMap {

    public Map<String, Object> getMapTrain(Train train) {
        Map<String, Object> map = new HashMap<>();
        map.put("TrainId", UUID.fromString(train.getId()));
        map.put("TrainName", train.getName());
        map.put("TrainLocomotiveType", train.getLocomotiveType());
        map.put("TrainDateTime", new Timestamp(train.getFormDate().toGregorianCalendar().getTimeInMillis()));
        map.put("TrainWagons", train.getWagons().getWagon());
        return map;
    }
}