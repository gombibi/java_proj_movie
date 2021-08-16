package movie.admin.account.source;

import java.util.ArrayList;

import com.fasterxml.jackson.core.type.TypeReference;

import movie.admin.account.data.AdminAccount;
import movie.utils.IOUtils;

public class AdminAccountDataSource {
	private static final String FILE_NAME = "admin_account_list.txt";
	
	public boolean addAdminAccount(String id, String pw) {
		ArrayList<AdminAccount> list = getDbList();
		for (AdminAccount adminAccount : list) {
			if(adminAccount.getId().equals(id)) {
				return false;
			}
		}
		
		AdminAccount account = new AdminAccount(id, pw);
		list.add(account);
		IOUtils.fileWriter(list, FILE_NAME);
		return true;
	}
		
	public boolean login(String id, String pw) {
		ArrayList<AdminAccount> list = getDbList();
		for (AdminAccount adminAccount : list) {
			if(adminAccount.getId().equals(id) && adminAccount.getPw().equals(pw)) {
				return true;
			}
		}
		return false;
	}
	
	private ArrayList<AdminAccount> getDbList() {
		ArrayList<AdminAccount> list = IOUtils.fileReader(new TypeReference<ArrayList<AdminAccount>>() {}, FILE_NAME);
		if(list == null) {
			list = new ArrayList<AdminAccount>();
		}
		return list;
	}
}
