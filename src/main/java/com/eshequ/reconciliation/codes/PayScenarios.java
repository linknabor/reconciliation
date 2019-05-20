package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class PayScenarios extends CodesItem {                                      
	private PayScenarios(String code){super(CodesItem.payScenarios,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.payScenarios,code);                         
	}                                                                                   
	public static String getValue(PayScenarios code){	                                
		return CodesItem.getValue(CodesItem.payScenarios,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.payScenarios);                           
	}                                                                                   
	public static final PayScenarios getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.payScenarios);                         
		return map==null?null:(PayScenarios)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.payScenarios);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new PayScenarios(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.payScenarios, map);                                
		mapCodeObject.put(CodesItem.payScenarios, map2);		                              
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




	public static final PayScenarios All                                     		= getObject("00");
	public static final PayScenarios WechatPay                               		= getObject("01");
	public static final PayScenarios OfficePay                               		= getObject("02");
	public static final PayScenarios ParkPay                                 		= getObject("03");
	public static final PayScenarios AppPay                                  		= getObject("04");
}

