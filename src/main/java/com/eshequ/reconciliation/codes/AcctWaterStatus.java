package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class AcctWaterStatus extends CodesItem {                                      
	private AcctWaterStatus(String code){super(CodesItem.acctWaterStatus,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.acctWaterStatus,code);                         
	}                                                                                   
	public static String getValue(AcctWaterStatus code){	                                
		return CodesItem.getValue(CodesItem.acctWaterStatus,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.acctWaterStatus);                           
	}                                                                                   
	public static final AcctWaterStatus getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.acctWaterStatus);                         
		return map==null?null:(AcctWaterStatus)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.acctWaterStatus);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new AcctWaterStatus(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.acctWaterStatus, map);                                
		mapCodeObject.put(CodesItem.acctWaterStatus, map2);		                              
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




	public static final AcctWaterStatus WeiQingSuan                             		= getObject("01");
	public static final AcctWaterStatus YiQingSuan                              		= getObject("02");
}

