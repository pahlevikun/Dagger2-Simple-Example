package id.pahlevikun.daggersample.myexample;

import java.util.Date;

public class MyExampleImplementation implements MyExample {

    private long mDate;

    public MyExampleImplementation() {
        mDate = new Date().getTime();
    }

    public long getDate() {
        return mDate;
    }

}
