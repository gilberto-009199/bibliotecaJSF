package br.com.conam.biblioteca.ui;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import br.com.conam.biblioteca.business.services.LoginService;
import br.com.conam.biblioteca.domain.entities.UserEntity;
import br.com.conam.biblioteca.util.SessionUtils;

@ManagedBean
@SessionScoped
@Named
public class LoginUI implements Serializable {

	@Inject
    public LoginService loginService;
	
	private String pwd;
	private String pwdRepet;
	private String msg;
	private String user;
	@Transactional
	public void create() {
    	if( pwd.equals(pwdRepet) ) {
    		
    		UserEntity entity = loginService.create(user, pwd);
    		
    		
    		
    	}else FacesContext.getCurrentInstance().addMessage(
				null,
				new FacesMessage(FacesMessage.SEVERITY_WARN,
						"Password not Equals",
						"Please enter correct username and Password"));
    }
	//validate login
	public String validateUsernamePassword() {
		UserEntity userEntity = loginService.validate(user, pwd);
		
		if(userEntity != null) {
			HttpSession session = SessionUtils.getSession();
			session.setAttribute("username", user);
			session.setAttribute("userid", userEntity.getId());
			return "logado";
		} else {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_WARN,
							"Incorrect Username and Passowrd",
							"Please enter correct username and Password"));
		}
		return ".";
	}

	//logout event, invalidate session
	public String logout() {
		HttpSession session = SessionUtils.getSession();
		session.invalidate();
		return "login";
	}
	

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPwdRepet() {
		return pwdRepet;
	}

	public void setPwdRepet(String pwdRepet) {
		this.pwdRepet = pwdRepet;
	}
	
}
