package khangngo.ueh.edu.photofragments;

public class Photo {
    private int id;
    private int category;
    private String srcPhoto;

    public Photo(int id, int category, String srcPhoto) {
        this.id = id;
        this.category = category;
        this.srcPhoto = srcPhoto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getSrcPhoto() {
        return srcPhoto;
    }

    public void setSrcPhoto(String srcPhoto) {
        this.srcPhoto = srcPhoto;
    }
}
