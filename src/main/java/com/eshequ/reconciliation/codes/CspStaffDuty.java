package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class CspStaffDuty extends CodesItem {                                      
	private CspStaffDuty(String code){super(CodesItem.cspStaffDuty,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.cspStaffDuty,code);                         
	}                                                                                   
	public static String getValue(CspStaffDuty code){	                                
		return CodesItem.getValue(CodesItem.cspStaffDuty,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.cspStaffDuty);                           
	}                                                                                   
	public static final CspStaffDuty getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.cspStaffDuty);                         
		return map==null?null:(CspStaffDuty)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.cspStaffDuty);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new CspStaffDuty(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.cspStaffDuty, map);                                
		mapCodeObject.put(CodesItem.cspStaffDuty, map2);		                              
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




	public static final CspStaffDuty FaRenDaiBiao                            		= getObject("01");
	public static final CspStaffDuty QiYeFuZeRen                             		= getObject("02");
	public static final CspStaffDuty JingLi                                  		= getObject("03");
	public static final CspStaffDuty ZuZhang                                 		= getObject("04");
	public static final CspStaffDuty GongZuoRenYuan                          		= getObject("05");
	public static final CspStaffDuty QiTa                                    		= getObject("99");
}

