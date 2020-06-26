package top.proverbs;

import top.proverbs.facade.VideoConversionFacade;

import java.io.File;

/**
 * It's similar to Adaptor, but it works for a bigger and more complex system.
 * */
public class Main {

    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}
