package com.example.android.miwok;

/*
 *  Copyright (c) 2018 Alticast Corp.
 *  All rights reserved. http://www.alticast.com/
 *
 *  This software is the confidential and proprietary information of
 *  Alticast Corp. ("Confidential Information"). You shall not
 *  disclose such Confidential Information and shall use it only in
 *  accordance with the terms of the license agreement you entered into
 *  with Alticast.
 */
public class Word {
    private static final int NO_IMAGE_PROVIDED = -1;

    private String miwok_translation;
    private String default_translation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int audioResourceId;


    public Word(String miwok_translation, String default_translation, int audioResourceId) {
        this.miwok_translation = miwok_translation;
        this.default_translation = default_translation;
        this.audioResourceId = audioResourceId;
    }

    public Word(String miwok_translation, String default_translation, int mImageResourceId, int audioResourceId){
        this.miwok_translation = miwok_translation;
        this.default_translation = default_translation;
        this.mImageResourceId = mImageResourceId;
        this.audioResourceId = audioResourceId;
    }

    public String getMiwok_translation() {
        return miwok_translation;
    }

    public void setMiwok_translation(String miwok_translation) {
        this.miwok_translation = miwok_translation;
    }

    public String getDefault_translation() {
        return default_translation;
    }

    public void setEng_translation(String default_translation) {
        this.default_translation = default_translation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId() {
        return audioResourceId;
    }
}
