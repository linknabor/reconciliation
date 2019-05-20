package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class RepairStatus extends CodesItem {                                      
	private RepairStatus(String code){super(CodesItem.repairStatus,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.repairStatus,code);                         
	}                                                                                   
	public static String getValue(RepairStatus code){	                                
		return CodesItem.getValue(CodesItem.repairStatus,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.repairStatus);                           
	}                                                                                   
	public static final RepairStatus getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.repairStatus);                         
		return map==null?null:(RepairStatus)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.repairStatus);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new RepairStatus(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.repairStatus, map);                                
		mapCodeObject.put(CodesItem.repairStatus, map2);		                              
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




	public static final RepairStatus DaiShouLi                               		= getObject("1");
	public static final RepairStatus YiPaiGong                               		= getObject("2");
	public static final RepairStatus YiWangGong                              		= getObject("3");
	public static final RepairStatus DuiZhangWanCheng                        		= getObject("4");
	public static final RepairStatus BuYuShouLu                              		= getObject("9");
}

