package com.demo;


import java.util.ArrayList;
import java.util.List;

import com.minxing.client.app.AppAccount;
import com.minxing.client.ocu.Article;
import com.minxing.client.ocu.ArticleMessage;
import com.minxing.client.ocu.Resource;

public class CreateShowData {

	public static void main(String[] args) throws InterruptedException {
		
		AppAccount account = AppAccount.loginByAccessToken("http://localhost:3000",
				"cGTsJXPAJeEwUEXvt2SvJ--0q7cPunUqvc4AMKb8i6y-PUti");
		
//		createJingfen(account);
//		createNews(account);
//		createOaData(account);
		createLink(account);
	}
	
	private static void createLink(AppAccount account){
		ArticleMessage m = new ArticleMessage(true);
		m.addArticle(new Article("请假单", "请假人：姚广利<br>请假事由：因父亲生病住院，需要人照顾，特请假<br>请假时间：6月28日 - 6月30日<br>工作交接人：马青冈", "", "/mxpp/plists/html/oa1.html", ""));
		
		
		String[] toUserIds = new String[] {"2609@view.htsc"};
		String ocuId = "bde209e19cfebcfa2f719a52a4406441";
		String ocuSecret = "ece9d330a116b878a119aa3deb4e30e2";
		account.sendOcuMessageToUsers(toUserIds, m, ocuId, ocuSecret);
		
	}
	
