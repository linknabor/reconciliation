package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class FeeDateType extends CodesItem {                                      
	private FeeDateType(String code){super(CodesItem.feeDateType,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.feeDateType,code);                         
	}                                                                                   
	public static String getValue(FeeDateType code){	                                
		return CodesItem.getValue(CodesItem.feeDateType,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.feeDateType);                           
	}                                                                                   
	public static final FeeDateType getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.feeDateType);                         
		return map==null?null:(FeeDateType)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.feeDateType);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new FeeDateType(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.feeDateType, map);                                
		mapCodeObject.put(CodesItem.feeDateType, map2);		                              
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




	public static final FeeDateType WuYeGuanLiFei                           		= getObject("01");
	public static final FeeDateType TingCheFei                              		= getObject("02");
}

