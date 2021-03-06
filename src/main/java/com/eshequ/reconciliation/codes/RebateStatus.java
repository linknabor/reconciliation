package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class RebateStatus extends CodesItem {                                      
	private RebateStatus(String code){super(CodesItem.rebateStatus,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.rebateStatus,code);                         
	}                                                                                   
	public static String getValue(RebateStatus code){	                                
		return CodesItem.getValue(CodesItem.rebateStatus,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.rebateStatus);                           
	}                                                                                   
	public static final RebateStatus getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.rebateStatus);                         
		return map==null?null:(RebateStatus)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.rebateStatus);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new RebateStatus(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.rebateStatus, map);                                
		mapCodeObject.put(CodesItem.rebateStatus, map2);		                              
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




	public static final RebateStatus WeiFanDian                              		= getObject("0");
	public static final RebateStatus YiFanDian                               		= getObject("1");
}