	private static void createNews(AppAccount account){
		ArticleMessage m = new ArticleMessage();
		Resource resource = new Resource("电信巨头推理财凸显竞争压力","","","2014-05-27","https://www.minxing365.com/plists/html/new1.jpg"
					,"<p>继中国电信推出添益宝后，中国联通和中国移动也纷纷试水金融理财。此举凸显三大运营商的业绩压力，也是面对虚拟运营商竞争的回应。</p>\n\n"
							+ "<p>三大运营商纷纷试水金融理财</p>\n\n"
							+ "<p>中国三大电信运营商近期纷纷进入金融理财领域。继中国电信推出添益宝后，中国联通也于日前推出话费宝产品。此类产品实际上是利用话费投资货币基金的余额理财。中国移动也表示会推类似的余额增值理财服务。</p>\n\n"
							+ "<p>试水金融理财凸显三大运营商的业绩压力。今年4月，中国电信移动用户流失103万，而中国联通新增仅89.5万户，不仅与前月相比差距甚大，而且创五年来新低。另外，中国移动的财报显示其一季度净利润同比下降9.4%，为14年来首次利润下降。中国移动是全球用户最多的移动运营商，随着传统业务趋于饱和，大型电信运营商不得不调整业务寻求新的利润增长途径。但现在并非最佳时机，当前货币基金回报率正在持续下降，添益宝等产品在收益方面也并无优势，很难吸引新的大额存款。</p>\n\n"
							+ "<p>虚拟运营商逼迫“三巨头”转型</p>\n\n"
							+ "<p>三大运营商改变的动力可能来自虚拟运营商的竞争。五月份以来，获得牌照的虚拟运营商开始密集的品牌发布和套餐业务的开发。虚拟运营商为用户提供使用自有品牌的通信服务，可能会向用户提供折扣，或推出与购买手机等产品绑定的服务套餐。例如，苏宁发布了18种套餐资费方案，资费变化从8元到208元以满足各个消费区间人群的需要。值得注意的是，苏宁还推出了与旗下视频网站绑定的免费流量，以及使用苏宁云商手机客户端免流量的特色服务。</p>\n\n"
							+ "<p>但在中国，虚拟运营商还面临诸多限制。例如不允许虚拟运营商提供全国性的服务，禁止建设自有网络等。去年年底获批的虚拟运营商只能从现有运营商那里租借设备，无法形成实质竞争，电信企业较高的收费也对虚拟运营商构成冲击。</p>\n\n"
				);
		m.addArticle(new Article(resource, "电信巨头推理财凸显竞争压力", "https://www.minxing365.com/plists/html/new1.jpg", "继中国电信推出添益宝后，中国联通和中国移动也纷纷试水金融理财。此举凸显三大运营商的业绩压力，也是面对虚拟运营商竞争的回应。"));
		
		List<String> ids = new ArrayList<String>();
		for(int i=1;i<=10;i++){
			ids.add("demo" + i + "@demo.com");
		}
		
		ids.add("liuhua@dehuinet.com");
//		ids.add("dinglb@dehuinet.com");
		ids.add("heyu@dehuinet.com");
		ids.add("lvsh@dehuinet.com");
		ids.add("liwei@dehuinet.com");
		ids.add("liujiang@dehuinet.com");
		ids.add("liyang@dehuinet.com");
//		ids.add("zhangzheng@dehuinet.com");
//		ids.add("wangpl@dehuinet.com");
//		ids.add("baoyj@dehuinet.com");
		
		
		String ocuId = "a0e9d9890d46d5a532415080a85a6426";
		String ocuSecret = "f00e404ae4411a064ef102d3499ec86a";
		
		
		
		account.sendOcuMessageToUsers(ids.toArray(new String[0] ), m, ocuId, ocuSecret);
		
		m = new ArticleMessage();
		resource = new Resource("美国次贷危机启示","","","2014-05-27","https://www.minxing365.com/plists/html/new2.jpg"
					,"<p>三大因素成危机爆发隐患</p>\n\n"
							+ "<p>降息复加息，货币政策大幅调转：2000 年后美联储大幅降息，经济获得高速发展，自04 年6 月起，出于通胀抬头的压力，美联储开始连续加息，大动静的货币政策转变未能让市场有所缓冲，成为次贷危机的第一个隐患。</p>\n\n"
							+ "<p>低利率促成房地产泡沫：受低利率利好，房贷成本下降，房地产需求扩大，新屋开工和新房销售大幅度提高，整个行业欣欣向荣，而房价增长逐步脱离整体价格水平，即使04 年起连续加息也没能阻止房价泡沫。</p>\n\n"
							+ "<p>次贷证券化“雪球”越滚越大：在低利率、高房价的环境下，次贷的风险被低估，同时美国政府设立两房、提倡居民购房，金融机构大量发行次贷和次贷证券化产品以获取巨额利润；MBS、CMO、浮动利息产品等都加大了金融风险。</p>\n\n"
							+ "<p>对中国的启示</p>\n\n"
							+ "<p>货币超增导致地产泡沫：过去10 年中国房价涨幅远超通胀，而与货币增速高度相关，意味着房价泡沫的出现源于货币超额扩张。</p>\n\n"
							+ "<p>货币长期宽松，影子银行泛滥：而货币超增又与两大因素有关，一是长期宽松的货币政策，刻意维持偏低利率以刺激经济增长，体现为贷款平均利率远低于GDP名义增速；二是影子银行的野蛮生长，过去10 年非标融资年均增速高达58%，远高于21%的社融增速和15%的GDP 名义增速。</p>\n\n"
							+ "<p>货币挤出泡沫，经济影响深远：新政府强调稳健货币政策，从8 号文、107 号文到127 号文对同业、影子银行全面拨乱反正，以信托、委托贷款为标志的非标融资开始明显收缩，这也意味着货币高速扩张成为历史。而与地产相关的各类金融产品价格均面临缩水风险，进而会对投资、消费形成冲击，对后续经济影响深远。</p>\n\n"
				);
		m.addArticle(new Article(resource, "美国次贷危机启示", "https://www.minxing365.com/plists/html/new2.jpg", "降息复加息，货币政策大幅调转：2000 年后美联储大幅降息，经济获得高速发展，自04 年6 月起，出于通胀抬头的压力，美联储开始连续加息，大动静的货币政策转变未能让市场有所缓冲，成为次贷危机的第一个隐患。"));
		
		account.sendOcuMessageToUsers(ids.toArray(new String[0] ), m, ocuId, ocuSecret);
		
		m = new ArticleMessage();
		resource = new Resource("揭秘中俄天然气协议","","","2014-05-27","https://www.minxing365.com/plists/html/new3.jpg"
					,"<p>5月21日，因价格分歧延宕10余年的中俄天然气协议终于签署，但具体成交价格并未被披露。据推算，成交价高于中国从中亚进口天然气的价格，如果属实，中方让步更大。</p>\n\n"
							+ "<p>中俄天然气协议十年终落地</p>\n\n"
							+ "<p>在俄罗斯总统普京访华期间，中国与俄罗斯天然气工业股份公司(Gazprom)达成了从后者进口天然气的协议。根据合同，从2018年起，俄罗斯开始通过中俄天然气管道东线向中国供气，输气量逐年增长，最终达到每年380亿立方米，累计合同期30年。</p>\n\n"
							+ "<p>中俄天然气谈判已逾十年，1999年，俄罗斯天然气公司曾与中方达成意向性的天然气出口协议，但由于国际能源市场价格飙升，双方最终没有签署合同。本次协议签署的背景是俄与占其贸易总额一半的欧洲关系恶化，以及中国在东海和南海上存在的领土纠纷。普京可借此降低对欧洲天然气市场的依赖，中国也可克服马六甲海峡的能源运输瓶颈。</p>\n\n"
							+ "<p>俄罗斯是全球最大的能源净出口国，中国已跃升为全球第二大能源净进口国，而且两国有很长的陆地边界，多方因素促使中俄能源合作更加紧密。</p>\n\n"
							+ "<p>天然气协议形式大于内容</p>\n\n"
							+ "<p>中俄签署天然气协议无疑会改变全球能源格局，但俄天然气供应要到2018年才开始，而380亿立方米的供应量只相当于目前中国消费量的23%、Gazprom目前出口量的16%。俄罗斯天然气出口仍高度依赖欧洲市场，这一局面短期内难以改变。</p>\n\n"
							+ "<p>而俄罗斯在亚洲的能源客户也不只中国一家。日本在福岛核事故后对液化天然气需求猛增，目前正以全球最高的价格从俄罗斯进口天然气，约500美元/千立方米。如何通过能源武器平衡与中国和日本的关系也是俄方需要考虑的问题。</p>\n\n"
				);
		m.addArticle(new Article(resource, "揭秘中俄天然气协议", "https://www.minxing365.com/plists/html/new3.jpg", "5月21日，因价格分歧延宕10余年的中俄天然气协议终于签署，但具体成交价格并未被披露。据推算，成交价高于中国从中亚进口天然气的价格，如果属实，中方让步更大。"));
		
		
		
		account.sendOcuMessageToUsers(ids.toArray(new String[0] ), m, ocuId, ocuSecret);
	}
	
