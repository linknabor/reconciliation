package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class ServeBookStatus extends CodesItem {                                      
	private ServeBookStatus(String code){super(CodesItem.serveBookStatus,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.serveBookStatus,code);                         
	}                                                                                   
	public static String getValue(ServeBookStatus code){	                                
		return CodesItem.getValue(CodesItem.serveBookStatus,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.serveBookStatus);                           
	}                                                                                   
	public static final ServeBookStatus getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.serveBookStatus);                         
		return map==null?null:(ServeBookStatus)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.serveBookStatus);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new ServeBookStatus(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.serveBookStatus, map);                                
		mapCodeObject.put(CodesItem.serveBookStatus, map2);		                              
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




	public static final ServeBookStatus DaiShouLi                               		= getObject("01");
	public static final ServeBookStatus YiShouLi                                		= getObject("02");
	public static final ServeBookStatus JuJueShouLi                             		= getObject("99");
	public static final ServeBookStatus ShanChu                                 		= getObject("00");
}

