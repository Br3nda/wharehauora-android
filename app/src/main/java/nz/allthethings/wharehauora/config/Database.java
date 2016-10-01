package nz.allthethings.wharehauora.config;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class Database {
    public static void setup(Application application) {
        Realm.init(application);
        RealmConfiguration config = new RealmConfiguration.Builder().build();
        Realm.setDefaultConfiguration(config);
    }
}
