package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class SubParaType extends CodesItem {                                      
	private SubParaType(String code){super(CodesItem.subParaType,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.subParaType,code);                         
	}                                                                                   
	public static String getValue(SubParaType code){	                                
		return CodesItem.getValue(CodesItem.subParaType,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.subParaType);                           
	}                                                                                   
	public static final SubParaType getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.subParaType);                         
		return map==null?null:(SubParaType)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.subParaType);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new SubParaType(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.subParaType, map);                                
		mapCodeObject.put(CodesItem.subParaType, map2);		                              
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




	public static final SubParaType WuYeOnline                              		= getObject("00");
	public static final SubParaType ParkOnline                              		= getObject("01");
	public static final SubParaType TempParkOnline                          		= getObject("02");
	public static final SubParaType StmtParam                               		= getObject("03");
}

