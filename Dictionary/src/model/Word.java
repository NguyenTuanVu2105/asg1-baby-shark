package model;

public class Word{
    private String target;
    private String detail;

    public Word(String target, String detail) {
        this.target = target;
        this.detail = detail;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
