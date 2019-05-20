package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class PosBrand extends CodesItem {                                      
	private PosBrand(String code){super(CodesItem.posBrand,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.posBrand,code);                         
	}                                                                                   
	public static String getValue(PosBrand code){	                                
		return CodesItem.getValue(CodesItem.posBrand,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.posBrand);                           
	}                                                                                   
	public static final PosBrand getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.posBrand);                         
		return map==null?null:(PosBrand)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.posBrand);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new PosBrand(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.posBrand, map);                                
		mapCodeObject.put(CodesItem.posBrand, map2);		                              
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




	public static final PosBrand AiXinNuo                                		= getObject("0");
	public static final PosBrand Lakala                                  		= getObject("1");
	public static final PosBrand ShanDe                                  		= getObject("2");
	public static final PosBrand HuiFu                                   		= getObject("3");
	public static final PosBrand GuiZhou                                 		= getObject("4");
}

