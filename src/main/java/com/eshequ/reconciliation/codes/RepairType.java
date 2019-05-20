package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class RepairType extends CodesItem {                                      
	private RepairType(String code){super(CodesItem.repairType,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.repairType,code);                         
	}                                                                                   
	public static String getValue(RepairType code){	                                
		return CodesItem.getValue(CodesItem.repairType,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.repairType);                           
	}                                                                                   
	public static final RepairType getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.repairType);                         
		return map==null?null:(RepairType)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.repairType);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new RepairType(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.repairType, map);                                
		mapCodeObject.put(CodesItem.repairType, map2);		                              
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




	public static final RepairType DianGong                                		= getObject("01");
	public static final RepairType GuangDao                                		= getObject("02");
	public static final RepairType MenSuo                                  		= getObject("03");
	public static final RepairType QiTa                                    		= getObject("99");
}

