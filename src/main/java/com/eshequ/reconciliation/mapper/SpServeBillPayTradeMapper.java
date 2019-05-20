package com.eshequ.reconciliation.mapper;

import java.util.List;
import java.util.Map;

import com.eshequ.reconciliation.common.CommonMapper;
import com.eshequ.reconciliation.model.SpServeBillPayTrade;

public interface SpServeBillPayTradeMapper extends CommonMapper<SpServeBillPayTrade> {

	public List<Map<String, String>> selectBillTradeWater(String trade_water_id);
	
}
