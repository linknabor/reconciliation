package com.eshequ.reconciliation.codes;

/**Auto Created by VBScript Do not modify!*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eshequ.reconciliation.exception.NotFoundException;
import com.eshequ.reconciliation.mapper.CodeInfoMapper;
import com.eshequ.reconciliation.model.CodeInfo;

@Component
public class CodesItem {

	/** 业务模板类型 */
	protected static final String templetType = new String("138");
	/** 办证标志 */
	protected static final String certFlag = new String("140");
	/** 菜单功能级别 */
	protected static final String menuFunLevel = new String("2");
	/** 操作员状态 */
	protected static final String operStatus = new String("3");
	/** 用户收费类型 */
	protected static final String cspFeeType = new String("149");
	/** 收费性质 */
	protected static final String feeKind = new String("152");
	/** 参数类别 */
	protected static final String paraType = new String("14");
	/** 户型 */
	protected static final String houseModel = new String("153");
	/** 清算状态 */
	protected static final String acctWaterStatus = new String("154");
	/** 操作数据类型 */
	protected static final String operDataType = new String("16");
	/** 网上支付清算发起方 */
	protected static final String liquidateLauncher = new String("155");
	/** 账单收费类型 */
	protected static final String billFeeType = new String("156");
	/** 收费减免类型 */
	protected static final String feeReduceType = new String("157");
	/** 物业项目类型 */
	protected static final String sectType = new String("158");
	/** 单位状态 */
	protected static final String orgStatus = new String("20");
	/** 商铺类型 */
	protected static final String shopsType = new String("159");
	/** 用户收费范围 */
	protected static final String cspFeeRange = new String("160");
	/** 企业证照资料类型 */
	protected static final String materialType = new String("161");
	/** 物业产权性质 */
	protected static final String housePropertyKind = new String("23");
	/** 资质等级 */
	protected static final String qualificationLevel = new String("163");
	/** 物业单元性质 */
	protected static final String mngCellKind = new String("25");
	/** 单位类别 */
	protected static final String deptType = new String("164");
	/** 产品版本 */
	protected static final String productVersion = new String("165");
	/** 频率 */
	protected static final String frequency = new String("166");
	/** 时间周期 */
	protected static final String dateCycle = new String("167");
	/** 账单状态 */
	protected static final String billStatus = new String("168");
	/** 账单来源 */
	protected static final String billSource = new String("169");
	/** 记账方式 */
	protected static final String acctMethod = new String("170");
	/** 账单批次状态 */
	protected static final String billGroupStatus = new String("171");
	/** 分账方式 */
	protected static final String extractMethod = new String("172");
	/** 对象类型 */
	protected static final String objectType = new String("173");
	/** 车位性质 */
	protected static final String carportKind = new String("176");
	/** 临时收费类型 */
	protected static final String tempAcctType = new String("177");
	/** 基础信息状态 */
	protected static final String infoStatus = new String("39");
	/** 结算方式 */
	protected static final String accountMethod = new String("179");
	/** 季度 */
	protected static final String quarter = new String("181");
	/** 月份 */
	protected static final String month = new String("182");
	/** 半年度 */
	protected static final String halfYear = new String("183");
	/** 停车类型 */
	protected static final String parkType = new String("184");
	/** 账单临时状态 */
	protected static final String billTempStatus = new String("185");
	/** 业务类型 */
	protected static final String bizType = new String("187");
	/** 基础信息导入类型 */
	protected static final String importType = new String("188");
	/** 业务状态 */
	protected static final String bizStatus = new String("189");
	/** 借贷标志 */
	protected static final String loanFlag = new String("51");
	/** 缴费登记日期类型 */
	protected static final String feeDateType = new String("190");
	/** 收费类型 */
	protected static final String feeType = new String("191");
	/** 账单交易状态 */
	protected static final String mergerStatus = new String("192");
	/** 错误类型 */
	protected static final String errorType = new String("193");
	/** 年度 */
	protected static final String year = new String("55");
	/** 抄表费用类型 */
	protected static final String meterFeeType = new String("194");
	/** 抄表类型 */
	protected static final String meterType = new String("195");
	/** 分摊方式 */
	protected static final String cutMethod = new String("196");
	/** 分摊状态 */
	protected static final String cutStatus = new String("197");
	/** 分摊类型 */
	protected static final String cutType = new String("198");
	/** 抄表账单类型 */
	protected static final String meterBillType = new String("199");
	/** 每月天数计算方式 */
	protected static final String monthDays = new String("200");
	/** 账单生成方式 */
	protected static final String billDateMethod = new String("201");
	/** 个性化服务价格单位 */
	protected static final String servePriceUnit = new String("202");
	/** 个性化服务受理状态 */
	protected static final String serveBookStatus = new String("203");
	/** 是否标志 */
	protected static final String isFlag = new String("65");
	/** 维修类型 */
	protected static final String repairType = new String("204");
	/** 维修状态 */
	protected static final String repairStatus = new String("205");
	/** 投诉类型 */
	protected static final String complaintType = new String("206");
	/** 投诉状态 */
	protected static final String complaintStatus = new String("207");
	/** 出入库类型 */
	protected static final String tradeType = new String("208");
	/** 对帐操作类型 */
	protected static final String checkOperType = new String("210");
	/** 核对标志 */
	protected static final String checkFlag = new String("211");
	/** 物业服务级别 */
	protected static final String cspServiceLevel = new String("80");
	/** 楼宇结构类型 */
	protected static final String proStrucType = new String("81");
	/** 交易状态 */
	protected static final String tranStatus = new String("220");
	/** 物业项目性质 */
	protected static final String proCreateType = new String("82");
	/** 支付渠道 */
	protected static final String payMethod = new String("221");
	/** 性别 */
	protected static final String sexFlag = new String("84");
	/** 返点状态 */
	protected static final String rebateStatus = new String("224");
	/** 账单差额状态 */
	protected static final String differenceStatus = new String("225");
	/** 数据信息来源 */
	protected static final String dataSource = new String("226");
	/** 调价标识 */
	protected static final String adjustFlag = new String("227");
	/** 电梯标志 */
	protected static final String liftFlag = new String("89");
	/** 对账单投递状态 */
	protected static final String deliveryStatus = new String("228");
	/** 对账单成本类型 */
	protected static final String stmtCostType = new String("229");
	/** 对账单流程行进状态 */
	protected static final String stmtFlowStatus = new String("230");
	/** 证件类型 */
	protected static final String certType = new String("95");
	/** 政治面貌 */
	protected static final String polityFace = new String("96");
	/** 建筑类型 */
	protected static final String buildType = new String("100");
	/** 操作日志类型 */
	protected static final String operatorType = new String("101");
	/** 科目类型 */
	protected static final String subjectType = new String("102");
	/** 科目级别 */
	protected static final String subjectLevel = new String("103");
	/** 车辆类型 */
	protected static final String carType = new String("106");
	/** 颜色 */
	protected static final String colour = new String("107");
	/** 车位类型 */
	protected static final String carportType = new String("108");
	/** 产权归属 */
	protected static final String propertyOwner = new String("110");
	/** 朝向 */
	protected static final String ward = new String("111");
	/** 广告位类型 */
	protected static final String adLocateType = new String("112");
	/** 学历 */
	protected static final String degree = new String("113");
	/** 居委会人员职务 */
	protected static final String commiStaffDuty = new String("114");
	/** 业委会人员职务 */
	protected static final String hocStaff = new String("115");
	/** 物业公司人员岗位 */
	protected static final String cspStaffPost = new String("116");
	/** 物业公司人员职务 */
	protected static final String cspStaffDuty = new String("117");
	/** 专业技术职称 */
	protected static final String skillLevel = new String("118");
	/** 专业技术等级 */
	protected static final String skillProfess = new String("119");
	/** 客户类型 */
	protected static final String custType = new String("120");
	/** 车辆归属 */
	protected static final String carOwnerType = new String("121");
	/** 设备运行状态 */
	protected static final String facilityStatus = new String("123");
	/** 合同状态 */
	protected static final String contractStatus = new String("126");
	/** 建筑用途 */
	protected static final String buildUsage = new String("127");
	/** 公司性质 */
	protected static final String companyKind = new String("128");
	/** 业务模板性质 */
	protected static final String templetKind = new String("129");
	/** 价格单位 */
	protected static final String priceUnit = new String("130");
	/** 物业单元类型 */
	protected static final String mngCellType = new String("133");
	/** 客户性质 */
	protected static final String custKind = new String("135");
	/** 红包状态 */
	protected static final String redPackStatus = new String("231");
	/** 转账状态 */
	protected static final String transferStatus = new String("232");
	/** 临时收费方式 */
	protected static final String tempMode = new String("233");
	/** 临时停车收费状态 */
	protected static final String tempStatus = new String("234");
	/** 临停配置区间 */
	protected static final String tempFeeRange = new String("235");
	/** 临停信息来源 */
	protected static final String tempDataSource = new String("236");
	/** 临停价格单位 */
	protected static final String tempPriceUnit = new String("237");
	/** 车辆停放类型 */
	protected static final String carStopType = new String("238");
	/** 微信支付平台渠道 */
	protected static final String platChannel = new String("239");
	/** 参数子类别 */
	protected static final String subParaType = new String("240");
	/** 支付场景 */
	protected static final String payScenarios = new String("241");
	/** 停车支付方式 */
	protected static final String parkPayMethod = new String("242");
	/** 电子发票状态 */
	protected static final String invoiceStatus = new String("246");
	/** 支付交易类型 */
	protected static final String payTranType = new String("247");
	/** 商户类型 */
	protected static final String mchType = new String("248");
	/** 商户状态 */
	protected static final String mchStatus = new String("249");
	/** 发票申请类型 */
	protected static final String invoiceApplyType = new String("250");
	/** 发票开具类型 */
	protected static final String invoiceType = new String("251");
	/** POS品牌 */
	protected static final String posBrand = new String("252");
	/** 在线支付费率承担方 */
	protected static final String onlineCostTaker = new String("253");
	/** 银行卡类型 */
	protected static final String cardType = new String("254");

	protected static final Map mapCat = new HashMap(2 << 8);
	static {
		mapCat.put("Frequency", frequency);
		mapCat.put("DateCycle", dateCycle);
		mapCat.put("BillStatus", billStatus);
		mapCat.put("MenuFunLevel", menuFunLevel);
		mapCat.put("BillSource", billSource);
		mapCat.put("OperStatus", operStatus);
		mapCat.put("AcctMethod", acctMethod);
		mapCat.put("BillGroupStatus", billGroupStatus);
		mapCat.put("ExtractMethod", extractMethod);
		mapCat.put("ObjectType", objectType);
		mapCat.put("CarportKind", carportKind);
		mapCat.put("TempAcctType", tempAcctType);
		mapCat.put("AccountMethod", accountMethod);
		mapCat.put("ParaType", paraType);
		mapCat.put("Quarter", quarter);
		mapCat.put("Month", month);
		mapCat.put("OperDataType", operDataType);
		mapCat.put("HalfYear", halfYear);
		mapCat.put("ParkType", parkType);
		mapCat.put("BillTempStatus", billTempStatus);
		mapCat.put("OrgStatus", orgStatus);
		mapCat.put("BizType", bizType);
		mapCat.put("ImportType", importType);
		mapCat.put("BizStatus", bizStatus);
		mapCat.put("HousePropertyKind", housePropertyKind);
		mapCat.put("FeeDateType", feeDateType);
		mapCat.put("FeeType", feeType);
		mapCat.put("MngCellKind", mngCellKind);
		mapCat.put("MergerStatus", mergerStatus);
		mapCat.put("ErrorType", errorType);
		mapCat.put("MeterFeeType", meterFeeType);
		mapCat.put("MeterType", meterType);
		mapCat.put("CutMethod", cutMethod);
		mapCat.put("CutStatus", cutStatus);
		mapCat.put("CutType", cutType);
		mapCat.put("MeterBillType", meterBillType);
		mapCat.put("MonthDays", monthDays);
		mapCat.put("BillDateMethod", billDateMethod);
		mapCat.put("ServePriceUnit", servePriceUnit);
		mapCat.put("ServeBookStatus", serveBookStatus);
		mapCat.put("RepairType", repairType);
		mapCat.put("RepairStatus", repairStatus);
		mapCat.put("InfoStatus", infoStatus);
		mapCat.put("ComplaintType", complaintType);
		mapCat.put("ComplaintStatus", complaintStatus);
		mapCat.put("TradeType", tradeType);
		mapCat.put("CheckOperType", checkOperType);
		mapCat.put("CheckFlag", checkFlag);
		mapCat.put("LoanFlag", loanFlag);
		mapCat.put("TranStatus", tranStatus);
		mapCat.put("PayMethod", payMethod);
		mapCat.put("Year", year);
		mapCat.put("RebateStatus", rebateStatus);
		mapCat.put("DifferenceStatus", differenceStatus);
		mapCat.put("DataSource", dataSource);
		mapCat.put("AdjustFlag", adjustFlag);
		mapCat.put("DeliveryStatus", deliveryStatus);
		mapCat.put("StmtCostType", stmtCostType);
		mapCat.put("StmtFlowStatus", stmtFlowStatus);
		mapCat.put("RedPackStatus", redPackStatus);
		mapCat.put("IsFlag", isFlag);
		mapCat.put("TransferStatus", transferStatus);
		mapCat.put("TempMode", tempMode);
		mapCat.put("TempPriceUnit", tempPriceUnit);
		mapCat.put("TempFeeRange", tempFeeRange);
		mapCat.put("TempStatus", tempStatus);
		mapCat.put("TempDataSource", tempDataSource);
		mapCat.put("CarStopType", carStopType);
		mapCat.put("SubParaType", subParaType);
		mapCat.put("ParkPayMethod", parkPayMethod);
		mapCat.put("InvoiceStatus", invoiceStatus);
		mapCat.put("CspServiceLevel", cspServiceLevel);
		mapCat.put("InvoiceApplyType", invoiceApplyType);
		mapCat.put("ProStrucType", proStrucType);
		mapCat.put("PayTranType", payTranType);
		mapCat.put("ProCreateType", proCreateType);
		mapCat.put("InvoiceType", invoiceType);
		mapCat.put("SexFlag", sexFlag);
		mapCat.put("PlatChannel", platChannel);
		mapCat.put("PayScenarios", payScenarios);
		mapCat.put("MchType", mchType);
		mapCat.put("PosBrand", posBrand);
		mapCat.put("OnlineCostTaker", onlineCostTaker);
		mapCat.put("LiftFlag", liftFlag);
		mapCat.put("CardType", cardType);
		mapCat.put("CertType", certType);
		mapCat.put("PolityFace", polityFace);
		mapCat.put("BuildType", buildType);
		mapCat.put("OperatorType", operatorType);
		mapCat.put("SubjectType", subjectType);
		mapCat.put("SubjectLevel", subjectLevel);
		mapCat.put("CarType", carType);
		mapCat.put("Colour", colour);
		mapCat.put("CarportType", carportType);
		mapCat.put("PropertyOwner", propertyOwner);
		mapCat.put("Ward", ward);
		mapCat.put("AdLocateType", adLocateType);
		mapCat.put("Degree", degree);
		mapCat.put("CommiStaffDuty", commiStaffDuty);
		mapCat.put("HocStaff", hocStaff);
		mapCat.put("CspStaffPost", cspStaffPost);
		mapCat.put("CspStaffDuty", cspStaffDuty);
		mapCat.put("SkillLevel", skillLevel);
		mapCat.put("SkillProfess", skillProfess);
		mapCat.put("CustType", custType);
		mapCat.put("CarOwnerType", carOwnerType);
		mapCat.put("FacilityStatus", facilityStatus);
		mapCat.put("ContractStatus", contractStatus);
		mapCat.put("BuildUsage", buildUsage);
		mapCat.put("CompanyKind", companyKind);
		mapCat.put("TempletKind", templetKind);
		mapCat.put("PriceUnit", priceUnit);
		mapCat.put("MngCellType", mngCellType);
		mapCat.put("CustKind", custKind);
		mapCat.put("TempletType", templetType);
		mapCat.put("CertFlag", certFlag);
		mapCat.put("CspFeeType", cspFeeType);
		mapCat.put("FeeKind", feeKind);
		mapCat.put("HouseModel", houseModel);
		mapCat.put("AcctWaterStatus", acctWaterStatus);
		mapCat.put("LiquidateLauncher", liquidateLauncher);
		mapCat.put("BillFeeType", billFeeType);
		mapCat.put("FeeReduceType", feeReduceType);
		mapCat.put("SectType", sectType);
		mapCat.put("ShopsType", shopsType);
		mapCat.put("CspFeeRange", cspFeeRange);
		mapCat.put("MaterialType", materialType);
		mapCat.put("QualificationLevel", qualificationLevel);
		mapCat.put("DeptType", deptType);
		mapCat.put("ProductVersion", productVersion);
	}

	protected static final Map mapCategoryCode = new HashMap(2 << 8);
	protected static final Map mapCodeObject = new HashMap(2 << 8);
	private static CodeInfoMapper mapper;
	@Autowired
	private CodeInfoMapper codeInfoMapper;

	public boolean equals(String obj) {
		return this.code.equals(obj);
	}

	public boolean equals(Object obj) {
		return this.code.equals(obj);
	}

	public String toString() {
		return this.code;
	}

	/**
	 * convert 2 cn value
	 * 
	 * @param category
	 * @param code
	 * @return
	 */
	protected static String getValue(String category, String code) {
		Map map = (Map) mapCategoryCode.get(category);
		if (map == null)
			return "";
		String temp = (String) map.get(code);
		return (temp == null) ? "" : temp;
	}

	public static List<CodeInfo> getCodeList(String categoryCode) {
		List<CodeInfo> list = new ArrayList<CodeInfo>();
		Map mp = (Map) mapCategoryCode.get(categoryCode);
		if (mp == null)
			return list;
		String temp;
		for (Iterator it = mp.keySet().iterator(); it.hasNext();) {
			temp = (String) it.next();
			CodeInfo codeInfo = new CodeInfo();
			codeInfo.setCiSpClass(categoryCode);
			codeInfo.setCiSpCode(temp);
			codeInfo.setCiSpName((String) mp.get(temp));
			list.add(codeInfo);
		}
		Collections.sort(list, new Comparator<CodeInfo>() {
			@Override
			public int compare(CodeInfo o1, CodeInfo o2) {
				int i = o1.getCiSpCode().compareTo(o2.getCiSpCode());
				if (i == 0) {
					return o1.getCiSpName().compareTo(o2.getCiSpName());
				}
				return i;
			}
		});
		return list;
	}

	public static Map getCategoryItems(String categoryName) {
		String categoryCode = (String) mapCat.get(categoryName);
		if (categoryCode == null)
			throw new RuntimeException(categoryName + "code category dose not initialize!");

		Map mp = (Map) mapCategoryCode.get(categoryCode);
		return mp;
	}

	/**
	 * convert 2 cn value
	 * 
	 * @return
	 */
	public String getValue() {
		return getValue(this.category, this.code);
	}

	public CodesItem() {
	}

	@PostConstruct
	public void init() {
		mapper = this.codeInfoMapper;
	}

	/**
	 * construction
	 * 
	 * @param category
	 * @param code
	 */
	protected CodesItem(String category, String code) {
		this.category = category;
		this.code = code;
	}

	protected static final List<CodeInfo> getCodeFromDB(String category) {
		List<CodeInfo> list = mapper.selectByClass(category);
		if (list.size() < 1) {
			throw new NotFoundException("current code item can't be found in db! code=" + category);
		}
		return list;
	}

	private String code;
	protected String category;

	public String getCategoryCode() {
		return category;
	}
}