	private static void createOaData(AppAccount account){
		ArticleMessage m = new ArticleMessage();
		m.addArticle(new Article("请假单", "请假人：姚广利<br>请假事由：因父亲生病住院，需要人照顾，特请假<br>请假时间：6月28日 - 6月30日<br>工作交接人：马青冈", "", "https://www.minxing365.com/plists/html/oa1.html", ""));
		
		List<String> ids = new ArrayList<String>();
		
		//minxing
		for(int i=1;i<=10;i++){
			ids.add("demo" + i + "@demo.com");
		}
		
		ids.add("liuhua@dehuinet.com");
//		ids.add("dinglb@dehuinet.com");
		ids.add("heyu@dehuinet.com");
		ids.add("lvsh@dehuinet.com");
		ids.add("liwei@dehuinet.com");
		ids.add("liujiang@dehuinet.com");
		ids.add("liyang@dehuinet.com");
//		ids.add("zhangzheng@dehuinet.com");
//		ids.add("wangpl@dehuinet.com");
//		ids.add("baoyj@dehuinet.com");
		

		String ocuId = "55ea30e943b5ed574f6a4b30d1287002";
		String ocuSecret = "eefcaa26a8d98706096eeb69eb413a51";
		
		
		
		account.sendOcuMessageToUsers(ids.toArray(new String[0] ), m, ocuId, ocuSecret);
		
		m = new ArticleMessage();
		m.addArticle(new Article("出差费用单", "申请人：王伟<br>出差事由：三一重工基础架构监控系统项目实施<br>出差地点：长沙<br>费用：2318元", "", "https://www.minxing365.com/plists/html/oa2.html", ""));
		account.sendOcuMessageToUsers(ids.toArray(new String[0] ), m, ocuId, ocuSecret);
		
		m = new ArticleMessage();
		m.addArticle(new Article("请假单", "请假人：姚广利<br>请假事由：十一国庆放假计划出游欧洲。<br>请假时间：9月27日 - 10月7日<br>工作交接人：王伟、丁先和", "", "https://www.minxing365.com/plists/html/oa1.html", ""));
		account.sendOcuMessageToUsers(ids.toArray(new String[0] ), m, ocuId, ocuSecret);
		
		m = new ArticleMessage();
		m.addArticle(new Article("出差费用单", "申请人：刘德建<br>出差事由：中国移动IT运维自动化项目二期需求调研<br>出差地点：北京<br>费用：2881元", "", "https://www.minxing365.com/plists/html/oa2.html", ""));
		account.sendOcuMessageToUsers(ids.toArray(new String[0] ), m, ocuId, ocuSecret);
		
	}
	
