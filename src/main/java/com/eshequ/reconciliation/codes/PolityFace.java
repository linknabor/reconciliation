package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class PolityFace extends CodesItem {                                      
	private PolityFace(String code){super(CodesItem.polityFace,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.polityFace,code);                         
	}                                                                                   
	public static String getValue(PolityFace code){	                                
		return CodesItem.getValue(CodesItem.polityFace,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.polityFace);                           
	}                                                                                   
	public static final PolityFace getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.polityFace);                         
		return map==null?null:(PolityFace)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.polityFace);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new PolityFace(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.polityFace, map);                                
		mapCodeObject.put(CodesItem.polityFace, map2);		                              
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




	public static final PolityFace DangYuan                                		= getObject("1");
	public static final PolityFace QunZhong                                		= getObject("2");
	public static final PolityFace QiTa                                    		= getObject("3");
}

