package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class FacilityStatus extends CodesItem {                                      
	private FacilityStatus(String code){super(CodesItem.facilityStatus,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.facilityStatus,code);                         
	}                                                                                   
	public static String getValue(FacilityStatus code){	                                
		return CodesItem.getValue(CodesItem.facilityStatus,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.facilityStatus);                           
	}                                                                                   
	public static final FacilityStatus getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.facilityStatus);                         
		return map==null?null:(FacilityStatus)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.facilityStatus);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new FacilityStatus(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.facilityStatus, map);                                
		mapCodeObject.put(CodesItem.facilityStatus, map2);		                              
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




	public static final FacilityStatus ZhengChang                              		= getObject("01");
	public static final FacilityStatus XiaoXiu                                 		= getObject("02");
	public static final FacilityStatus BaoFei                                  		= getObject("03");
}

