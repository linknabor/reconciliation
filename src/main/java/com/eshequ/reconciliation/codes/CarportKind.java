package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class CarportKind extends CodesItem {                                      
	private CarportKind(String code){super(CodesItem.carportKind,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.carportKind,code);                         
	}                                                                                   
	public static String getValue(CarportKind code){	                                
		return CodesItem.getValue(CodesItem.carportKind,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.carportKind);                           
	}                                                                                   
	public static final CarportKind getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.carportKind);                         
		return map==null?null:(CarportKind)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.carportKind);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new CarportKind(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.carportKind, map);                                
		mapCodeObject.put(CodesItem.carportKind, map2);		                              
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




	public static final CarportKind ChanQuanCheWei                          		= getObject("01");
	public static final CarportKind GongGongCheWei                          		= getObject("02");
}

