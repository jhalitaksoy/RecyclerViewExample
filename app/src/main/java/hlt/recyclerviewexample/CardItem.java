package hlt.recyclerviewexample;

import android.graphics.Bitmap;

public class CardItem {
    public String cardTitle, subTitle, cardText;
    public int imageID;

    public CardItem(String cardTitle, String subTitle, String cardText, int imageID) {
        this.cardTitle = cardTitle;
        this.subTitle = subTitle;
        this.cardText = cardText;
        this.imageID = imageID;
    }

    public String getCardTitle() {
        return cardTitle;
    }

    public void setCardTitle(String cardTitle) {
        this.cardTitle = cardTitle;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getCardText() {
        return cardText;
    }

    public void setCardText(String cardText) {
        this.cardText = cardText;
    }
}
