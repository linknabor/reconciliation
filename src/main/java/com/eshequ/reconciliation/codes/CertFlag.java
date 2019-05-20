package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class CertFlag extends CodesItem {                                      
	private CertFlag(String code){super(CodesItem.certFlag,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.certFlag,code);                         
	}                                                                                   
	public static String getValue(CertFlag code){	                                
		return CodesItem.getValue(CodesItem.certFlag,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.certFlag);                           
	}                                                                                   
	public static final CertFlag getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.certFlag);                         
		return map==null?null:(CertFlag)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.certFlag);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new CertFlag(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.certFlag, map);                                
		mapCodeObject.put(CodesItem.certFlag, map2);		                              
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




	public static final CertFlag WeiBanZheng                             		= getObject("0");
	public static final CertFlag YiBanZheng                              		= getObject("1");
	public static final CertFlag BuXiang                                 		= getObject("2");
}

