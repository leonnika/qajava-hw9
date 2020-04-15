package ru.netology.domain.attachment;

public class BackgroundInfo {
    private int id;
    private String type;
    private int angle;
    private String color;
    private int width;
    private int height;
    private Size[] image;
    private PointInfo[] point;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Size[] getImage() {
        return image;
    }

    public void setImage(Size[] image) {
        this.image = image;
    }

    public PointInfo[] getPoint() {
        return point;
    }

    public void setPoint(PointInfo[] point) {
        this.point = point;
    }
}
