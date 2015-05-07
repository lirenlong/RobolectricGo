package com.example.activity;

import android.app.Activity;

import com.example.BuildConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertTrue;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class MainActivityTest {

  @Test
  public void titleIsCorrect() throws Exception {
    Activity activity = Robolectric.setupActivity(MainActivity.class);
    assertTrue(activity.getTitle().toString().equals("Deckard"));
  }
}
