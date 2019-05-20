package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class TempDataSource extends CodesItem {                                      
	private TempDataSource(String code){super(CodesItem.tempDataSource,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.tempDataSource,code);                         
	}                                                                                   
	public static String getValue(TempDataSource code){	                                
		return CodesItem.getValue(CodesItem.tempDataSource,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.tempDataSource);                           
	}                                                                                   
	public static final TempDataSource getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.tempDataSource);                         
		return map==null?null:(TempDataSource)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.tempDataSource);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new TempDataSource(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.tempDataSource, map);                                
		mapCodeObject.put(CodesItem.tempDataSource, map2);		                              
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




	public static final TempDataSource RenGongLuRu                             		= getObject("00");
	public static final TempDataSource CheZhaShiBie                            		= getObject("01");
}

