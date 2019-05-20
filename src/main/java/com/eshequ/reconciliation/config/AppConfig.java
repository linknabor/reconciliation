package com.eshequ.reconciliation.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.eshequ.reconciliation.codes.PlatChannel;
import com.eshequ.reconciliation.mapper.SpServeBillPayTradeMapper;
import com.eshequ.reconciliation.model.SpServeBillPayTrade;

//多数据源需要exclude后面那2个类，不然spring会自动配置一个数据源
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class})	
@ComponentScan("com.eshequ.reconciliation")
public class AppConfig implements CommandLineRunner {

	public static void main(String[] args) {
		
		SpringApplication app = new SpringApplication(AppConfig.class);
//	    app.setBannerMode(Mode.OFF);
	    app.run(args);
		
	}
	
	@Autowired
	private SpServeBillPayTradeMapper spServeBillPayTradeMapper;

	@Override
	public void run(String... args) throws Exception {

		System.out.println(2<<8);
		System.out.println("hello world");
		Long trade_water_id = 190307210720913163l;
		SpServeBillPayTrade trade = new SpServeBillPayTrade();
		trade = spServeBillPayTradeMapper.selectByPrimaryKey(trade_water_id);
		System.out.println(trade.toString());
		
		System.out.println(PlatChannel.Weixin.toString());
	}
	
}
