package nyc.c4q.nyteam.nynow.WeatherUI;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Parcelable;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;

import nyc.c4q.nyteam.nynow.R;

//public class DailyActivity extends ListActivity {

//    private Daily[] mDays;

//<--------------These variables are for Activity instead of ListActivity---------->
//    @InjectView(android.R.id.list) ListView mListView;
//    @InjectView(android.R.id.empty) TextView mEmptyView;
//<-------------------------------------------------------------------------------->

    // This sets up the adapter for the listView for Weeks (Daily).
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_daily);
//
//        Intent intent = getIntent();
//        Parcelable[] parcelable = intent.getParcelableArrayExtra(CurrentActivity.DAILY_FORECAST);
//        mDays = Arrays.copyOf(parcelable, parcelable.length, Daily[].class);
//
//        DayAdapter adapter = new DayAdapter(this, mDays);
//        setListAdapter(adapter);


//<--------------------------This section is for Activity instead of ListActivity ----------------------------------->
//        mListView.setAdapter(adapter);
//        mListView.setEmptyView(mEmptyView);
//        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                String dayOfTheWeek=  mDays[i].getDayOfTheWeek();
//                String conditions = mDays[i].getSummary();
//                String temp = mDays[i].getTemperatureMax() + "";
//                String message = String.format("On %s the temperature will be %s and %s",
//                        dayOfTheWeek, temp, conditions);
//                Toast.makeText(DailyActivity.this, message, Toast.LENGTH_LONG).show();
//            }
//        });
//<------------------------------------------------------------------------------------------------------------------>

//    }

    // This message will show if the user clicks on a list item.
//    @Override
//    protected void onListItemClick(ListView l, View v, int position, long id) {
//        super.onListItemClick(l, v, position, id);
//        String dayOfTheWeek=  mDays[position].getDayOfTheWeek();
//        String conditions = mDays[position].getSummary();
//        String temp = mDays[position].getTemperatureMax() + "";
//        String message = String.format("On %s the temperature will be %s and %s",
//                dayOfTheWeek, temp, conditions);
//        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
//
//    }
//}
