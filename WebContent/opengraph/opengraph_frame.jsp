<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@include file="../common.jsp"%>
</head>
<body>
<h2>嵌入第三方页面方式</h2>
<div>
<p>
6年前，彼时的天猫刚刚立项为“淘宝商城”，试水B2C，白手起家尝试做双11时，或许未曾想过，11月11日，这一天，竟会成为无论线上与线下，中国消费者的购物狂欢节，要知道，即便是2012年，也鲜见天猫之外的独立电商参与其中。
</p>
<p>
桃李不言，下自成蹊。571亿的数字不是凭空得来，是阿里从阿里巴巴到淘宝，从淘宝商城再到天猫，15年的“担保交易”的信用累积。571亿的数字，也让之前一切质疑，再次冰释，烟消云散。
</p>
在商言商，抛开立场，天猫的双11固然有多年的投入与耕耘，之外也还是要向京东、苏宁这种“搭便车”的传播致敬，凭空指责与枉然质疑，不雅，却也是意外地成就了“双11购物狂欢节”——这就是市场竞争的魅力——但凡不能杀死你的,最终都会使你更强大，这世界本没有路，走的人多了，也就成了路。
</p>
<p>
从8848的轰然倒下，到Ebay中国的折戟沉沙，571亿这个数字与两项吉尼斯世界纪录，花落天猫，有幸运色彩，也有天道酬勤。
</p>
<p>
众人拾柴，火焰高，571亿的荣光，不只属于天猫独享——从某种意义上来说，天猫只不过是个聪明、勤奋又幸运的弄潮者，在这数字背后，有韩都衣舍、海尔、小米等商家的鼎力，有日日顺、四通一达、顺丰、菜鸟等物流配送的亲密无间。
</p>
<p>
京东、苏宁受惠于天猫双11购物狂欢，整个电商系统其实都受惠于此，但在571亿这个数字面前，京东、苏宁等黯然稍逊风骚，这倒不是京东、苏宁不够努力，而是因为，这个时代并不属于它们——天猫成于“无我”，京东成于“我执”，但京东们宥于“我执”。
</p>
<p>
所谓“无我”，是社会化分工，阿里搭台，商家唱戏，物流快递串场，生态价值链条，铁索连环，阿里退在后面，控制了消费流、资金流以及物流背后的数据流，与商家，与生态伙伴分享。
</p>
<p>
所谓“我执”，是中央集权，京东操控，从采购到配送，一系列的控制，因控制，而有效率，但“控制”背后是军事化管理，独裁式集权，集权始终有“管理半径”，只能在特定范围内有效，却不能无边际扩张。
</p>
<p>
“我执”是精打细算的生意，“无我”是精打细算的生意，更是生态。
</p>
<p>
双11当天，阿里市值冲击3000亿美元，但苏宁股价却在低落，天壤之别如云如泥，这是两个时代——电商之于传统零售的对应。
</p>
<p>
一切的商业竞争，都是效率高下的竞赛，都是用户习惯的占位。
</p>
</div>
<div id="feed_container"></div>
<script>
var  user = localStorage.user;
var  ocuId = localStorage.ocuId;
var  thirdurl = localStorage.thirdurl;
var  imageurl = localStorage.imageurl;
//所有关于openGrap的请求，都需要在该回调中运行
MX.onGraphLoad({
		    objectProperties:{
			    url: thirdurl + "?type=frame",
			    type:  "page",
			    title: "敏行培训对象frame",
			    image: imageurl
		   },
		   ocuId:ocuId
		},function(mc){
		    //底部评论 
		    MX.embedGraph({
		        container:"feed_container",
		        //graph和conversations_graph
		        type:"conversations_graph", 
		        config:{
		               promptText: "跟这个说点什么吧",
		               miniApps:["update"],
		               showFeedFilter:true,
		               showAppFilter:true
		        }
		    });
});
MX.on("fresh_message",function(num){
	console.log("fresh_message 11111111111111111.");
	iterator(num);
	   
	});
	 
function iterator(num){
	for(var x in num){
		if(Object.prototype.toString.call(num[x]) === '[object Object]'){
			for(var y in num[x]){
				console.log("num:[" + x + "]["+y+"]="+num[x][y] );
			}
		}else{
			console.log("num:[" + x + "]="+num[x] );
		}
	}
}
</script>

</body>
</html>