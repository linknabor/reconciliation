package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class StmtFlowStatus extends CodesItem {                                      
	private StmtFlowStatus(String code){super(CodesItem.stmtFlowStatus,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.stmtFlowStatus,code);                         
	}                                                                                   
	public static String getValue(StmtFlowStatus code){	                                
		return CodesItem.getValue(CodesItem.stmtFlowStatus,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.stmtFlowStatus);                           
	}                                                                                   
	public static final StmtFlowStatus getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.stmtFlowStatus);                         
		return map==null?null:(StmtFlowStatus)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.stmtFlowStatus);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new StmtFlowStatus(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.stmtFlowStatus, map);                                
		mapCodeObject.put(CodesItem.stmtFlowStatus, map2);		                              
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




	public static final StmtFlowStatus QiYong                                  		= getObject("0");
	public static final StmtFlowStatus ShuJuHeDui                              		= getObject("1");
	public static final StmtFlowStatus PdfHeDui                                		= getObject("2");
	public static final StmtFlowStatus TiShu                                   		= getObject("3");
	public static final StmtFlowStatus ChuCiTouDi                              		= getObject("4");
}

