package nyc.c4q.nyteam.nynow;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;


/**
 * Created by c4q-vanice on 6/22/15.
 */

// Getters and Setters for Weather functions.
public class NYCWeather {
    private String mLocation;
    private String mIcon;
    private long mTime;
    private double mTemperature;
    private double mHumidity;
    private double mPrecipitation;
    private String mSummary;
    private String mTimeZone;

    public String getTimeZone() {
        return mTimeZone;
    }

    public void setTimeZone(String timezone) {
        mTimeZone = timezone;
    }


    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String location) {
        mLocation = location;
    }

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    // method to convert time to a String
    public String getFormattedTime(){
        SimpleDateFormat format = new SimpleDateFormat("h:mm a");
        format.setTimeZone(TimeZone.getTimeZone(getTimeZone()));
        Date timefromdate = new Date(getTime()* 1000);
        String timeString = format.format(timefromdate);
        return timeString;
    }

    public String getIcon() {
        return mIcon;
    }

    public int getIconId(){

        int iconId = R.drawable.clear_day;

        if (mIcon.equals("clear-day")){
            iconId = R.drawable.clear_day;
        }
        else if (mIcon.equals("clear-night")){
            iconId = R.drawable.clear_night;
        }
        else if (mIcon.equals("rain")){
            iconId = R.drawable.rain;
        }
        else if (mIcon.equals("snow")){
            iconId = R.drawable.snow;
        }
        else if (mIcon.equals("sleet")) {
            iconId = R.drawable.sleet;
        }
        else if (mIcon.equals("wind")) {
            iconId = R.drawable.wind;
        }
        else if (mIcon.equals("fog")) {
            iconId = R.drawable.fog;
        }
        else if (mIcon.equals("cloudy")) {
            iconId = R.drawable.cloudy;
        }
        else if (mIcon.equals("partly-cloudy-day")) {
            iconId = R.drawable.partly_cloudy;
        }
        else if (mIcon.equals("partly-cloudy-night")) {
            iconId = R.drawable.cloudy_night;
        }
        return iconId;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public int getTemperature() {
        return (int) Math.round(mTemperature);
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    public double getHumidity() {
        return mHumidity;
    }

    public void setHumidity(double humidity) {
        mHumidity = humidity;
    }

    public int getPrecipitation() {
        double precip = mPrecipitation * 100;
        return (int) Math.round(precip);
    }

    public void setPrecipitation(double precipitation) {
        mPrecipitation = precipitation;
    }
}
