package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class ProStrucType extends CodesItem {                                      
	private ProStrucType(String code){super(CodesItem.proStrucType,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.proStrucType,code);                         
	}                                                                                   
	public static String getValue(ProStrucType code){	                                
		return CodesItem.getValue(CodesItem.proStrucType,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.proStrucType);                           
	}                                                                                   
	public static final ProStrucType getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.proStrucType);                         
		return map==null?null:(ProStrucType)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.proStrucType);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new ProStrucType(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.proStrucType, map);                                
		mapCodeObject.put(CodesItem.proStrucType, map2);		                              
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




	public static final ProStrucType ZhuanHun                                		= getObject("01");
	public static final ProStrucType ZhuanMu                                 		= getObject("02");
	public static final ProStrucType GangHunKuangJia                         		= getObject("03");
	public static final ProStrucType GangHunJianLiQiang                      		= getObject("04");
	public static final ProStrucType GangJieGou                              		= getObject("05");
	public static final ProStrucType QiTa                                    		= getObject("99");
}

