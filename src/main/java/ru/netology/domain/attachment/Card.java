package ru.netology.domain.attachment;

public class Card {
    private String cardId;
    private String linkUrl;
    private String title;
    private ImageInfo[] image;
    private ButtonInfo[] button;
    private String price;
    private String priceOld;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ImageInfo[] getImage() {
        return image;
    }

    public void setImage(ImageInfo[] image) {
        this.image = image;
    }

    public ButtonInfo[] getButton() {
        return button;
    }

    public void setButton(ButtonInfo[] button) {
        this.button = button;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPriceOld() {
        return priceOld;
    }

    public void setPriceOld(String priceOld) {
        this.priceOld = priceOld;
    }
}
