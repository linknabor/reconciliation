package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class TempMode extends CodesItem {                                      
	private TempMode(String code){super(CodesItem.tempMode,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.tempMode,code);                         
	}                                                                                   
	public static String getValue(TempMode code){	                                
		return CodesItem.getValue(CodesItem.tempMode,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.tempMode);                           
	}                                                                                   
	public static final TempMode getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.tempMode);                         
		return map==null?null:(TempMode)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.tempMode);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new TempMode(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.tempMode, map);                                
		mapCodeObject.put(CodesItem.tempMode, map2);		                              
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




	public static final TempMode ZhengChang                              		= getObject("01");
	public static final TempMode JieDuan                                 		= getObject("02");
}

