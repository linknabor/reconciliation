package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class ObjectType extends CodesItem {                                      
	private ObjectType(String code){super(CodesItem.objectType,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.objectType,code);                         
	}                                                                                   
	public static String getValue(ObjectType code){	                                
		return CodesItem.getValue(CodesItem.objectType,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.objectType);                           
	}                                                                                   
	public static final ObjectType getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.objectType);                         
		return map==null?null:(ObjectType)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.objectType);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new ObjectType(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.objectType, map);                                
		mapCodeObject.put(CodesItem.objectType, map2);		                              
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




	public static final ObjectType XiaoQu                                  		= getObject("01");
	public static final ObjectType LouYu                                   		= getObject("02");
	public static final ObjectType MenPai                                  		= getObject("03");
	public static final ObjectType WuYeDanYuan                             		= getObject("04");
	public static final ObjectType KeHu                                    		= getObject("05");
	public static final ObjectType CheLiang                                		= getObject("06");
}

