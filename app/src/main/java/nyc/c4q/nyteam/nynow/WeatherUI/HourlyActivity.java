package nyc.c4q.nyteam.nynow.WeatherUI;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;

import butterknife.ButterKnife;
import butterknife.InjectView;
import nyc.c4q.nyteam.nynow.R;

//public class HourlyActivity extends ActionBarActivity {
//
//    private Hour[] mHours;
//    @InjectView(R.id.RecyclerView)
//    RecyclerView mRecyclerView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_hourly);
//        ButterKnife.inject(this);
//
//        Intent intent = getIntent();
//        Parcelable[] parcelables = intent.getParcelableArrayExtra(CurrentActivity.HOUR_FORECAST);
//        mHours = Arrays.copyOf(parcelables, parcelables.length, Hour[].class);
//        HourAdapter adapter = new HourAdapter(this, mHours);
//        mRecyclerView.setAdapter(adapter);
//
////Recycler needs a layout manager.
//        RecyclerView.LayoutManager LayoutManger = new LinearLayoutManager(this);
//        mRecyclerView.setLayoutManager(LayoutManger);
//        mRecyclerView.setHasFixedSize(true);
//
//    }
//}
