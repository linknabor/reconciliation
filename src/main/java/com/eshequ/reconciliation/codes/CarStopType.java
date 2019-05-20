package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class CarStopType extends CodesItem {                                      
	private CarStopType(String code){super(CodesItem.carStopType,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.carStopType,code);                         
	}                                                                                   
	public static String getValue(CarStopType code){	                                
		return CodesItem.getValue(CodesItem.carStopType,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.carStopType);                           
	}                                                                                   
	public static final CarStopType getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.carStopType);                         
		return map==null?null:(CarStopType)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.carStopType);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new CarStopType(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.carStopType, map);                                
		mapCodeObject.put(CodesItem.carStopType, map2);		                              
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




	public static final CarStopType GuDingTingChe                           		= getObject("0");
	public static final CarStopType LinShiTingChe                           		= getObject("1");
}

