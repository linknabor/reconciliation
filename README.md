# reconciliation
���ˡ�����ģ����ع�

����ע�����
1.pom�ļ������<dependency></dependency>ʱ����Ҫд��ȷ�а汾�ţ���ռλ�����棬���磺${springboot.version}������汾��<properties></properties>��ǩ�¶��塣
2.��mabatis���򹤳̹�������ʵ���mapper�ģ����޸�resources�ļ��µ�generatorConfig.xml��Ȼ����Util�����ҵ�MybatisGeneratorUtill����ִ࣬��main������
3.Mybatis���򹤳�����generatorConfig.xml�ļ�����������modelOnly�������Զ�����SQL�����Ӧ��mapper�������д�����ʵ���Ӧ��Mapper�ļ����̳�com.eshequ.msa.common.CommonMapper��
  �����Ҫʹ��selectByPrimaryKey��updateByPrimaryKey�������Զ����ɵ�ʵ����ע��@ID����Ȼʶ�𲻵�������
4.��Ԫ��������src/test/javaĿ¼��д����������
5.ʹ��maven����ʱ�����ù�˾��maven�ֿ⣬�ٶȻ�ȽϿ졣�ֿ��ַ:http://svn-service.chinacloudapp.cn:8081/nexus/content/groups/public/
6.�жϷǿ�һ��ʹ��OjbectUtil.isEmpty();
7.ʱ����غ�������DateUtil���߰�
8.������Json������ʹ��ObjectMapper��ObjectMapper��Ҫ�Լ�new��ע�뼴�ɡ��̰߳�ȫ��ʹ�÷�����
  Someobj somObj = objectMapper.readValue(respJson, Someobj.class);	//json ת����
  String requestJsonStr = mapper.writeValueAsString(map);	// ����תjson
