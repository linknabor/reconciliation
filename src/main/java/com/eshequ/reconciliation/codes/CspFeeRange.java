package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class CspFeeRange extends CodesItem {                                      
	private CspFeeRange(String code){super(CodesItem.cspFeeRange,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.cspFeeRange,code);                         
	}                                                                                   
	public static String getValue(CspFeeRange code){	                                
		return CodesItem.getValue(CodesItem.cspFeeRange,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.cspFeeRange);                           
	}                                                                                   
	public static final CspFeeRange getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.cspFeeRange);                         
		return map==null?null:(CspFeeRange)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.cspFeeRange);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new CspFeeRange(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.cspFeeRange, map);                                
		mapCodeObject.put(CodesItem.cspFeeRange, map2);		                              
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




	public static final CspFeeRange AnGongSo                                		= getObject("01");
	public static final CspFeeRange AnXiangMu                               		= getObject("02");
	public static final CspFeeRange AnYongHu                                		= getObject("03");
}

