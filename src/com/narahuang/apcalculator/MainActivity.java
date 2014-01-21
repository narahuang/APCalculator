package com.narahuang.apcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;
import java.util.Date;
import java.util.Calendar;
//import java.util.concurrent.TimeUnit;
//import java.text.SimpleDateFormat;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apcount();
    }
    
    public void apcount() {
    	int now_hour;
    	int now_min;
    	int now_min_total;
    	int timediff;
    	int cct;
    	Date date = new Date();
    	Calendar now = Calendar.getInstance();
    	now.setTime(date);
    	now_hour = now.get(Calendar.HOUR_OF_DAY);
    	now_min = now.get(Calendar.MINUTE);
    	now_min_total = now_hour*60 + now_min;
    	timediff = 1380 - now_min_total; 
    	cct = timediff / 8;
    	TextView result = (TextView)findViewById(R.id.result);
    	result.setText(":"+cct);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
