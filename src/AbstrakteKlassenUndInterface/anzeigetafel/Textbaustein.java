package AbstrakteKlassenUndInterface.anzeigetafel;

import drawtext.DrawInfo;

import java.awt.*;

public class Textbaustein implements DrawInfo {

    private Color mColor;
    private String mText;
    private int mSize;

    public Textbaustein(Color aColor, String aText, int aSize){
        this.mColor = aColor;
        this.mText = aText;
        this.mSize = aSize;
    }

    @Override
    public Color getColor() {
        return mColor;
    }

    @Override
    public String getText() {
        return mText;
    }

    @Override
    public int getTextSize() {
        return mSize;
    }
}
