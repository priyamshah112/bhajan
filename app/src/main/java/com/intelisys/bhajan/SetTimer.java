package com.intelisys.bhajan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.Calendar;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

public class SetTimer extends AppCompatActivity {
    private TimePicker timePicker1;
    private TextView time;
    private Calendar calendar;
    private String format = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_set_timer2);

        timePicker1 = (TimePicker) findViewById(R.id.timePicker1);
        time = (TextView) findViewById(R.id.textView1);
        calendar = Calendar.getInstance();

        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int min = calendar.get(Calendar.MINUTE);
        showTime(hour, min);
    }

    public void setTime(View view) {
        int hour = timePicker1.getCurrentHour();
        int min = timePicker1.getCurrentMinute();
        showTime(hour, min);
    }

    public void showTime(int hour, int min) {
        if (hour == 0) {
            hour += 12;
            format = "AM";
        } else if (hour == 12) {
            format = "PM";
        } else if (hour > 12) {
            hour -= 12;
            format = "PM";
        } else {
            format = "AM";
        }

        time.setText(new StringBuilder().append(hour).append(" : ").append(min)
                .append(" ").append(format));
    }


}
