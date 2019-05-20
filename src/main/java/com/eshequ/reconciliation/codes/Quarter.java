package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class Quarter extends CodesItem {                                      
	private Quarter(String code){super(CodesItem.quarter,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.quarter,code);                         
	}                                                                                   
	public static String getValue(Quarter code){	                                
		return CodesItem.getValue(CodesItem.quarter,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.quarter);                           
	}                                                                                   
	public static final Quarter getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.quarter);                         
		return map==null?null:(Quarter)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.quarter);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new Quarter(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.quarter, map);                                
		mapCodeObject.put(CodesItem.quarter, map2);		                              
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




	public static final Quarter YiJiDu                                  		= getObject("1");
	public static final Quarter ErJiDu                                  		= getObject("2");
	public static final Quarter SanJiDu                                 		= getObject("3");
	public static final Quarter SiJiDu                                  		= getObject("4");
}

