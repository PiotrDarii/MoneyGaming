package utils;

import pages.LoginPage;

public class PageManager{

    private LoginPage loginPage;


    public LoginPage getLoginPage(){
        if(loginPage==null){
            return loginPage=new LoginPage();
        }else {
            return loginPage;
        }
    }


}
