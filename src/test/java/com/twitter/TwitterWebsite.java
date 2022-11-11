package com.twitter;

import com.twitter.pages.Home;
import com.twitter.pages.Profile;
import com.twitter.pages.containers.Login;
import com.twitter.pages.containers.Tweet;

public class TwitterWebsite {
    public Login login;
    public Home home;
    public Tweet tweet;

    public Profile profile;

    public TwitterWebsite() {
        login = new Login();
    }


}
