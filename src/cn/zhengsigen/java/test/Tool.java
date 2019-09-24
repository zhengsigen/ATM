package cn.zhengsigen.java.test;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Tool {

	public static SqlSession getMapper() {
		
		SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();

		InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("mybatis-config.xml");
		// 根据环境配置初始化数据库连接
		SqlSessionFactory sqlSessionFactory = factoryBuilder.build(is);
		// 接口绑定
		return sqlSessionFactory.openSession(true);
	}
	
}
