package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class MonthDays extends CodesItem {                                      
	private MonthDays(String code){super(CodesItem.monthDays,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.monthDays,code);                         
	}                                                                                   
	public static String getValue(MonthDays code){	                                
		return CodesItem.getValue(CodesItem.monthDays,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.monthDays);                           
	}                                                                                   
	public static final MonthDays getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.monthDays);                         
		return map==null?null:(MonthDays)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.monthDays);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new MonthDays(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.monthDays, map);                                
		mapCodeObject.put(CodesItem.monthDays, map2);		                              
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




	public static final MonthDays AnShiJiTianShu                          		= getObject("0");
	public static final MonthDays An30Tian                                		= getObject("1");
}

