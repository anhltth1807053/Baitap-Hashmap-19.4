package collatian;

public class MovieStatic {
    private String id;
    private String title;
    private  int view;

    public MovieStatic(String id, String title, int view) {
        this.id = id;
        this.title = title;
        this.view = view;
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