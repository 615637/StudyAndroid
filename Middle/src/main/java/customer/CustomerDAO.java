package customer;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAO {
	@Autowired @Qualifier("hanul") SqlSession sql;
	
	public List<CustomerVO> getList(){
		List<CustomerVO>  list = sql.selectList("cu.selectList");
		return list;
	}
	
	public void delete(int id) {
		sql.delete("cu.delete", id);
	}
	
	public void insert(CustomerVO vo) {
		sql.insert("cu.insert", vo);
	}
	
	public void update(CustomerVO vo) {
		sql.update("cu.update", vo);
	}
}
