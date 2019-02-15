package android.friendr;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class CreateEvent extends AppCompatActivity {

    MyEditTextDatePicker date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);
        date = new MyEditTextDatePicker(this, R.id.event_date);
    }

}


