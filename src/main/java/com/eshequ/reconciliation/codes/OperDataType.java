package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class OperDataType extends CodesItem {                                      
	private OperDataType(String code){super(CodesItem.operDataType,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.operDataType,code);                         
	}                                                                                   
	public static String getValue(OperDataType code){	                                
		return CodesItem.getValue(CodesItem.operDataType,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.operDataType);                           
	}                                                                                   
	public static final OperDataType getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.operDataType);                         
		return map==null?null:(OperDataType)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.operDataType);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new OperDataType(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.operDataType, map);                                
		mapCodeObject.put(CodesItem.operDataType, map2);		                              
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




	public static final OperDataType ZhuCeShuJu                              		= getObject("0");
	public static final OperDataType GengGaiQianShuJu                        		= getObject("1");
	public static final OperDataType GengGaiHouShuJu                         		= getObject("2");
	public static final OperDataType ZhuXiaoShuJu                            		= getObject("3");
}

