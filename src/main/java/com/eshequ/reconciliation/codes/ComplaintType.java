package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class ComplaintType extends CodesItem {                                      
	private ComplaintType(String code){super(CodesItem.complaintType,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.complaintType,code);                         
	}                                                                                   
	public static String getValue(ComplaintType code){	                                
		return CodesItem.getValue(CodesItem.complaintType,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.complaintType);                           
	}                                                                                   
	public static final ComplaintType getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.complaintType);                         
		return map==null?null:(ComplaintType)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.complaintType);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new ComplaintType(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.complaintType, map);                                
		mapCodeObject.put(CodesItem.complaintType, map2);		                              
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




	public static final ComplaintType BaoAn                                   		= getObject("01");
	public static final ComplaintType BaoJie                                  		= getObject("02");
	public static final ComplaintType BaoLu                                   		= getObject("03");
	public static final ComplaintType BaoYang                                 		= getObject("04");
	public static final ComplaintType WeiXiu                                  		= getObject("05");
	public static final ComplaintType QiTa                                    		= getObject("99");
}

