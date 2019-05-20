package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class CutMethod extends CodesItem {                                      
	private CutMethod(String code){super(CodesItem.cutMethod,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.cutMethod,code);                         
	}                                                                                   
	public static String getValue(CutMethod code){	                                
		return CodesItem.getValue(CodesItem.cutMethod,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.cutMethod);                           
	}                                                                                   
	public static final CutMethod getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.cutMethod);                         
		return map==null?null:(CutMethod)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.cutMethod);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new CutMethod(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.cutMethod, map);                                
		mapCodeObject.put(CodesItem.cutMethod, map2);		                              
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




	public static final CutMethod AnMianJi                                		= getObject("01");
	public static final CutMethod AnShiYongLiang                          		= getObject("02");
	public static final CutMethod AnHu                                    		= getObject("03");
}