	private static void createJingfen(AppAccount account) {
		ArticleMessage m = new ArticleMessage();
		m.addArticle(new Article("经分日报1204-数据流量", "", "https://www.minxing365.com/plists/html/sjjf.jpg", "https://www.minxing365.com/plists/html/sjjf.html", ""));
		m.addArticle(new Article("经分日报1204-T网流量", "", "https://www.minxing365.com/plists/html/sjjf.jpg", "https://www.minxing365.com/plists/html/sjjf.html", ""));
		m.addArticle(new Article("经分日报1204-当月数据流量", "", "https://www.minxing365.com/plists/html/sjjf.jpg", "https://www.minxing365.com/plists/html/sjjf.html", ""));
		m.addArticle(new Article("经分日报1204-计费时长", "", "https://www.minxing365.com/plists/html/sjjf.jpg", "https://www.minxing365.com/plists/html/sjjf.html", ""));
		

		
		String ocuId = "171051519936004cc3d8c2eb74f86254";
		String ocuSecret = "fbddffcf01c45185537671b5a763133d";
		
		List<String> ids = new ArrayList<String>();
		for(int i=1;i<=10;i++){
			ids.add("demo" + i + "@demo.com");
		}
		ids.add("liuhua@dehuinet.com");
//		ids.add("dinglb@dehuinet.com");
		ids.add("heyu@dehuinet.com");
		ids.add("lvsh@dehuinet.com");
		ids.add("liwei@dehuinet.com");
		ids.add("liujiang@dehuinet.com");
		ids.add("liyang@dehuinet.com");
//		ids.add("zhangzheng@dehuinet.com");
//		ids.add("wangpl@dehuinet.com");
//		ids.add("baoyj@dehuinet.com");
		
		account.sendOcuMessageToUsers(ids.toArray(new String[0] ), m, ocuId, ocuSecret);
		
		m = new ArticleMessage();
		m.addArticle(new Article("经分日报1204-当月计费时长", "", "https://www.minxing365.com/plists/html/sjjf.jpg", "https://www.minxing365.com/plists/html/sjjf.html", ""));
		m.addArticle(new Article("经分日报1204-市场新增份额", "", "https://www.minxing365.com/plists/html/sjjf.jpg", "https://www.minxing365.com/plists/html/sjjf.html", ""));
		m.addArticle(new Article("经分日报1204-净增及通信市场份额", "", "https://www.minxing365.com/plists/html/sjjf.jpg", "https://www.minxing365.com/plists/html/sjjf.html", ""));
		m.addArticle(new Article("经分日报1204-三网发展", "", "https://www.minxing365.com/plists/html/sjjf.jpg", "https://www.minxing365.com/plists/html/sjjf.html", ""));
		account.sendOcuMessageToUsers(ids.toArray(new String[0] ), m, ocuId, ocuSecret);
		
		m = new ArticleMessage();
		m.addArticle(new Article("经分日报1204-用户新增", "", "https://www.minxing365.com/plists/html/sjjf.jpg", "https://www.minxing365.com/plists/html/sjjf.html", ""));
		m.addArticle(new Article("经分日报1204-当月新增用户", "", "https://www.minxing365.com/plists/html/sjjf.jpg", "https://www.minxing365.com/plists/html/sjjf.html", ""));
		m.addArticle(new Article("经分日报1204-用户净增", "", "https://www.minxing365.com/plists/html/sjjf.jpg", "https://www.minxing365.com/plists/html/sjjf.html", ""));
		m.addArticle(new Article("经分日报1204-宽带市场", "", "https://www.minxing365.com/plists/html/sjjf.jpg", "https://www.minxing365.com/plists/html/sjjf.html", ""));
		account.sendOcuMessageToUsers(ids.toArray(new String[0] ), m, ocuId, ocuSecret);
		
		m = new ArticleMessage();
		m.addArticle(new Article("经分日报1204-当月宽带发展", "", "https://www.minxing365.com/plists/html/sjjf.jpg", "https://www.minxing365.com/plists/html/sjjf.html", ""));
		m.addArticle(new Article("经分日报1204-终端销售:智能机销售", "", "https://www.minxing365.com/plists/html/sjjf.jpg", "https://www.minxing365.com/plists/html/sjjf.html", ""));
		m.addArticle(new Article("经分日报1204-终端销售:分销售方式", "", "https://www.minxing365.com/plists/html/sjjf.jpg", "https://www.minxing365.com/plists/html/sjjf.html", ""));
		m.addArticle(new Article("经分日报1204-终端销售:分销售渠道", "", "https://www.minxing365.com/plists/html/sjjf.jpg", "https://www.minxing365.com/plists/html/sjjf.html", ""));
		
		
		account.sendOcuMessageToUsers(ids.toArray(new String[0] ), m, ocuId, ocuSecret);
	}

}
