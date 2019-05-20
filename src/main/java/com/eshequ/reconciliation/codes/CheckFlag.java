package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class CheckFlag extends CodesItem {                                      
	private CheckFlag(String code){super(CodesItem.checkFlag,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.checkFlag,code);                         
	}                                                                                   
	public static String getValue(CheckFlag code){	                                
		return CodesItem.getValue(CodesItem.checkFlag,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.checkFlag);                           
	}                                                                                   
	public static final CheckFlag getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.checkFlag);                         
		return map==null?null:(CheckFlag)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.checkFlag);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new CheckFlag(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.checkFlag, map);                                
		mapCodeObject.put(CodesItem.checkFlag, map2);		                              
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




	public static final CheckFlag WeiTongGuo                              		= getObject("0");
	public static final CheckFlag YiTongGuo                               		= getObject("1");
}

