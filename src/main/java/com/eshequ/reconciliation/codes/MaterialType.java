package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class MaterialType extends CodesItem {                                      
	private MaterialType(String code){super(CodesItem.materialType,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.materialType,code);                         
	}                                                                                   
	public static String getValue(MaterialType code){	                                
		return CodesItem.getValue(CodesItem.materialType,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.materialType);                           
	}                                                                                   
	public static final MaterialType getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.materialType);                         
		return map==null?null:(MaterialType)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.materialType);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new MaterialType(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.materialType, map);                                
		mapCodeObject.put(CodesItem.materialType, map2);		                              
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




	public static final MaterialType ZZJGDM                                  		= getObject("01");
	public static final MaterialType QYZC                                    		= getObject("02");
	public static final MaterialType YYFJ                                    		= getObject("03");
	public static final MaterialType YZSJBG                                  		= getObject("04");
	public static final MaterialType ZZZS                                    		= getObject("05");
	public static final MaterialType WYFWHT                                  		= getObject("06");
	public static final MaterialType YJZMCL                                  		= getObject("07");
	public static final MaterialType SBZM                                    		= getObject("08");
	public static final MaterialType WWGZM                                   		= getObject("09");
	public static final MaterialType WYXMHFLYZM                              		= getObject("10");
	public static final MaterialType GLZDHBZCL                               		= getObject("11");
}

