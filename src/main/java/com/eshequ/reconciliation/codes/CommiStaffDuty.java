package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class CommiStaffDuty extends CodesItem {                                      
	private CommiStaffDuty(String code){super(CodesItem.commiStaffDuty,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.commiStaffDuty,code);                         
	}                                                                                   
	public static String getValue(CommiStaffDuty code){	                                
		return CodesItem.getValue(CodesItem.commiStaffDuty,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.commiStaffDuty);                           
	}                                                                                   
	public static final CommiStaffDuty getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.commiStaffDuty);                         
		return map==null?null:(CommiStaffDuty)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.commiStaffDuty);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new CommiStaffDuty(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.commiStaffDuty, map);                                
		mapCodeObject.put(CodesItem.commiStaffDuty, map2);		                              
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




	public static final CommiStaffDuty ZhuRen                                  		= getObject("01");
	public static final CommiStaffDuty FuZhuRen                                		= getObject("02");
	public static final CommiStaffDuty QiTa                                    		= getObject("99");
}

