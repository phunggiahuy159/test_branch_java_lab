public class DigitalVideoDisc{
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public float getCost() {
        return cost;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    
    
    public DigitalVideoDisc(String title) {
        this.title = title;
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
    public boolean equals(DigitalVideoDisc otherDisc) {
        // in this code, for example the director, if 1 is null and 1 is not null it will return false 
        boolean titleEquals = (this.title != null) ? this.title.equals(otherDisc.getTitle()) : otherDisc.getTitle() == null;
        boolean categoryEquals = (this.category != null) ? this.category.equals(otherDisc.getCategory()) : otherDisc.getCategory() == null;
        boolean directorEquals = (this.director != null) ? this.director.equals(otherDisc.getDirector()) : otherDisc.getDirector() == null;
        boolean lengthEquals = this.length == otherDisc.getLength();
        boolean costEquals = this.cost == otherDisc.getCost();
        return titleEquals && categoryEquals && directorEquals && lengthEquals && costEquals;
    }
    
}