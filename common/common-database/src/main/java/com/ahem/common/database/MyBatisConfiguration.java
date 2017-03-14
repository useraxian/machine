package com.ahem.common.database;

import javax.sql.DataSource;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages={"com.ahem"},annotationClass = Mapper.class)
@AutoConfigureAfter(DruidDsConfiguration.class)
public class MyBatisConfiguration {
	private Logger logger = LoggerFactory.getLogger(MyBatisConfiguration.class);

	/**
	 * 根据数据源创建SqlSessionFactory
	 */
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource ds) throws Exception {
		logger.debug("正在配置SqlSessionFactory...");
		SqlSessionFactoryBean fb = new SqlSessionFactoryBean();
		fb.setDataSource(ds);// 指定数据源(这个必须有，否则报错)

		// // 下边两句仅仅用于*.xml文件，如果整个持久层操作不需要使用到xml文件的话（只用注解就可以搞定），则不加
		// fb.setTypeAliasesPackage(env.getProperty("mybatis.typeAliasesPackage"));//
		// 指定基包
		// fb.setMapperLocations(new
		// PathMatchingResourcePatternResolver().getResources(env.getProperty(
		// "mybatis.mapperLocations")));// 指定xml文件位置
		SqlSessionFactory sqlSessionFactory = fb.getObject();
		logger.debug("完成SqlSessionFactory配置...");
		return sqlSessionFactory;
	}

}
