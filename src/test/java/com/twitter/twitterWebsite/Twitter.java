package com.twitter.twitterWebsite;

import com.twitter.pages.Home;
import com.twitter.pages.Profile;
import com.twitter.pages.Login;
import com.twitter.pages.containers.Tweet;

public class Twitter {
    public Login login;
    public Home home;
    public Tweet tweet;

    public Profile profile;

    public Twitter() {
        login = new Login();
    }


}
