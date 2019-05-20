package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class DifferenceStatus extends CodesItem {                                      
	private DifferenceStatus(String code){super(CodesItem.differenceStatus,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.differenceStatus,code);                         
	}                                                                                   
	public static String getValue(DifferenceStatus code){	                                
		return CodesItem.getValue(CodesItem.differenceStatus,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.differenceStatus);                           
	}                                                                                   
	public static final DifferenceStatus getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.differenceStatus);                         
		return map==null?null:(DifferenceStatus)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.differenceStatus);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new DifferenceStatus(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.differenceStatus, map);                                
		mapCodeObject.put(CodesItem.differenceStatus, map2);		                              
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




	public static final DifferenceStatus BianJi                                  		= getObject("01");
	public static final DifferenceStatus YiJiZhang                               		= getObject("02");
}

