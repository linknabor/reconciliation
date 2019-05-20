package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class SubjectType extends CodesItem {                                      
	private SubjectType(String code){super(CodesItem.subjectType,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.subjectType,code);                         
	}                                                                                   
	public static String getValue(SubjectType code){	                                
		return CodesItem.getValue(CodesItem.subjectType,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.subjectType);                           
	}                                                                                   
	public static final SubjectType getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.subjectType);                         
		return map==null?null:(SubjectType)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.subjectType);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new SubjectType(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.subjectType, map);                                
		mapCodeObject.put(CodesItem.subjectType, map2);		                              
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




	public static final SubjectType ZiChan                                  		= getObject("01");
	public static final SubjectType FuZai                                   		= getObject("02");
	public static final SubjectType SuoYouZheQuanYi                         		= getObject("03");
	public static final SubjectType SunYi                                   		= getObject("04");
	public static final SubjectType ChengBen                                		= getObject("05");
	public static final SubjectType QiTa                                    		= getObject("99");
}

