package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class ErrorType extends CodesItem {                                      
	private ErrorType(String code){super(CodesItem.errorType,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.errorType,code);                         
	}                                                                                   
	public static String getValue(ErrorType code){	                                
		return CodesItem.getValue(CodesItem.errorType,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.errorType);                           
	}                                                                                   
	public static final ErrorType getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.errorType);                         
		return map==null?null:(ErrorType)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.errorType);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new ErrorType(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.errorType, map);                                
		mapCodeObject.put(CodesItem.errorType, map2);		                              
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




	public static final ErrorType ShiBai                                  		= getObject("1");
	public static final ErrorType TiaoGuo                                 		= getObject("2");
}

