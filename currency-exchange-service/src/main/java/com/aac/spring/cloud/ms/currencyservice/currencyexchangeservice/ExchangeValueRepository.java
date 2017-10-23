/**
 * 
 */
package com.aac.spring.cloud.ms.currencyservice.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Amol.Chandurkar
 *
 */
public interface ExchangeValueRepository 
	extends JpaRepository<ExchangeValue, Long>{
	
	ExchangeValue findByFromAndTo(String from, String to);

}
