package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class CutStatus extends CodesItem {                                      
	private CutStatus(String code){super(CodesItem.cutStatus,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.cutStatus,code);                         
	}                                                                                   
	public static String getValue(CutStatus code){	                                
		return CodesItem.getValue(CodesItem.cutStatus,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.cutStatus);                           
	}                                                                                   
	public static final CutStatus getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.cutStatus);                         
		return map==null?null:(CutStatus)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.cutStatus);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new CutStatus(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.cutStatus, map);                                
		mapCodeObject.put(CodesItem.cutStatus, map2);		                              
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




	public static final CutStatus WeiFenTan                               		= getObject("0");
	public static final CutStatus YiFenTan                                		= getObject("1");
}

