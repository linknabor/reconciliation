package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class MeterType extends CodesItem {                                      
	private MeterType(String code){super(CodesItem.meterType,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.meterType,code);                         
	}                                                                                   
	public static String getValue(MeterType code){	                                
		return CodesItem.getValue(CodesItem.meterType,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.meterType);                           
	}                                                                                   
	public static final MeterType getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.meterType);                         
		return map==null?null:(MeterType)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.meterType);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new MeterType(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.meterType, map);                                
		mapCodeObject.put(CodesItem.meterType, map2);		                              
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




	public static final MeterType ZongBiao                                		= getObject("01");
	public static final MeterType FenBiao                                 		= getObject("02");
}

