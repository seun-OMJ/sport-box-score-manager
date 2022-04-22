package com.example.sports_box_score_manager.Presentation;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
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
public class ScoreActivityTest{

    @Rule
    public ActivityTestRule<ScoreActivity> activityRule = new ActivityTestRule<>(ScoreActivity.class);

    @Before
    public void setUp(){

    }
    @Test
    public void useScoreBoard(){

        onView(withId(R.id.button_start)).perform(click());
        for(int i = 0; i<5;i++){
            onView(withId(R.id.button9)).perform(click());
            onView(withId(R.id.button12)).perform(click());
        }
        for(int i = 0; i<3;i++){
            onView(withId(R.id.button11)).perform(click());
            onView(withId(R.id.button13)).perform(click());
        }
        onView(withId(R.id.button_start)).perform(click());
        onView(withId(R.id.button_reset)).perform(click());
        onView(withId(R.id.resetButton)).perform(click());


    }
}