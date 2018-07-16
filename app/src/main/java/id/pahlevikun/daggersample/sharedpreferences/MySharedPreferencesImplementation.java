package id.pahlevikun.daggersample.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;

public class MySharedPreferencesImplementation implements MySharedPreferences {

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private static final int PRIVATE_MODE = 0;

    public MySharedPreferencesImplementation(Context context) {
        sharedPreferences = context.getSharedPreferences("sharedPreferences", PRIVATE_MODE);
        editor = sharedPreferences.edit();
    }

    @Override
    public String getDate() {
        return sharedPreferences.getString("date", "No Date");
    }

    @Override
    public void storeDate(String date) {
        editor.putString("date", date);
        editor.commit();
    }

    @Override
    public void clearDate() {
        editor.clear();
        editor.commit();
    }
}
