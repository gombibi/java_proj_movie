package movie.admin.account.source;

import movie.utils.StringUtils;

public class Session {

	private static Session instance = null;
	
	private Session() {	}
	
	public static Session getInstance() {
		if(instance == null) {
			instance = new Session();
		}
		
		return instance;
	}
	
	private String id;
	private String pw;
	
	public void login(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public boolean isLogined() {
		return !StringUtils.isNullOrEmpty(id) && !StringUtils.isNullOrEmpty(pw);
	}
	
	public void logout() {
		id = null;
		pw = null;
	}
}
