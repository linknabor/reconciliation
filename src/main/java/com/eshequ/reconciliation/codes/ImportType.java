package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class ImportType extends CodesItem {                                      
	private ImportType(String code){super(CodesItem.importType,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.importType,code);                         
	}                                                                                   
	public static String getValue(ImportType code){	                                
		return CodesItem.getValue(CodesItem.importType,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.importType);                           
	}                                                                                   
	public static final ImportType getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.importType);                         
		return map==null?null:(ImportType)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.importType);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new ImportType(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.importType, map);                                
		mapCodeObject.put(CodesItem.importType, map2);		                              
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




	public static final ImportType FangJian                                		= getObject("01");
	public static final ImportType ShangPu                                 		= getObject("02");
	public static final ImportType CheWei                                  		= getObject("03");
	public static final ImportType GuangGaoWei                             		= getObject("04");
	public static final ImportType CheLiang                                		= getObject("05");
	public static final ImportType DiXIaShi                                		= getObject("06");
}

