package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class QualificationLevel extends CodesItem {                                      
	private QualificationLevel(String code){super(CodesItem.qualificationLevel,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.qualificationLevel,code);                         
	}                                                                                   
	public static String getValue(QualificationLevel code){	                                
		return CodesItem.getValue(CodesItem.qualificationLevel,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.qualificationLevel);                           
	}                                                                                   
	public static final QualificationLevel getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.qualificationLevel);                         
		return map==null?null:(QualificationLevel)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.qualificationLevel);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new QualificationLevel(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.qualificationLevel, map);                                
		mapCodeObject.put(CodesItem.qualificationLevel, map2);		                              
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




	public static final QualificationLevel YiJi                                    		= getObject("1");
	public static final QualificationLevel ErJi                                    		= getObject("2");
	public static final QualificationLevel SanJi                                   		= getObject("3");
	public static final QualificationLevel SiJi                                    		= getObject("4");
}

