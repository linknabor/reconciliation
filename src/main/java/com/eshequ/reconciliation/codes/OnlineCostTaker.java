package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class OnlineCostTaker extends CodesItem {                                      
	private OnlineCostTaker(String code){super(CodesItem.onlineCostTaker,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.onlineCostTaker,code);                         
	}                                                                                   
	public static String getValue(OnlineCostTaker code){	                                
		return CodesItem.getValue(CodesItem.onlineCostTaker,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.onlineCostTaker);                           
	}                                                                                   
	public static final OnlineCostTaker getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.onlineCostTaker);                         
		return map==null?null:(OnlineCostTaker)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.onlineCostTaker);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new OnlineCostTaker(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.onlineCostTaker, map);                                
		mapCodeObject.put(CodesItem.onlineCostTaker, map2);		                              
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




	public static final OnlineCostTaker GongSi                                  		= getObject("0");
	public static final OnlineCostTaker YeZhu                                   		= getObject("1");
}

