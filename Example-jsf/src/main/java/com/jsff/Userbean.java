/**
 * 
 */
/**
 * @author eng shery
 *
 */
package com.jsff;

import java.io.Serializable;
import java.net.SocketOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

@ManagedBean(name="user")
//@RequestScoped when user does request when click button and end when response
@RequestScoped
//@ViewScoped same of request but it ends when move to another page
@ViewScoped
//@SessionScoped be in all session user data ends when user close the application
@SessionScoped
//@ApplicationScoped be in all application application data it ends when application deployment
@ApplicationScoped


public class Userbean implements Serializable{
	//field which inserted in xhtml
	private String name;
	private String password;
	private String message;
	private boolean rememberme;
	private String[] programinglanguages;
	private String gender;
	private String country;
	private String[] language;
	private String specialization;
	private int age;
	private double avg;
	private Date date;
	private List<Student> stu =new ArrayList(Arrays.asList(new Student(1,"shereen"),new Student(2,"mohamed"),new Student(3,"wafek")));
	private static Map<String,Object> countries=new HashMap();
	private String locale;
	
	
	
	public Userbean() {
	}
	
	
	static{
		//for language
		countries.put("arabic",new Locale("ar"));
		countries.put("English",Locale.ENGLISH);
	}

	public void localchanged(ValueChangeEvent e){
		//to change language
		String newValue=e.getNewValue().toString();
		//it compare countries which user select to countries which exist
		for(Map.Entry<String, Object> entry:countries.entrySet()){
			if(entry.getValue().toString().equals(newValue)){
				FacesContext.getCurrentInstance().getViewRoot().setLocale((Locale)entry.getValue());
			}
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
	
	}

	
	
	
	public void insert(){}
	public void event(){
		System.out.println("mouse moved");
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public boolean isRememberme() {
		return rememberme;
	}



	public void setRememberme(boolean rememberme) {
		this.rememberme = rememberme;
	}



	public String[] getPrograminglanguages() {
		return programinglanguages;
	}



	public void setPrograminglanguages(String[] programinglanguages) {
		this.programinglanguages = programinglanguages;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public String[] getLanguage() {
		return language;
	}



	public void setLanguage(String[] language) {
		this.language = language;
	}



	public String getSpecialization() {
		return specialization;
	}



	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Student> getStu() {
		return stu;
	}

	public void setStu(List<Student> stu) {
		this.stu = stu;
	}
	public Map<String, Object> getCountries() {
		return countries;
	}
	public void setCountries(Map<String, Object> countries) {
		this.countries = countries;
	}




	public String getLocale() {
		return locale;
	}




	public void setLocale(String locale) {
		this.locale = locale;
	}
	
	
	
	
	
	
	
	
	
	
}