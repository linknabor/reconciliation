package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class CheckOperType extends CodesItem {                                      
	private CheckOperType(String code){super(CodesItem.checkOperType,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.checkOperType,code);                         
	}                                                                                   
	public static String getValue(CheckOperType code){	                                
		return CodesItem.getValue(CodesItem.checkOperType,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.checkOperType);                           
	}                                                                                   
	public static final CheckOperType getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.checkOperType);                         
		return map==null?null:(CheckOperType)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.checkOperType);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new CheckOperType(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.checkOperType, map);                                
		mapCodeObject.put(CodesItem.checkOperType, map2);		                              
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




	public static final CheckOperType CheXiao                                 		= getObject("0");
	public static final CheckOperType TongGuo                                 		= getObject("1");
}

