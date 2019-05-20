package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class CompanyKind extends CodesItem {                                      
	private CompanyKind(String code){super(CodesItem.companyKind,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.companyKind,code);                         
	}                                                                                   
	public static String getValue(CompanyKind code){	                                
		return CodesItem.getValue(CodesItem.companyKind,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.companyKind);                           
	}                                                                                   
	public static final CompanyKind getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.companyKind);                         
		return map==null?null:(CompanyKind)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.companyKind);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new CompanyKind(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.companyKind, map);                                
		mapCodeObject.put(CodesItem.companyKind, map2);		                              
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




	public static final CompanyKind YouXianZeRenGongSi                      		= getObject("01");
	public static final CompanyKind GuFenYouXianGongSi                      		= getObject("02");
	public static final CompanyKind GuoYouDuZiQiYe                          		= getObject("03");
	public static final CompanyKind GeRenDuZiQiYe                           		= getObject("04");
	public static final CompanyKind HeHuo                                   		= getObject("05");
	public static final CompanyKind GeTiGongShangHu                         		= getObject("06");
	public static final CompanyKind QiTa                                    		= getObject("99");
}

