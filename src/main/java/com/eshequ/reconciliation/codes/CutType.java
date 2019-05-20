package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class CutType extends CodesItem {                                      
	private CutType(String code){super(CodesItem.cutType,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.cutType,code);                         
	}                                                                                   
	public static String getValue(CutType code){	                                
		return CodesItem.getValue(CodesItem.cutType,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.cutType);                           
	}                                                                                   
	public static final CutType getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.cutType);                         
		return map==null?null:(CutType)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.cutType);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new CutType(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.cutType, map);                                
		mapCodeObject.put(CodesItem.cutType, map2);		                              
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




	public static final CutType QuanEFenTan                             		= getObject("01");
	public static final CutType ChaEFenTan                              		= getObject("02");
}

