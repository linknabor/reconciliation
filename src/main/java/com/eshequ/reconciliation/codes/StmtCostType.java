package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class StmtCostType extends CodesItem {                                      
	private StmtCostType(String code){super(CodesItem.stmtCostType,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.stmtCostType,code);                         
	}                                                                                   
	public static String getValue(StmtCostType code){	                                
		return CodesItem.getValue(CodesItem.stmtCostType,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.stmtCostType);                           
	}                                                                                   
	public static final StmtCostType getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.stmtCostType);                         
		return map==null?null:(StmtCostType)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.stmtCostType);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new StmtCostType(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.stmtCostType, map);                                
		mapCodeObject.put(CodesItem.stmtCostType, map2);		                              
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




	public static final StmtCostType DanMian                                 		= getObject("00");
	public static final StmtCostType ShuangMian                              		= getObject("01");
	public static final StmtCostType XinFeng                                 		= getObject("02");
	public static final StmtCostType YouDi                                   		= getObject("03");
}

