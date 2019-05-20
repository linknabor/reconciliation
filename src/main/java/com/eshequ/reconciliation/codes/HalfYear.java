package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class HalfYear extends CodesItem {                                      
	private HalfYear(String code){super(CodesItem.halfYear,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.halfYear,code);                         
	}                                                                                   
	public static String getValue(HalfYear code){	                                
		return CodesItem.getValue(CodesItem.halfYear,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.halfYear);                           
	}                                                                                   
	public static final HalfYear getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.halfYear);                         
		return map==null?null:(HalfYear)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.halfYear);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new HalfYear(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.halfYear, map);                                
		mapCodeObject.put(CodesItem.halfYear, map2);		                              
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




	public static final HalfYear ShangBanNian                            		= getObject("1");
	public static final HalfYear XiaBanNian                              		= getObject("2");
}

