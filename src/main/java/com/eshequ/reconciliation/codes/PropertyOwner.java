package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class PropertyOwner extends CodesItem {                                      
	private PropertyOwner(String code){super(CodesItem.propertyOwner,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.propertyOwner,code);                         
	}                                                                                   
	public static String getValue(PropertyOwner code){	                                
		return CodesItem.getValue(CodesItem.propertyOwner,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.propertyOwner);                           
	}                                                                                   
	public static final PropertyOwner getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.propertyOwner);                         
		return map==null?null:(PropertyOwner)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.propertyOwner);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new PropertyOwner(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.propertyOwner, map);                                
		mapCodeObject.put(CodesItem.propertyOwner, map2);		                              
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




	public static final PropertyOwner GeRen                                   		= getObject("01");
	public static final PropertyOwner GongSi                                  		= getObject("02");
	public static final PropertyOwner QiTa                                    		= getObject("99");
}

