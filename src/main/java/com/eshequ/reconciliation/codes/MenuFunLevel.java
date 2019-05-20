package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class MenuFunLevel extends CodesItem {                                      
	private MenuFunLevel(String code){super(CodesItem.menuFunLevel,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.menuFunLevel,code);                         
	}                                                                                   
	public static String getValue(MenuFunLevel code){	                                
		return CodesItem.getValue(CodesItem.menuFunLevel,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.menuFunLevel);                           
	}                                                                                   
	public static final MenuFunLevel getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.menuFunLevel);                         
		return map==null?null:(MenuFunLevel)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.menuFunLevel);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new MenuFunLevel(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.menuFunLevel, map);                                
		mapCodeObject.put(CodesItem.menuFunLevel, map2);		                              
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




	public static final MenuFunLevel YiJiCaiDan                              		= getObject("0");
	public static final MenuFunLevel ErJiCaiDan                              		= getObject("1");
	public static final MenuFunLevel SanJiCaiDan                             		= getObject("2");
	public static final MenuFunLevel JuTiJiaoYi                              		= getObject("3");
}

