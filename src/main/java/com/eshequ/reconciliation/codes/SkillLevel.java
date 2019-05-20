package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class SkillLevel extends CodesItem {                                      
	private SkillLevel(String code){super(CodesItem.skillLevel,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.skillLevel,code);                         
	}                                                                                   
	public static String getValue(SkillLevel code){	                                
		return CodesItem.getValue(CodesItem.skillLevel,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.skillLevel);                           
	}                                                                                   
	public static final SkillLevel getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.skillLevel);                         
		return map==null?null:(SkillLevel)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.skillLevel);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new SkillLevel(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.skillLevel, map);                                
		mapCodeObject.put(CodesItem.skillLevel, map2);		                              
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




	public static final SkillLevel ChuJi                                   		= getObject("01");
	public static final SkillLevel JingJiShi                               		= getObject("02");
	public static final SkillLevel KuaiJiShi                               		= getObject("03");
	public static final SkillLevel ZhuLiGongChengShi                       		= getObject("04");
	public static final SkillLevel GongChengShi                            		= getObject("05");
	public static final SkillLevel GaoJiGongChengShi                       		= getObject("06");
	public static final SkillLevel JiaoShouJiGaoGong                       		= getObject("07");
	public static final SkillLevel QiTa                                    		= getObject("99");
}

