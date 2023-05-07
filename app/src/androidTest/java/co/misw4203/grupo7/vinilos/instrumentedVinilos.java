package co.misw4203.grupo7.vinilos;

import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

import co.misw4203.grupo7.vinilos.ui.MainActivity;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class instrumentedVinilos {
    @Rule
    public ActivityScenarioRule<MainActivity> mActivityTestRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void mainActivityTest() {
        ViewInteraction skipBtn = onView(allOf(withId(R.id.navigation_home),isDisplayed()));
        skipBtn.perform(click());
        ViewInteraction skipBtn1 = onView(allOf(withId(R.id.navigation_albums),isDisplayed()));
        skipBtn1.perform(click());
        ViewInteraction skipBtn2 = onView(allOf(withId(R.id.navigation_performers),isDisplayed()));
        skipBtn2.perform(click());
        ViewInteraction skipBtn3 = onView(allOf(withId(R.id.navigation_collectors),isDisplayed()));
        skipBtn3.perform(click());
    }

}
