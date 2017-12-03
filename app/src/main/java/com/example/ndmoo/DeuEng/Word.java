package com.example.ndmoo.DeuEng;

/**
 * Created by ndmoo on 24.11.2017.
 */

public class Word {


    private int mDefaultTranslationId;

    private int mGermanTranslationId;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;



    private int mAudioResourceId;

    public Word(int defaultTranslationId, int germanTranslationId,int audioResourceId){
        mDefaultTranslationId = defaultTranslationId;
        mGermanTranslationId = germanTranslationId;
        mAudioResourceId = audioResourceId;
    }

    public Word(int defaultTranslationId, int germanTranslationId, int imageResourceId,int audioResourceId){
        mDefaultTranslationId = defaultTranslationId;
        mGermanTranslationId = germanTranslationId;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }
    public int getmDefaultTranslationId() {
        return mDefaultTranslationId;
    }

    public int getmGermanTranslationId() {
        return mGermanTranslationId;
    }


    /**
     * Returns the image resource ID of the word
     */
    public int getmImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word
     */

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


    /**
     * Returns the audio resource ID of the word
     */
    public int getmAudioResourceId() {
        return mAudioResourceId;
    }
}
