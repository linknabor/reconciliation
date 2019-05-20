package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class ServePriceUnit extends CodesItem {                                      
	private ServePriceUnit(String code){super(CodesItem.servePriceUnit,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.servePriceUnit,code);                         
	}                                                                                   
	public static String getValue(ServePriceUnit code){	                                
		return CodesItem.getValue(CodesItem.servePriceUnit,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.servePriceUnit);                           
	}                                                                                   
	public static final ServePriceUnit getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.servePriceUnit);                         
		return map==null?null:(ServePriceUnit)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.servePriceUnit);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new ServePriceUnit(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.servePriceUnit, map);                                
		mapCodeObject.put(CodesItem.servePriceUnit, map2);		                              
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




	public static final ServePriceUnit YuanMeiCi                               		= getObject("00");
	public static final ServePriceUnit YuanMeiTIan                             		= getObject("01");
	public static final ServePriceUnit YuanMeiYue                              		= getObject("02");
}

