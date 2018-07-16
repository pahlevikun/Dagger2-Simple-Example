package id.pahlevikun.daggersample.sharedpreferences;

public interface MySharedPreferences {

    String getDate();

    void storeDate(String date);

    void clearDate();
}
