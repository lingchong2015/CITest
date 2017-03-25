package com.curry.stephen.myapplication;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by Administrator on 2017/3/17.
 */

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class ExampleUnitTestByRobolectric {

    @Test
    public void clickingButtonShouldChangeText() {
        Activity activity = Robolectric.setupActivity(MainActivity.class);
        Button button = (Button) activity.findViewById(R.id.button_click);
        EditText editText = (EditText) activity.findViewById(R.id.edit_text_info);
        TextView textView = (TextView) activity.findViewById(R.id.text_view_info);

        button.performClick();

        assertThat(editText.getText().toString(), equalTo(textView.getText().toString()));
    }
}
