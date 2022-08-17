package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "journal_entry")
public class JournalEntry {
	
	@Id
	@GeneratedValue
	@Column
	private long id;
	
	@Column
	private String title;
	
	@Column(columnDefinition = "MEDIUMTEXT")
	private String content;
	
	@Column(name="dateCreated")
	private Date date;
	
	@Column(name="softDelete", columnDefinition = "BOOL")
	private boolean delete;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public boolean getDelete() {
		return delete;
	}
	public void setDelete(boolean delete) {
		this.delete = delete;
	}
	
	
}
