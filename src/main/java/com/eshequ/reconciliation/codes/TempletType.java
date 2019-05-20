package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class TempletType extends CodesItem {                                      
	private TempletType(String code){super(CodesItem.templetType,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.templetType,code);                         
	}                                                                                   
	public static String getValue(TempletType code){	                                
		return CodesItem.getValue(CodesItem.templetType,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.templetType);                           
	}                                                                                   
	public static final TempletType getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.templetType);                         
		return map==null?null:(TempletType)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.templetType);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new TempletType(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.templetType, map);                                
		mapCodeObject.put(CodesItem.templetType, map2);		                              
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




	public static final TempletType YeWuCanShu                              		= getObject("01");
	public static final TempletType JueSeCaiDan                             		= getObject("02");
	public static final TempletType ShouFeiBiaoZhun                         		= getObject("03");
}

