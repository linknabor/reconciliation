package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class ExtractMethod extends CodesItem {                                      
	private ExtractMethod(String code){super(CodesItem.extractMethod,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.extractMethod,code);                         
	}                                                                                   
	public static String getValue(ExtractMethod code){	                                
		return CodesItem.getValue(CodesItem.extractMethod,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.extractMethod);                           
	}                                                                                   
	public static final ExtractMethod getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.extractMethod);                         
		return map==null?null:(ExtractMethod)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.extractMethod);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new ExtractMethod(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.extractMethod, map);                                
		mapCodeObject.put(CodesItem.extractMethod, map2);		                              
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




	public static final ExtractMethod BiLi                                    		= getObject("01");
	public static final ExtractMethod DingE                                   		= getObject("02");
}

