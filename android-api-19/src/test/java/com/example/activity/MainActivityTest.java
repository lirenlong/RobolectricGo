package com.example.activity;

import android.app.Activity;
import android.content.Intent;

import com.example.BuildConfig;
import com.example.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.robolectric.Shadows.shadowOf;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class MainActivityTest {

  @Test
  public void titleIsCorrect() throws Exception {
    Activity activity = Robolectric.setupActivity(MainActivity.class);
    assertTrue(activity.getTitle().toString().equals("Deckard"));
  }

  @Test
  public void clickLogin_shouldStartLoginActivity() {
    Activity activity = Robolectric.setupActivity(MainActivity.class);
    activity.findViewById(R.id.button1).performClick();

    Intent i = new Intent(activity, LoginActivity.class);

    assertTrue(shadowOf(activity).getNextStartedActivity().equals(i));
  }
}
