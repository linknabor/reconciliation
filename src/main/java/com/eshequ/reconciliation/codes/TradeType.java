package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class TradeType extends CodesItem {                                      
	private TradeType(String code){super(CodesItem.tradeType,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.tradeType,code);                         
	}                                                                                   
	public static String getValue(TradeType code){	                                
		return CodesItem.getValue(CodesItem.tradeType,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.tradeType);                           
	}                                                                                   
	public static final TradeType getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.tradeType);                         
		return map==null?null:(TradeType)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.tradeType);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new TradeType(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.tradeType, map);                                
		mapCodeObject.put(CodesItem.tradeType, map2);		                              
	}                                                                                   
/////////////////////////////////////////////////////////////////////////////////		
	public int hashCode(){return super.hashCode();}
	public boolean equals(Object obj)
	{
		if( obj instanceof CodesItem)
			return (this == obj);
		else
			return super.equals(obj);
	}
/////////////////////////////////////////////////////////////////////////////////    




	public static final TradeType RuKu                                    		= getObject("01");
	public static final TradeType ChuKu                                   		= getObject("02");
}

