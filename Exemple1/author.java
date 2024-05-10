package Exemple1;

public class author {
    private String authorName;
    private day birthDay;

    // constructor
    public author(String authorName, day birthDay) {
        this.authorName = authorName;
        this.birthDay = birthDay;

    }

    public String getAuthorName() {
        return authorName;
    }

    public day getBirthDay() {
        return birthDay;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setBirthDay(day birthDay) {
        this.birthDay = birthDay;
    }
}
