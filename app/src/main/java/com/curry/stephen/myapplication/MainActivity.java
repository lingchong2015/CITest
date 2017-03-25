package com.curry.stephen.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/3/7.
 */

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textViewInfo = (TextView) findViewById(R.id.text_view_info);
        final EditText editTextInfo = (EditText) findViewById(R.id.edit_text_info);
        Button buttonClick = (Button) findViewById(R.id.button_click);
        buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editTextInfo.getText().toString();
                textViewInfo.setText(s);
//                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
//                startActivity(intent);
            }
        });
//        textViewInfo.setText(BuildConfig.Hello);
    }
}
