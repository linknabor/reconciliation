package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class HocStaff extends CodesItem {                                      
	private HocStaff(String code){super(CodesItem.hocStaff,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.hocStaff,code);                         
	}                                                                                   
	public static String getValue(HocStaff code){	                                
		return CodesItem.getValue(CodesItem.hocStaff,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.hocStaff);                           
	}                                                                                   
	public static final HocStaff getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.hocStaff);                         
		return map==null?null:(HocStaff)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.hocStaff);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new HocStaff(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.hocStaff, map);                                
		mapCodeObject.put(CodesItem.hocStaff, map2);		                              
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




	public static final HocStaff ZhuRen                                  		= getObject("01");
	public static final HocStaff FuZhuRen                                		= getObject("02");
	public static final HocStaff QiTa                                    		= getObject("99");
}

