package entity;

public class Movie {
    private String day;
    private String id;
    private String  title;
    private int view;

    public Movie(String day, String id, String title, int view) {
        this.day = day;
        this.id = id;
        this.title = title;
        this.view = view;
    }

    public Movie(String day, String id, String title, String view) {
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }
}
