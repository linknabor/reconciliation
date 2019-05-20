package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class SexFlag extends CodesItem {                                      
	private SexFlag(String code){super(CodesItem.sexFlag,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.sexFlag,code);                         
	}                                                                                   
	public static String getValue(SexFlag code){	                                
		return CodesItem.getValue(CodesItem.sexFlag,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.sexFlag);                           
	}                                                                                   
	public static final SexFlag getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.sexFlag);                         
		return map==null?null:(SexFlag)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.sexFlag);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new SexFlag(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.sexFlag, map);                                
		mapCodeObject.put(CodesItem.sexFlag, map2);		                              
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




	public static final SexFlag Nan                                     		= getObject("m");
	public static final SexFlag Nv                                      		= getObject("f");
}

