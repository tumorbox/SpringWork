package firstexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//hr������ job���̺��� �����ϴ� DAOŬ����

@Repository("jobdao")
public class JobDAO {
	@Autowired
	JdbcTemplate myTemplate;
	
	//job ���̺��� ���ڵ� ������ �����ϴ� �޼ҵ�
	public int count() {
		return myTemplate.queryForObject("select count(*)from jobs",Integer.class);
	}
}
