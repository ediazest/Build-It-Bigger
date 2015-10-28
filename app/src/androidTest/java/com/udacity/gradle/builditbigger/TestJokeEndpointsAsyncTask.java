package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

import java.util.concurrent.TimeUnit;

/**
 * Created by edu on 28/10/2015.
 */
public class TestJokeEndpointsAsyncTask extends AndroidTestCase {

    public static final String LOG_TAG = TestJokeEndpointsAsyncTask.class.getSimpleName();

    public void testJokeTeller() {

        JokeEndpointsAsyncTask jokeEndpointsAsyncTask = new JokeEndpointsAsyncTask(getContext(), new OnJokeDownloadListener() {
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
