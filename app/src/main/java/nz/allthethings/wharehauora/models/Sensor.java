package nz.allthethings.wharehauora.models;

import io.realm.RealmList;
import io.realm.RealmObject;

public class Sensor extends RealmObject {
    private Home home;
    private String room_name;
    public RealmList<Reading> readings;
}
