package nz.allthethings.wharehauora.models;

import io.realm.RealmList;
import io.realm.RealmObject;

public class Home  extends RealmObject {
    private String name;
    private User owner;
    public RealmList<Sensor> sensors;
}
