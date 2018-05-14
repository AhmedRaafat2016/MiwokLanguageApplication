package com.example.ahmad.miwoklanguageapplication;

/**
 * Created by ahmad on 2018/05/12.
 */

public class Word {
    private String mDefaultTranslation ;
    private String mMiwokTranslation ;
    private int mImageResorceID=No_Image_Provided ;
    private static final int No_Image_Provided=-1;
    public Word (String defaultTranslation,String miwokTranslation,int imageResourceID){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResorceID=imageResourceID;
    }
    public Word (String defaultTranslation,String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public int getmImageResorceID() {
        return mImageResorceID;
    }
    public boolean hasImage(){
        return mImageResorceID!=No_Image_Provided;
    }
    }
