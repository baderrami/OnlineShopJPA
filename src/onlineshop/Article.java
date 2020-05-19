package onlineshop;

import javax.persistence.*;

@Entity
public class Article {
@Id
@GeneratedValue(strategy = GenerationType.TABLE)
@Basic(optional=false)
private int article_id;


@Basic(optional=false)
private String article;
@Basic(optional=false)
private double price;
@Basic(optional=true)
private char currency;
@Basic(optional=false)
private boolean deleted;

public int getArticle_id() {
	return article_id;
}
public void setArticle_id(int article_id) {
	this.article_id = article_id;
}
public String getArticle() {
	return article;
}
public void setArticle(String article) {
	this.article = article;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public char getCurrency() {
	return currency;
}
public void setCurrency(char currency) {
	this.currency = currency;
}
public boolean isDeleted() {
	return deleted;
}
public void setDeleted(boolean deleted) {
	this.deleted = deleted;
}


}
