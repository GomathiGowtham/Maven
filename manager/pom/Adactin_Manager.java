package com.manager.pom;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.Adactin_Login;
import com.adactin.pom.Search_Hotel;
import com.adactin.pom.Select_Hotel;

public class Adactin_Manager {
	public  WebDriver driver;
	private Adactin_Login login;
	private Search_Hotel search;
	private Select_Hotel selectHotel;
	
	
	public Adactin_Manager(WebDriver driver2) {
        this.driver = driver2;
	}
    public Adactin_Login getInstanceLogin() {
		if(login == null) {
			login = new Adactin_Login(driver);
		}
		return login;
	}
    public Search_Hotel getInstanceSearch() {
    	if(search == null ) {
    		search = new Search_Hotel(driver);
    	}
		return search;
    }
    public Select_Hotel getInstanceSelectHotel() {
    	if(selectHotel == null) {
    		selectHotel = new Select_Hotel(driver);    	
    		}
    	return selectHotel;
    }
    
    
    
    
    
    
    
    

}
