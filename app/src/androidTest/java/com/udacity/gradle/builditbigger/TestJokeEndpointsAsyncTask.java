package com.udacity.gradle.builditbigger;

import android.test.ActivityUnitTestCase;

import java.util.concurrent.TimeUnit;

/**
 * Created by edu on 28/10/2015.
 */
public class TestJokeEndpointsAsyncTask extends ActivityUnitTestCase {

    public TestJokeEndpointsAsyncTask(Class activityClass) {
        super(activityClass);
    }

    public void testJokeTeller() {

        JokeEndpointsAsyncTask jokeEndpointsAsyncTask = new JokeEndpointsAsyncTask(getActivity(), new OnJokeDownloadListener() {
            @Override
            public void onJokeDownloaded(String joke) {
                assertTrue("Joke is empty!", !joke.isEmpty());
            }
        });
        jokeEndpointsAsyncTask.execute();

        try {
            jokeEndpointsAsyncTask.get(30, TimeUnit.SECONDS);
        } catch (Exception e) {
            fail("Timed out");
        }

    }

}
