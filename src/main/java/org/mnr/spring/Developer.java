package org.mnr.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Developer {
	
	private int id;
	private String name;
//	@Autowired
	/*
	 *This annotation means, there should be a bean with id as language in the config file
	 *It it's not available then, container throws exception
	 *This can be avoided by using anothe following annotation 
	 */
	@Autowired(required=false)
	private Language language;
	
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Developer [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", language=");
		builder.append(language);
		builder.append("]");
		return builder.toString();
	}
	
	

}
