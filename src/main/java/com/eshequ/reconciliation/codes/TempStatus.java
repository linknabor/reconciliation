package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class TempStatus extends CodesItem {                                      
	private TempStatus(String code){super(CodesItem.tempStatus,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.tempStatus,code);                         
	}                                                                                   
	public static String getValue(TempStatus code){	                                
		return CodesItem.getValue(CodesItem.tempStatus,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.tempStatus);                           
	}                                                                                   
	public static final TempStatus getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.tempStatus);                         
		return map==null?null:(TempStatus)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.tempStatus);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new TempStatus(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.tempStatus, map);                                
		mapCodeObject.put(CodesItem.tempStatus, map2);		                              
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




	public static final TempStatus WeiJiFei                                		= getObject("0");
	public static final TempStatus YiJiFei                                 		= getObject("1");
	public static final TempStatus WuXuJiiFei                              		= getObject("2");
}

