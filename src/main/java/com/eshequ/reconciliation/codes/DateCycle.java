package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class DateCycle extends CodesItem {                                      
	private DateCycle(String code){super(CodesItem.dateCycle,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.dateCycle,code);                         
	}                                                                                   
	public static String getValue(DateCycle code){	                                
		return CodesItem.getValue(CodesItem.dateCycle,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.dateCycle);                           
	}                                                                                   
	public static final DateCycle getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.dateCycle);                         
		return map==null?null:(DateCycle)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.dateCycle);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new DateCycle(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.dateCycle, map);                                
		mapCodeObject.put(CodesItem.dateCycle, map2);		                              
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




	public static final DateCycle Yue                                     		= getObject("01");
	public static final DateCycle JiDu                                    		= getObject("02");
	public static final DateCycle BanNian                                 		= getObject("03");
	public static final DateCycle Nian                                    		= getObject("04");
}

