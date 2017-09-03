package org.baby.soundsystem;

import java.util.List;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: baby
 * Date: 2017/9/3
 * Time: 19:03
 */
public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    public void play() {
        System.out.println("Playing" + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("Track: " + track);
        }
    }
}
