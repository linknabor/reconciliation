package com.eshequ.reconciliation.codes;																														
/**Auto Created by VBScript Do not modify!*/												 
import java.util.HashMap;                                                                  
import java.util.List;                                                       
import java.util.Map;                                                           
import com.eshequ.reconciliation.model.CodeInfo;                     
/** Auto generated */												 
public class BillFeeType extends CodesItem {                                      
	private BillFeeType(String code){super(CodesItem.billFeeType,code);}	        
	public static String getValue(String code){                                         
		return CodesItem.getValue(CodesItem.billFeeType,code);                         
	}                                                                                   
	public static String getValue(BillFeeType code){	                                
		return CodesItem.getValue(CodesItem.billFeeType,code.toString());              
	}                                                                                   
	public static List<CodeInfo> getCodeList(){	                                                
		return CodesItem.getCodeList(CodesItem.billFeeType);                           
	}                                                                                   
	public static final BillFeeType getObject(String code){                          
		Map map=(Map)mapCodeObject.get(CodesItem.billFeeType);                         
		return map==null?null:(BillFeeType)map.get(code);                                             
	}                                                                                   
	static {		fillObjectToMap();	}                                                   
	private static final void fillObjectToMap(){                                        
		List<CodeInfo> listCode = getCodeFromDB(CodesItem.billFeeType);                                                                 
		Map map = new HashMap(listCode.size());        
		String temp = null;	                          
		Map map2 = new HashMap(listCode.size());                           
		for (int i=0; i<listCode.size();i++){                                            
			CodeInfo codeInfo = listCode.get(i);                                              
			temp = codeInfo.getCiSpCode();                                              
			map.put(temp, codeInfo.getCiSpName());                                     
			map2.put(temp, new BillFeeType(temp));                                        
		}                                                                                 
		mapCategoryCode.put(CodesItem.billFeeType, map);                                
		mapCodeObject.put(CodesItem.billFeeType, map2);		                              
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




	public static final BillFeeType WuYeGuanLiFei                           		= getObject("0101");
	public static final BillFeeType DianTiShuiBengYunXingFei                		= getObject("0102");
	public static final BillFeeType BaoJieFuWuFei                           		= getObject("0103");
	public static final BillFeeType BaoAnFuWuFei                            		= getObject("0104");
	public static final BillFeeType BuChaFei                                		= getObject("0105");
	public static final BillFeeType ZuJinFei                                		= getObject("0106");
	public static final BillFeeType GongGongFuWuFei                         		= getObject("0107");
	public static final BillFeeType SheShiSheBeiYunXingFei                  		= getObject("0108");
	public static final BillFeeType BaoAnBaoJieFei                          		= getObject("0109");
	public static final BillFeeType LvHuaFei                                		= getObject("0110");
	public static final BillFeeType DaiShouZhuZhaiZuJin                     		= getObject("0201");
	public static final BillFeeType DaiShouShangPuZuJin                     		= getObject("0202");
	public static final BillFeeType DaiShouCheWeiZuJin                      		= getObject("0203");
	public static final BillFeeType DaiShouDiXiaShiZuJin                    		= getObject("0204");
	public static final BillFeeType DaiShouGuangGaoWeiZuJin                 		= getObject("0205");
	public static final BillFeeType DianFei                                 		= getObject("0301");
	public static final BillFeeType ShuiFei                                 		= getObject("0302");
	public static final BillFeeType RanQiFei                                		= getObject("0303");
	public static final BillFeeType GuDingCheWeiTinCheFei                   		= getObject("0401");
	public static final BillFeeType GongGongCheWeiTinCheFei                 		= getObject("0402");
}

