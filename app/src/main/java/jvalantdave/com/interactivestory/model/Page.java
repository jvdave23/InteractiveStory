package jvalantdave.com.interactivestory.model;

/**
 * Created by JvalantDave on 2015-12-01.
 */
public class Page {
    private int mImageID;
    private String mText;
    private Choice mChoice1;
    private Choice mChoice2;

    public int getImageID() {
        return mImageID;
    }

    public void setImageId(int imageID) {
        mImageID = imageID;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }
}
