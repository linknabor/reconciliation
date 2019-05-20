package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class ComplaintStatus extends CodesItem {                                      
	private ComplaintStatus(String code){super(CodesItem.complaintStatus,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.complaintStatus,code);                         
	}                                                                                   
	public static String getValue(ComplaintStatus code){	                                
		return CodesItem.getValue(CodesItem.complaintStatus,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.complaintStatus);                           
	}                                                                                   
	public static final ComplaintStatus getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.complaintStatus);                         
		return map==null?null:(ComplaintStatus)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.complaintStatus);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new ComplaintStatus(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.complaintStatus, map);                                
		mapCodeObject.put(CodesItem.complaintStatus, map2);		                              
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




	public static final ComplaintStatus DaiShouLi                               		= getObject("1");
	public static final ComplaintStatus YiShouLi                                		= getObject("2");
	public static final ComplaintStatus YiChuLi                                 		= getObject("3");
	public static final ComplaintStatus BuYuShouLi                              		= getObject("9");
}

