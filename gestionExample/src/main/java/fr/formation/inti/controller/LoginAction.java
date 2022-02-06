package fr.formation.inti.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import fr.formation.inti.entity.User;
import fr.formation.inti.service.IUserService;
import fr.formation.inti.service.UserService;



public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 634090280210382892L;

	private String login;
	private String password;

	private IUserService service;

	public LoginAction() {
		service = new UserService();
	}

	@Override
	public String execute() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		User user = service.findByLoginAndPassword(login, password);

		if (user != null) {
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(300); // 30 secondes avant déconnexion auto
			session.setAttribute("user", user);
			return "success";
		} else {
			addActionError(getText("error.login"));
		}
		return "error";
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
