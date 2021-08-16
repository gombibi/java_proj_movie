package movie.admin.manage.source;

import java.util.ArrayList;

import com.fasterxml.jackson.core.type.TypeReference;

import movie.admin.account.data.AdminAccount;
import movie.utils.IOUtils;

public class AdminManageDataSource {
	private static final String FILE_NAME = "admin_account_list.txt";

	public boolean removeAdminAccount(String id) {
		boolean result = false;
		ArrayList<AdminAccount> list = getDbList();
		for (AdminAccount adminAccount : list) {
			if(adminAccount.getId().equals(id)) {
				list.remove(adminAccount);
				IOUtils.fileWriter(list, FILE_NAME);
				result = true;
				break;
			}
		}
		return result;
	}
	
	private ArrayList<AdminAccount> getDbList() {
		ArrayList<AdminAccount> list = IOUtils.fileReader(new TypeReference<ArrayList<AdminAccount>>() {}, FILE_NAME);
		if(list == null) {
			list = new ArrayList<AdminAccount>();
		}
		return list;
	}
}
