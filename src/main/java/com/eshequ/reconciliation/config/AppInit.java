package com.eshequ.reconciliation.config;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import com.eshequ.reconciliation.codes.PlatChannel;
import com.eshequ.reconciliation.mapper.SpServeBillPayTradeMapper;
import com.eshequ.reconciliation.model.SpServeBillPayTrade;
import com.fasterxml.jackson.databind.ObjectMapper;

//多数据源需要exclude后面那2个类，不然spring会自动配置一个数据源
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class})	
@ComponentScan("com.eshequ.reconciliation")
public class AppInit implements CommandLineRunner {

	public static void main(String[] args) {
		
		SpringApplication app = new SpringApplication(AppInit.class);
//	    app.setBannerMode(Mode.OFF);
	    app.run(args);
		
	}
	
	@Autowired
	private SpServeBillPayTradeMapper spServeBillPayTradeMapper;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("hello world");
		Long trade_water_id = 190307210720913163l;
		SpServeBillPayTrade trade = new SpServeBillPayTrade();
		trade = spServeBillPayTradeMapper.selectByPrimaryKey(trade_water_id);
		System.out.println(trade.toString());
		
		System.out.println(objectMapper.writeValueAsString(PlatChannel.getCodeList()));
//		http://localhost:8080/shanghai/servplat/login.do?device_id=N7NL00373531&password=1bbd886460827015e5d605ed44252251
		
		String resp = restTemplate.getForObject("http://localhost:8080/shanghai/servplat/login.do?device_id=N7NL00373531&password=1bbd886460827015e5d605ed44252251", String.class, new HashMap<>());
		System.out.println(resp);
		
		List<?> list = spServeBillPayTradeMapper.selectBillTradeWater("190312172715963689");
		System.out.println(objectMapper.writeValueAsString(list));
	}
	
}
