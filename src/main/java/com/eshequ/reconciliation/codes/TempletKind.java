package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class TempletKind extends CodesItem {                                      
	private TempletKind(String code){super(CodesItem.templetKind,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.templetKind,code);                         
	}                                                                                   
	public static String getValue(TempletKind code){	                                
		return CodesItem.getValue(CodesItem.templetKind,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.templetKind);                           
	}                                                                                   
	public static final TempletKind getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.templetKind);                         
		return map==null?null:(TempletKind)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.templetKind);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new TempletKind(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.templetKind, map);                                
		mapCodeObject.put(CodesItem.templetKind, map2);		                              
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




	public static final TempletKind XiTongMoBan                             		= getObject("1");
	public static final TempletKind YongHuMoBan                             		= getObject("2");
}

