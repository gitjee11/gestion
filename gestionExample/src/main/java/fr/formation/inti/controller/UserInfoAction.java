package fr.formation.inti.controller;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Action(value = "userInfo", 
results = { 
		@Result(name = "userInfos", location = "/WEB-INF/pages/userInfos.jsp"), 
})
public class UserInfoAction extends ActionSupport {

    private static final long serialVersionUID = 7299264265184515893L;
    
    
    @Override
    public String execute() {
    
        return "userInfos";
    }

 
}