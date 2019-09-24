package cn.zhengsigen.java.test;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
	
	void addUser(User user);
	User login(@Param("name")String name,@Param("passwd")String passwd);
	void addMoney(@Param("money")String money,@Param("id")int id);
	void takeMoney(@Param("money")String money,@Param("id")int id,@Param("passwd")String passwd);
	
	void turnMoney(@Param("money")String money,@Param("id")int id);
	void turnReception(@Param("money")String money,@Param("bank_card")String bank_card,@Param("name")String name);
}
