package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class FeeReduceType extends CodesItem {                                      
	private FeeReduceType(String code){super(CodesItem.feeReduceType,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.feeReduceType,code);                         
	}                                                                                   
	public static String getValue(FeeReduceType code){	                                
		return CodesItem.getValue(CodesItem.feeReduceType,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.feeReduceType);                           
	}                                                                                   
	public static final FeeReduceType getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.feeReduceType);                         
		return map==null?null:(FeeReduceType)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.feeReduceType);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new FeeReduceType(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.feeReduceType, map);                                
		mapCodeObject.put(CodesItem.feeReduceType, map2);		                              
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




	public static final FeeReduceType GongSiTePi                              		= getObject("01");
	public static final FeeReduceType YouHuiHuoDong                           		= getObject("02");
}

