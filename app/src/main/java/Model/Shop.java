package Model;

/**
 * Created by Billy on 10/4/2017.
 */

public class Shop {
    String name,title,date,sale,like,comment,rate;
    public Shop(String name, String title, String date, String sale, String like, String comment, String rate) {
        this.name = name;
        this.title = title;
        this.date = date;
        this.sale = sale;
        this.like = like;
        this.comment = comment;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSale() {
        return sale;
    }

    public void setSale(String sale) {
        this.sale = sale;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}
