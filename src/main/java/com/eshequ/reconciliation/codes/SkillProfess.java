package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class SkillProfess extends CodesItem {                                      
	private SkillProfess(String code){super(CodesItem.skillProfess,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.skillProfess,code);                         
	}                                                                                   
	public static String getValue(SkillProfess code){	                                
		return CodesItem.getValue(CodesItem.skillProfess,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.skillProfess);                           
	}                                                                                   
	public static final SkillProfess getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.skillProfess);                         
		return map==null?null:(SkillProfess)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.skillProfess);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new SkillProfess(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.skillProfess, map);                                
		mapCodeObject.put(CodesItem.skillProfess, map2);		                              
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




	public static final SkillProfess ChuJi                                   		= getObject("01");
	public static final SkillProfess ZhongJi                                 		= getObject("02");
	public static final SkillProfess GaoJi                                   		= getObject("03");
	public static final SkillProfess ZhuanYe                                 		= getObject("04");
	public static final SkillProfess QiTa                                    		= getObject("99");
}

