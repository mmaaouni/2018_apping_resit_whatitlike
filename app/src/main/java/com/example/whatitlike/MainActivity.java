package com.example.whatitlike;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import static android.content.ContentValues.TAG;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);

        ListView main_list = (ListView) findViewById(R.id.main_list);
        main_list.setEmptyView(main_list);


        ImageButton aboutButton= (ImageButton) findViewById(R.id.about);
        main_list.setOnClickListener(this);
        /*conincrementButton = (Button) findViewById(R.id.button1);
        incrementButton.setOnClickListener(this);*/

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.about)
        {


            Log.d(TAG, "increment button was clicked");
        }
        else
        {
            Log.d(TAG, "another button was clicked");
        }
    }


    public void onClickAbout(View v )
    {
        Intent n = new Intent();

        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        String message = "Hello from another world";
        intent.putExtra("MESSAGE", message);
        startActivity(intent);
    }

}
