package nz.allthethings.wharehauora.models;

import io.realm.RealmObject;

public class Home  extends RealmObject {
    private String name;
    private User owner;
}
