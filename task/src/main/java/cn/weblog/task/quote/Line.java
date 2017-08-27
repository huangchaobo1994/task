package cn.weblog.task.quote;

public class Line {

    private String text;

    private String img;


    public Line(String text, String img) {
        this.text = text;
        this.img = img;
    }

    public Line(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
