package movie.main;

import java.io.Serializable;
import java.util.ArrayList;

public class StudentEntity implements Serializable {

	ArrayList<Student> list = new ArrayList<>();
	int count = 0;

	public StudentEntity() {
		
	}
	
	public StudentEntity(ArrayList<Student> list, int count) {
		super();
		this.list = list;
		this.count = count;
	}

	public ArrayList<Student> getList() {
		return list;
	}

	public void setList(ArrayList<Student> list) {
		this.list = list;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	
	
	
}
