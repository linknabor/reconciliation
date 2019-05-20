package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class MeterFeeType extends CodesItem {                                      
	private MeterFeeType(String code){super(CodesItem.meterFeeType,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.meterFeeType,code);                         
	}                                                                                   
	public static String getValue(MeterFeeType code){	                                
		return CodesItem.getValue(CodesItem.meterFeeType,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.meterFeeType);                           
	}                                                                                   
	public static final MeterFeeType getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.meterFeeType);                         
		return map==null?null:(MeterFeeType)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.meterFeeType);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new MeterFeeType(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.meterFeeType, map);                                
		mapCodeObject.put(CodesItem.meterFeeType, map2);		                              
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




	public static final MeterFeeType DianFei                                 		= getObject("01");
	public static final MeterFeeType ShuiFei                                 		= getObject("02");
	public static final MeterFeeType RanQiFei                                		= getObject("03");
}

