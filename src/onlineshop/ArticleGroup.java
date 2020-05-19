package onlineshop;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ArticleGroup {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Basic(optional=false)
	private int articleGroup_id; 
	
	@Basic(optional=false)
	private String articleGroup; 
	
	@Basic(optional=false)
	private boolean deleted;

	public int getArticleGroup_id() {
		return articleGroup_id;
	}

	public void setArticleGroup_id(int articleGroup_id) {
		this.articleGroup_id = articleGroup_id;
	}

	public String getArticleGroup() {
		return articleGroup;
	}

	public void setArticleGroup(String articleGroup) {
		this.articleGroup = articleGroup;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}


}
