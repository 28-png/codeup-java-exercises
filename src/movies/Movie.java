package movies;

public class Movie {
    MoviesArray list = new MoviesArray();
    private String name;
    private String categories;

    public Movie(String name, String categories) {
        this.name = name;
        this.categories = categories;

    }


    public String getName() {
        return this.name;
    }

    public String getCategories() {
        return this.categories;
    }









}
