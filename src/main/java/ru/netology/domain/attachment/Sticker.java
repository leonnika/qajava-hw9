package ru.netology.domain.attachment;

public class Sticker {
    private int productId;
    private int stickerId;
    private ImageInfo[] image;
    private ImageInfo[] imageWithBackground;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getStickerId() {
        return stickerId;
    }

    public void setStickerId(int stickerId) {
        this.stickerId = stickerId;
    }

    public ImageInfo[] getImage() {
        return image;
    }

    public void setImage(ImageInfo[] image) {
        this.image = image;
    }

    public ImageInfo[] getImageWithBackground() {
        return imageWithBackground;
    }

    public void setImageWithBackground(ImageInfo[] imageWithBackground) {
        this.imageWithBackground = imageWithBackground;
    }
}
