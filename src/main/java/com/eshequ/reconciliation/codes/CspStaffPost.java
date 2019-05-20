package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class CspStaffPost extends CodesItem {                                      
	private CspStaffPost(String code){super(CodesItem.cspStaffPost,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.cspStaffPost,code);                         
	}                                                                                   
	public static String getValue(CspStaffPost code){	                                
		return CodesItem.getValue(CodesItem.cspStaffPost,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.cspStaffPost);                           
	}                                                                                   
	public static final CspStaffPost getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.cspStaffPost);                         
		return map==null?null:(CspStaffPost)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.cspStaffPost);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new CspStaffPost(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.cspStaffPost, map);                                
		mapCodeObject.put(CodesItem.cspStaffPost, map2);		                              
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




	public static final CspStaffPost GongSiGuanLi                            		= getObject("00");
	public static final CspStaffPost XiaoQuGuanLi                            		= getObject("01");
	public static final CspStaffPost BaoAn                                   		= getObject("02");
	public static final CspStaffPost BaoJie                                  		= getObject("03");
	public static final CspStaffPost BaoLv                                   		= getObject("04");
	public static final CspStaffPost BaoYang                                 		= getObject("05");
	public static final CspStaffPost BaoXiu                                  		= getObject("06");
	public static final CspStaffPost ZhongXinGuanLi                          		= getObject("07");
	public static final CspStaffPost QiTa                                    		= getObject("99");
}

