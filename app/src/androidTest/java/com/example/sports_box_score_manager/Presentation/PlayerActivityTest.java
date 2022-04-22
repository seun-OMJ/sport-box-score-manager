package com.example.sports_box_score_manager.Presentation;

import junit.framework.TestCase;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import com.example.sports_box_score_manager.R;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class PlayerActivityTest {

    @Rule
    public ActivityTestRule<PlayerActivity> activityRule = new ActivityTestRule<>(PlayerActivity.class);



    @Test
    public void addPlayerNames() {

        onView(withId(R.id.editTextTextPersonName)).perform(typeText("TestPlayer1"));
        onView(withId(R.id.editTextTextPersonName2)).perform(typeText("TestPlayer2"));
        onView(withId(R.id.editTextTextPersonName2)).perform(closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
    }
}