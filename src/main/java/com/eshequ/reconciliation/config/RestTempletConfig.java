package com.eshequ.reconciliation.config;

import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * 底层实现用了httpclient
 * @author david
 *
 */
@Configuration
public class RestTempletConfig {
	
	@Value("${http.connectTimeout:10000}")
	private int connectTimeout;
	
	@Value("${http.connectionRequestTimeout:10000}")
	private int connectionRequestTimeout;
	
	@Value("${http.readTimeout:10000}")
	private int readTimeout;
	
	/**
	 *不推荐直接使用RestTemplate
	 * 注意！！同时并发100个请求，会有请求失败的情况，因为HttpComponentsClientHttpRequestFactory是基于单个httpclient实例的，上限也就是100个线程。
	 * 大并发请直接用httpUtil或者直接用feign
	 * @param factory
	 * @return
	 */
	@Bean("restTemplate")
    public RestTemplate restTemplate(@Qualifier("httpRequestFactory") HttpComponentsClientHttpRequestFactory factory){
	
		return new RestTemplate(factory);
    }
	
	@Bean("httpRequestFactory")
	public HttpComponentsClientHttpRequestFactory httpRequestFactory(@Qualifier("defaultHttpClientBuilder")HttpClientBuilder httpClientBuilder) {

		HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(httpClientBuilder.build());// httpClient连接配置
		clientHttpRequestFactory.setBufferRequestBody(false);
		clientHttpRequestFactory.setConnectTimeout(connectTimeout);
		clientHttpRequestFactory.setConnectionRequestTimeout(connectionRequestTimeout);
		clientHttpRequestFactory.setReadTimeout(readTimeout);
		return clientHttpRequestFactory;
	}

}
