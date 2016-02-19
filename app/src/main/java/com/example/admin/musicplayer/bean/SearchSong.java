package com.example.admin.musicplayer.bean;

import java.util.List;

/**
 * Created by admin on 2016/2/19.
 */
public class SearchSong {

    /**
     * showapi_res_code : 0
     * showapi_res_error :
     * showapi_res_body : {"pagebean":{"allNum":177,"allPages":6,"contentlist":[{"albumid":63074,
     * "albummid":"003kZ85M1cfaEF","albumname":"华纳超极品音色系列","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/E/F/003kZ85M1cfaEF.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/E/F/003kZ85M1cfaEF.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/4829067.mp3","m4a":"http://ws.stream.qqmusic.qq.com/4829067.m4a?fromtag=46",
     * "media_mid":"000buMWp48yjTi","singerid":2,"singername":"BEYOND","songid":4829067,
     * "songname":"海阔天空"},{"albumid":8561,"albummid":"002XWx9122oM17","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/1/7/002XWx9122oM17.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/1/7/002XWx9122oM17.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/102396.mp3","m4a":"http://ws.stream.qqmusic.qq.com/102396.m4a?fromtag=46",
     * "media_mid":"002i1vdD1Gv6t7","singerid":4427,"singername":"信乐团","songid":102396},
     * {"albumid":461355,"albummid":"001otv1l2V8Sh6","albumname":"我是歌手第二季 突围赛",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/h/6/001otv1l2V8Sh6.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/h/6/001otv1l2V8Sh6.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/5238536.mp3","m4a":"http://ws.stream.qqmusic.qq
     * .com/5238536.m4a?fromtag=46","singerid":6621,"singername":"曹格","songid":5238536,
     * "songmid":"003MkTX747QAXz","songname":"海阔天空 (Live)"},{"albumid":433209,
     * "albummid":"002WL0KC2U1YmO","albumname":"快乐男声2013 总决赛","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/m/O/002WL0KC2U1YmO.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/m/O/002WL0KC2U1YmO.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/5021487.mp3","m4a":"http://ws.stream.qqmusic.qq.com/5021487.m4a?fromtag=46",
     * "media_mid":"003oD7zb38xrmk","singerid":163550,"singername":"华晨宇","songid":5021487},
     * {"albumid":951206,"albummid":"001rFrDm3USHCE","albumname":"我是歌手第三季 第5期",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/C/E/001rFrDm3USHCE.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/C/E/001rFrDm3USHCE.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/102053191.mp3","m4a":"http://ws.stream.qqmusic.qq
     * .com/102053191.m4a?fromtag=46","media_mid":"002SdwDS054C7l","singerid":4419,
     * "singername":"韩红","songid":102053191},{"albumid":644227,"albummid":"003Wx0212XYbFb",
     * "albumname":"中国新声代第二季 第7期","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/F/b/003Wx0212XYbFb.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/F/b/003Wx0212XYbFb.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/7063693.mp3","m4a":"http://ws.stream.qqmusic.qq.com/7063693.m4a?fromtag=46",
     * "singerid":192193,"singername":"余家辉","songid":7063693,"songmid":"004IejcV0gPYgH"},
     * {"albumid":418538,"albummid":"001MoQus1nyrsh","albumname":"我是歌手第一季 第1期",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/s/h/001MoQus1nyrsh.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/s/h/001MoQus1nyrsh.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/4709017.mp3","m4a":"http://ws.stream.qqmusic.qq
     * .com/4709017.m4a?fromtag=46","singerid":249,"singername":"黄贯中","songid":4709017,
     * "songmid":"001Ufx8N2GdH9x"},{"albumid":422399,"albummid":"001gr16p1wikdz",
     * "albumname":"DEAR DIARY","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/d/z/001gr16p1wikdz.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/d/z/001gr16p1wikdz.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/4771269.mp3","m4a":"http://ws.stream.qqmusic.qq.com/4771269.m4a?fromtag=46",
     * "media_mid":"003obJ4l0gxSLz","singerid":40049,"singername":"Robynn & Kendy",
     * "songid":4771269},{"albumid":463933,"albummid":"003BsgUS2MH9sS","albumname":"最美和声第二季 第2期",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/s/S/003BsgUS2MH9sS.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/s/S/003BsgUS2MH9sS.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/5453166.mp3","m4a":"http://ws.stream.qqmusic.qq
     * .com/5453166.m4a?fromtag=46","singerid":36878,"singername":"谷微","songid":5453166,
     * "songmid":"003UlMSe4g03Se"},{"downUrl":"http://tsmusic24.tc.qq.com/102398.mp3",
     * "m4a":"http://ws.stream.qqmusic.qq.com/102398.m4a?fromtag=46",
     * "media_mid":"000SARpw3xHa5I","songid":102398,"songname":"千年之恋"},
     * {"downUrl":"http://tsmusic24.tc.qq.com/102403.mp3","m4a":"http://ws.stream.qqmusic.qq
     * .com/102403.m4a?fromtag=46","songid":102403,"songmid":"003Fq3t74dm212","songname":"想你的夜"},
     * {"downUrl":"http://tsmusic24.tc.qq.com/102402.mp3","m4a":"http://ws.stream.qqmusic.qq
     * .com/102402.m4a?fromtag=46","media_mid":"0014FQCN2MLXsO","songid":102402,
     * "songname":"天亮以后说分手"},{"albumid":8067,"albummid":"004CLlFV0mj6fC","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/f/C/004CLlFV0mj6fC.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/f/C/004CLlFV0mj6fC.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/95661.mp3","m4a":"http://ws.stream.qqmusic.qq.com/95661.m4a?fromtag=46",
     * "media_mid":"003vf49P1tPdZJ","songid":95661,"songname":"情人"},{"downUrl":"http://tsmusic24
     * .tc.qq.com/102399.mp3","m4a":"http://ws.stream.qqmusic.qq.com/102399.m4a?fromtag=46",
     * "media_mid":"000NQPBR2i0nEf","songid":102399,"songname":"活该"},{"downUrl":"http://tsmusic24
     * .tc.qq.com/95662.mp3","m4a":"http://ws.stream.qqmusic.qq.com/95662.m4a?fromtag=46",
     * "songid":95662,"songmid":"001PeJps37WoGW","songname":"遥かなる梦に Far away"},{"albumid":91313,
     * "albummid":"002i0gTj0Bfbq7","albumname":"天路","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/q/7/002i0gTj0Bfbq7.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/q/7/002i0gTj0Bfbq7.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/4914555.mp3","m4a":"http://ws.stream.qqmusic.qq.com/4914555.m4a?fromtag=46",
     * "singerid":38603,"songid":4914555,"songmid":"003IZP3L27gVuE"},{"downUrl":"http://tsmusic24
     * .tc.qq.com/4914554.mp3","m4a":"http://ws.stream.qqmusic.qq.com/4914554.m4a?fromtag=46",
     * "media_mid":"001OgcQv0MgCSB","songid":4914554,"songname":"喀秋莎"},{"albumname":"",
     * "downUrl":"http://ws.stream.qqmusic.qq.com/lm00e141f66bd914888ec5232ec41a93576f
     * .mp3?fromtag=0","m4a":"http://ws.stream.qqmusic.qq.com/0.m4a?fromtag=46",
     * "songname":"烧包谷"},{"albumid":118237,"albummid":"003dxkSp04utBu","albumname":"Sandy Lam
     * Concert MMXI","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/B/u/003dxkSp04utBu.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/B/u/003dxkSp04utBu.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/1461039.mp3","m4a":"http://ws.stream.qqmusic.qq.com/1461039.m4a?fromtag=46",
     * "singerid":47,"singername":"林忆莲","songid":1461039,"songmid":"003dLAk70KSQGT"},
     * {"albumid":447485,"albummid":"001waooC4QyXTN","albumname":"第八期 巨星之夜",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/T/N/001waooC4QyXTN.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/T/N/001waooC4QyXTN.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/5097089.mp3","m4a":"http://ws.stream.qqmusic.qq
     * .com/5097089.m4a?fromtag=46","singerid":101,"singername":"陶喆","songid":5097089,
     * "songmid":"003oYvtY1tNuKe"},{"downUrl":"http://tsmusic24.tc.qq.com/102405.mp3",
     * "m4a":"http://ws.stream.qqmusic.qq.com/102405.m4a?fromtag=46","songid":102405,
     * "songmid":"001lL2dh1SBqxG","songname":"无可救药爱上你"},{"downUrl":"http://ws.stream.qqmusic.qq
     * .com/TK601f8669f48d8ce044dba9f7f99c7a05dc.mp3?fromtag=0","songname":"面对爱情 (伴奏)"},
     * {"downUrl":"http://ws.stream.qqmusic.qq.com/TK60f9d4ab926841725421f2442d371b0a53
     * .mp3?fromtag=0","singername":"谭锡禧","songname":"海阔天空 (伴奏)"},{"downUrl":"http://ws.stream
     * .qqmusic.qq.com/TK60a427832e1c660852a926af3fa10aa250.mp3?fromtag=0","singername":"何嘉莉"},
     * {"albumid":426489,"albummid":"003lqNL61X8KzW","albumname":"DJ舞曲(华语)系列27",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/z/W/003lqNL61X8KzW.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/z/W/003lqNL61X8KzW.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/4798413.mp3","m4a":"http://ws.stream.qqmusic.qq
     * .com/4798413.m4a?fromtag=46","media_mid":"001Lf2WN4gJ6R0","singerid":12330,
     * "singername":"DJ","songid":4798413,"songname":"海阔天空 (DJ版)"},{"albumid":651582,
     * "albummid":"002HGLzF3OL7Vj","albumname":"毛泽少翻唱精选","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/V/j/002HGLzF3OL7Vj.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/V/j/002HGLzF3OL7Vj.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/7149249.mp3","m4a":"http://ws.stream.qqmusic.qq.com/7149249.m4a?fromtag=46",
     * "singerid":198603,"singername":"毛泽少","songid":7149249,"songmid":"002QKSer3a7Tb1"},
     * {"albumid":1064074,"albummid":"003IpAjl1kDOIm","albumname":"中国新声代第三季 第5期",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/I/m/003IpAjl1kDOIm.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/I/m/003IpAjl1kDOIm.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/103147830.mp3","m4a":"http://ws.stream.qqmusic.qq
     * .com/103147830.m4a?fromtag=46","media_mid":"0023Dp0X3kFGpP","singerid":366577,
     * "singername":"汤晶锦","songid":103147830},{"albumid":515175,"albummid":"004ZlUW20P4i23",
     * "albumname":"别了家驹十五载 海阔天空音乐会","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/2/3/004ZlUW20P4i23.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/2/3/004ZlUW20P4i23.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/7023980.mp3","m4a":"http://ws.stream.qqmusic.qq.com/7023980.m4a?fromtag=46",
     * "media_mid":"002CPh3H1Np76k","singerid":6657,"singername":"黄家强","songid":7023980},
     * {"albumid":523830,"albummid":"001sXYo53Fcp73","albumname":"最美和声第二季 第6期",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/7/3/001sXYo53Fcp73.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/7/3/001sXYo53Fcp73.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/5601282.mp3","m4a":"http://ws.stream.qqmusic.qq
     * .com/5601282.m4a?fromtag=46","singerid":187642,"singername":"祁夏竹","songid":5601282,
     * "songmid":"002xsDc62qW26E"},{"albumid":751567,"albummid":"003aglPZ0ukdca",
     * "albumname":"中国梦之声第二季 第5期","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/c/a/003aglPZ0ukdca.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/c/a/003aglPZ0ukdca.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/8173246.mp3","m4a":"http://ws.stream.qqmusic.qq.com/8173246.m4a?fromtag=46",
     * "media_mid":"004KHI0B3uaU70","singerid":346336,"singername":"李邹珺","songid":8173246}],
     * "currentPage":1,"maxResult":30,"ret_code":0}}
     */

    private int showapi_res_code;
    private String showapi_res_error;
    /**
     * pagebean : {"allNum":177,"allPages":6,"contentlist":[{"albumid":63074,
     * "albummid":"003kZ85M1cfaEF","albumname":"华纳超极品音色系列","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/E/F/003kZ85M1cfaEF.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/E/F/003kZ85M1cfaEF.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/4829067.mp3","m4a":"http://ws.stream.qqmusic.qq.com/4829067.m4a?fromtag=46",
     * "media_mid":"000buMWp48yjTi","singerid":2,"singername":"BEYOND","songid":4829067,
     * "songname":"海阔天空"},{"albumid":8561,"albummid":"002XWx9122oM17","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/1/7/002XWx9122oM17.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/1/7/002XWx9122oM17.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/102396.mp3","m4a":"http://ws.stream.qqmusic.qq.com/102396.m4a?fromtag=46",
     * "media_mid":"002i1vdD1Gv6t7","singerid":4427,"singername":"信乐团","songid":102396},
     * {"albumid":461355,"albummid":"001otv1l2V8Sh6","albumname":"我是歌手第二季 突围赛",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/h/6/001otv1l2V8Sh6.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/h/6/001otv1l2V8Sh6.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/5238536.mp3","m4a":"http://ws.stream.qqmusic.qq
     * .com/5238536.m4a?fromtag=46","singerid":6621,"singername":"曹格","songid":5238536,
     * "songmid":"003MkTX747QAXz","songname":"海阔天空 (Live)"},{"albumid":433209,
     * "albummid":"002WL0KC2U1YmO","albumname":"快乐男声2013 总决赛","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/m/O/002WL0KC2U1YmO.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/m/O/002WL0KC2U1YmO.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/5021487.mp3","m4a":"http://ws.stream.qqmusic.qq.com/5021487.m4a?fromtag=46",
     * "media_mid":"003oD7zb38xrmk","singerid":163550,"singername":"华晨宇","songid":5021487},
     * {"albumid":951206,"albummid":"001rFrDm3USHCE","albumname":"我是歌手第三季 第5期",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/C/E/001rFrDm3USHCE.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/C/E/001rFrDm3USHCE.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/102053191.mp3","m4a":"http://ws.stream.qqmusic.qq
     * .com/102053191.m4a?fromtag=46","media_mid":"002SdwDS054C7l","singerid":4419,
     * "singername":"韩红","songid":102053191},{"albumid":644227,"albummid":"003Wx0212XYbFb",
     * "albumname":"中国新声代第二季 第7期","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/F/b/003Wx0212XYbFb.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/F/b/003Wx0212XYbFb.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/7063693.mp3","m4a":"http://ws.stream.qqmusic.qq.com/7063693.m4a?fromtag=46",
     * "singerid":192193,"singername":"余家辉","songid":7063693,"songmid":"004IejcV0gPYgH"},
     * {"albumid":418538,"albummid":"001MoQus1nyrsh","albumname":"我是歌手第一季 第1期",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/s/h/001MoQus1nyrsh.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/s/h/001MoQus1nyrsh.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/4709017.mp3","m4a":"http://ws.stream.qqmusic.qq
     * .com/4709017.m4a?fromtag=46","singerid":249,"singername":"黄贯中","songid":4709017,
     * "songmid":"001Ufx8N2GdH9x"},{"albumid":422399,"albummid":"001gr16p1wikdz",
     * "albumname":"DEAR DIARY","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/d/z/001gr16p1wikdz.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/d/z/001gr16p1wikdz.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/4771269.mp3","m4a":"http://ws.stream.qqmusic.qq.com/4771269.m4a?fromtag=46",
     * "media_mid":"003obJ4l0gxSLz","singerid":40049,"singername":"Robynn & Kendy",
     * "songid":4771269},{"albumid":463933,"albummid":"003BsgUS2MH9sS","albumname":"最美和声第二季 第2期",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/s/S/003BsgUS2MH9sS.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/s/S/003BsgUS2MH9sS.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/5453166.mp3","m4a":"http://ws.stream.qqmusic.qq
     * .com/5453166.m4a?fromtag=46","singerid":36878,"singername":"谷微","songid":5453166,
     * "songmid":"003UlMSe4g03Se"},{"downUrl":"http://tsmusic24.tc.qq.com/102398.mp3",
     * "m4a":"http://ws.stream.qqmusic.qq.com/102398.m4a?fromtag=46",
     * "media_mid":"000SARpw3xHa5I","songid":102398,"songname":"千年之恋"},
     * {"downUrl":"http://tsmusic24.tc.qq.com/102403.mp3","m4a":"http://ws.stream.qqmusic.qq
     * .com/102403.m4a?fromtag=46","songid":102403,"songmid":"003Fq3t74dm212","songname":"想你的夜"},
     * {"downUrl":"http://tsmusic24.tc.qq.com/102402.mp3","m4a":"http://ws.stream.qqmusic.qq
     * .com/102402.m4a?fromtag=46","media_mid":"0014FQCN2MLXsO","songid":102402,
     * "songname":"天亮以后说分手"},{"albumid":8067,"albummid":"004CLlFV0mj6fC","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/f/C/004CLlFV0mj6fC.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/f/C/004CLlFV0mj6fC.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/95661.mp3","m4a":"http://ws.stream.qqmusic.qq.com/95661.m4a?fromtag=46",
     * "media_mid":"003vf49P1tPdZJ","songid":95661,"songname":"情人"},{"downUrl":"http://tsmusic24
     * .tc.qq.com/102399.mp3","m4a":"http://ws.stream.qqmusic.qq.com/102399.m4a?fromtag=46",
     * "media_mid":"000NQPBR2i0nEf","songid":102399,"songname":"活该"},{"downUrl":"http://tsmusic24
     * .tc.qq.com/95662.mp3","m4a":"http://ws.stream.qqmusic.qq.com/95662.m4a?fromtag=46",
     * "songid":95662,"songmid":"001PeJps37WoGW","songname":"遥かなる梦に Far away"},{"albumid":91313,
     * "albummid":"002i0gTj0Bfbq7","albumname":"天路","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/q/7/002i0gTj0Bfbq7.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/q/7/002i0gTj0Bfbq7.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/4914555.mp3","m4a":"http://ws.stream.qqmusic.qq.com/4914555.m4a?fromtag=46",
     * "singerid":38603,"songid":4914555,"songmid":"003IZP3L27gVuE"},{"downUrl":"http://tsmusic24
     * .tc.qq.com/4914554.mp3","m4a":"http://ws.stream.qqmusic.qq.com/4914554.m4a?fromtag=46",
     * "media_mid":"001OgcQv0MgCSB","songid":4914554,"songname":"喀秋莎"},{"albumname":"",
     * "downUrl":"http://ws.stream.qqmusic.qq.com/lm00e141f66bd914888ec5232ec41a93576f
     * .mp3?fromtag=0","m4a":"http://ws.stream.qqmusic.qq.com/0.m4a?fromtag=46",
     * "songname":"烧包谷"},{"albumid":118237,"albummid":"003dxkSp04utBu","albumname":"Sandy Lam
     * Concert MMXI","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/B/u/003dxkSp04utBu.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/B/u/003dxkSp04utBu.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/1461039.mp3","m4a":"http://ws.stream.qqmusic.qq.com/1461039.m4a?fromtag=46",
     * "singerid":47,"singername":"林忆莲","songid":1461039,"songmid":"003dLAk70KSQGT"},
     * {"albumid":447485,"albummid":"001waooC4QyXTN","albumname":"第八期 巨星之夜",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/T/N/001waooC4QyXTN.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/T/N/001waooC4QyXTN.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/5097089.mp3","m4a":"http://ws.stream.qqmusic.qq
     * .com/5097089.m4a?fromtag=46","singerid":101,"singername":"陶喆","songid":5097089,
     * "songmid":"003oYvtY1tNuKe"},{"downUrl":"http://tsmusic24.tc.qq.com/102405.mp3",
     * "m4a":"http://ws.stream.qqmusic.qq.com/102405.m4a?fromtag=46","songid":102405,
     * "songmid":"001lL2dh1SBqxG","songname":"无可救药爱上你"},{"downUrl":"http://ws.stream.qqmusic.qq
     * .com/TK601f8669f48d8ce044dba9f7f99c7a05dc.mp3?fromtag=0","songname":"面对爱情 (伴奏)"},
     * {"downUrl":"http://ws.stream.qqmusic.qq.com/TK60f9d4ab926841725421f2442d371b0a53
     * .mp3?fromtag=0","singername":"谭锡禧","songname":"海阔天空 (伴奏)"},{"downUrl":"http://ws.stream
     * .qqmusic.qq.com/TK60a427832e1c660852a926af3fa10aa250.mp3?fromtag=0","singername":"何嘉莉"},
     * {"albumid":426489,"albummid":"003lqNL61X8KzW","albumname":"DJ舞曲(华语)系列27",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/z/W/003lqNL61X8KzW.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/z/W/003lqNL61X8KzW.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/4798413.mp3","m4a":"http://ws.stream.qqmusic.qq
     * .com/4798413.m4a?fromtag=46","media_mid":"001Lf2WN4gJ6R0","singerid":12330,
     * "singername":"DJ","songid":4798413,"songname":"海阔天空 (DJ版)"},{"albumid":651582,
     * "albummid":"002HGLzF3OL7Vj","albumname":"毛泽少翻唱精选","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/V/j/002HGLzF3OL7Vj.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/V/j/002HGLzF3OL7Vj.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/7149249.mp3","m4a":"http://ws.stream.qqmusic.qq.com/7149249.m4a?fromtag=46",
     * "singerid":198603,"singername":"毛泽少","songid":7149249,"songmid":"002QKSer3a7Tb1"},
     * {"albumid":1064074,"albummid":"003IpAjl1kDOIm","albumname":"中国新声代第三季 第5期",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/I/m/003IpAjl1kDOIm.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/I/m/003IpAjl1kDOIm.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/103147830.mp3","m4a":"http://ws.stream.qqmusic.qq
     * .com/103147830.m4a?fromtag=46","media_mid":"0023Dp0X3kFGpP","singerid":366577,
     * "singername":"汤晶锦","songid":103147830},{"albumid":515175,"albummid":"004ZlUW20P4i23",
     * "albumname":"别了家驹十五载 海阔天空音乐会","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/2/3/004ZlUW20P4i23.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/2/3/004ZlUW20P4i23.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/7023980.mp3","m4a":"http://ws.stream.qqmusic.qq.com/7023980.m4a?fromtag=46",
     * "media_mid":"002CPh3H1Np76k","singerid":6657,"singername":"黄家强","songid":7023980},
     * {"albumid":523830,"albummid":"001sXYo53Fcp73","albumname":"最美和声第二季 第6期",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/7/3/001sXYo53Fcp73.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/7/3/001sXYo53Fcp73.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/5601282.mp3","m4a":"http://ws.stream.qqmusic.qq
     * .com/5601282.m4a?fromtag=46","singerid":187642,"singername":"祁夏竹","songid":5601282,
     * "songmid":"002xsDc62qW26E"},{"albumid":751567,"albummid":"003aglPZ0ukdca",
     * "albumname":"中国梦之声第二季 第5期","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/c/a/003aglPZ0ukdca.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/c/a/003aglPZ0ukdca.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/8173246.mp3","m4a":"http://ws.stream.qqmusic.qq.com/8173246.m4a?fromtag=46",
     * "media_mid":"004KHI0B3uaU70","singerid":346336,"singername":"李邹珺","songid":8173246}],
     * "currentPage":1,"maxResult":30,"ret_code":0}
     */

    private ShowapiResBodyEntity showapi_res_body;

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }

    public void setShowapi_res_body(ShowapiResBodyEntity showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
    }

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    public ShowapiResBodyEntity getShowapi_res_body() {
        return showapi_res_body;
    }

    public static class ShowapiResBodyEntity {
        /**
         * allNum : 177
         * allPages : 6
         * contentlist : [{"albumid":63074,"albummid":"003kZ85M1cfaEF","albumname":"华纳超极品音色系列",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/E/F/003kZ85M1cfaEF.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/E/F/003kZ85M1cfaEF.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/4829067.mp3","m4a":"http://ws.stream.qqmusic.qq
         * .com/4829067.m4a?fromtag=46","media_mid":"000buMWp48yjTi","singerid":2,
         * "singername":"BEYOND","songid":4829067,"songname":"海阔天空"},{"albumid":8561,
         * "albummid":"002XWx9122oM17","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/1/7/002XWx9122oM17.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/1/7/002XWx9122oM17.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/102396.mp3","m4a":"http://ws.stream.qqmusic.qq.com/102396.m4a?fromtag=46",
         * "media_mid":"002i1vdD1Gv6t7","singerid":4427,"singername":"信乐团","songid":102396},
         * {"albumid":461355,"albummid":"001otv1l2V8Sh6","albumname":"我是歌手第二季 突围赛",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/h/6/001otv1l2V8Sh6.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/h/6/001otv1l2V8Sh6.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/5238536.mp3","m4a":"http://ws.stream.qqmusic.qq
         * .com/5238536.m4a?fromtag=46","singerid":6621,"singername":"曹格","songid":5238536,
         * "songmid":"003MkTX747QAXz","songname":"海阔天空 (Live)"},{"albumid":433209,
         * "albummid":"002WL0KC2U1YmO","albumname":"快乐男声2013 总决赛","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/m/O/002WL0KC2U1YmO.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/m/O/002WL0KC2U1YmO.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/5021487.mp3","m4a":"http://ws.stream.qqmusic.qq.com/5021487.m4a?fromtag=46",
         * "media_mid":"003oD7zb38xrmk","singerid":163550,"singername":"华晨宇","songid":5021487},
         * {"albumid":951206,"albummid":"001rFrDm3USHCE","albumname":"我是歌手第三季 第5期",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/C/E/001rFrDm3USHCE.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/C/E/001rFrDm3USHCE.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/102053191.mp3","m4a":"http://ws.stream.qqmusic
         * .qq.com/102053191.m4a?fromtag=46","media_mid":"002SdwDS054C7l","singerid":4419,
         * "singername":"韩红","songid":102053191},{"albumid":644227,"albummid":"003Wx0212XYbFb",
         * "albumname":"中国新声代第二季 第7期","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/F/b/003Wx0212XYbFb.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/F/b/003Wx0212XYbFb.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/7063693.mp3","m4a":"http://ws.stream.qqmusic.qq.com/7063693.m4a?fromtag=46",
         * "singerid":192193,"singername":"余家辉","songid":7063693,"songmid":"004IejcV0gPYgH"},
         * {"albumid":418538,"albummid":"001MoQus1nyrsh","albumname":"我是歌手第一季 第1期",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/s/h/001MoQus1nyrsh.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/s/h/001MoQus1nyrsh.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/4709017.mp3","m4a":"http://ws.stream.qqmusic.qq
         * .com/4709017.m4a?fromtag=46","singerid":249,"singername":"黄贯中","songid":4709017,
         * "songmid":"001Ufx8N2GdH9x"},{"albumid":422399,"albummid":"001gr16p1wikdz",
         * "albumname":"DEAR DIARY","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/d/z/001gr16p1wikdz.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/d/z/001gr16p1wikdz.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/4771269.mp3","m4a":"http://ws.stream.qqmusic.qq.com/4771269.m4a?fromtag=46",
         * "media_mid":"003obJ4l0gxSLz","singerid":40049,"singername":"Robynn & Kendy",
         * "songid":4771269},{"albumid":463933,"albummid":"003BsgUS2MH9sS","albumname":"最美和声第二季
         * 第2期","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/s/S/003BsgUS2MH9sS
         * .jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/s/S/003BsgUS2MH9sS
         * .jpg","downUrl":"http://tsmusic24.tc.qq.com/5453166.mp3","m4a":"http://ws.stream
         * .qqmusic.qq.com/5453166.m4a?fromtag=46","singerid":36878,"singername":"谷微",
         * "songid":5453166,"songmid":"003UlMSe4g03Se"},{"downUrl":"http://tsmusic24.tc.qq
         * .com/102398.mp3","m4a":"http://ws.stream.qqmusic.qq.com/102398.m4a?fromtag=46",
         * "media_mid":"000SARpw3xHa5I","songid":102398,"songname":"千年之恋"},
         * {"downUrl":"http://tsmusic24.tc.qq.com/102403.mp3","m4a":"http://ws.stream.qqmusic.qq
         * .com/102403.m4a?fromtag=46","songid":102403,"songmid":"003Fq3t74dm212",
         * "songname":"想你的夜"},{"downUrl":"http://tsmusic24.tc.qq.com/102402.mp3","m4a":"http://ws
         * .stream.qqmusic.qq.com/102402.m4a?fromtag=46","media_mid":"0014FQCN2MLXsO",
         * "songid":102402,"songname":"天亮以后说分手"},{"albumid":8067,"albummid":"004CLlFV0mj6fC",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/f/C/004CLlFV0mj6fC.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/f/C/004CLlFV0mj6fC.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/95661.mp3","m4a":"http://ws.stream.qqmusic.qq
         * .com/95661.m4a?fromtag=46","media_mid":"003vf49P1tPdZJ","songid":95661,
         * "songname":"情人"},{"downUrl":"http://tsmusic24.tc.qq.com/102399.mp3","m4a":"http://ws
         * .stream.qqmusic.qq.com/102399.m4a?fromtag=46","media_mid":"000NQPBR2i0nEf",
         * "songid":102399,"songname":"活该"},{"downUrl":"http://tsmusic24.tc.qq.com/95662.mp3",
         * "m4a":"http://ws.stream.qqmusic.qq.com/95662.m4a?fromtag=46","songid":95662,
         * "songmid":"001PeJps37WoGW","songname":"遥かなる梦に Far away"},{"albumid":91313,
         * "albummid":"002i0gTj0Bfbq7","albumname":"天路","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/q/7/002i0gTj0Bfbq7.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/q/7/002i0gTj0Bfbq7.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/4914555.mp3","m4a":"http://ws.stream.qqmusic.qq.com/4914555.m4a?fromtag=46",
         * "singerid":38603,"songid":4914555,"songmid":"003IZP3L27gVuE"},
         * {"downUrl":"http://tsmusic24.tc.qq.com/4914554.mp3","m4a":"http://ws.stream.qqmusic.qq
         * .com/4914554.m4a?fromtag=46","media_mid":"001OgcQv0MgCSB","songid":4914554,
         * "songname":"喀秋莎"},{"albumname":"","downUrl":"http://ws.stream.qqmusic.qq
         * .com/lm00e141f66bd914888ec5232ec41a93576f.mp3?fromtag=0","m4a":"http://ws.stream
         * .qqmusic.qq.com/0.m4a?fromtag=46","songname":"烧包谷"},{"albumid":118237,
         * "albummid":"003dxkSp04utBu","albumname":"Sandy Lam Concert MMXI",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/B/u/003dxkSp04utBu.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/B/u/003dxkSp04utBu.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/1461039.mp3","m4a":"http://ws.stream.qqmusic.qq
         * .com/1461039.m4a?fromtag=46","singerid":47,"singername":"林忆莲","songid":1461039,
         * "songmid":"003dLAk70KSQGT"},{"albumid":447485,"albummid":"001waooC4QyXTN",
         * "albumname":"第八期 巨星之夜","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/T/N/001waooC4QyXTN.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/T/N/001waooC4QyXTN.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/5097089.mp3","m4a":"http://ws.stream.qqmusic.qq.com/5097089.m4a?fromtag=46",
         * "singerid":101,"singername":"陶喆","songid":5097089,"songmid":"003oYvtY1tNuKe"},
         * {"downUrl":"http://tsmusic24.tc.qq.com/102405.mp3","m4a":"http://ws.stream.qqmusic.qq
         * .com/102405.m4a?fromtag=46","songid":102405,"songmid":"001lL2dh1SBqxG",
         * "songname":"无可救药爱上你"},{"downUrl":"http://ws.stream.qqmusic.qq
         * .com/TK601f8669f48d8ce044dba9f7f99c7a05dc.mp3?fromtag=0","songname":"面对爱情 (伴奏)"},
         * {"downUrl":"http://ws.stream.qqmusic.qq.com/TK60f9d4ab926841725421f2442d371b0a53
         * .mp3?fromtag=0","singername":"谭锡禧","songname":"海阔天空 (伴奏)"},{"downUrl":"http://ws
         * .stream.qqmusic.qq.com/TK60a427832e1c660852a926af3fa10aa250.mp3?fromtag=0",
         * "singername":"何嘉莉"},{"albumid":426489,"albummid":"003lqNL61X8KzW","albumname":"DJ舞曲
         * (华语)系列27","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/z/W/003lqNL61X8KzW.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/z/W/003lqNL61X8KzW.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/4798413.mp3","m4a":"http://ws.stream.qqmusic.qq.com/4798413.m4a?fromtag=46",
         * "media_mid":"001Lf2WN4gJ6R0","singerid":12330,"singername":"DJ","songid":4798413,
         * "songname":"海阔天空 (DJ版)"},{"albumid":651582,"albummid":"002HGLzF3OL7Vj",
         * "albumname":"毛泽少翻唱精选","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/V/j/002HGLzF3OL7Vj.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/V/j/002HGLzF3OL7Vj.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/7149249.mp3","m4a":"http://ws.stream.qqmusic.qq.com/7149249.m4a?fromtag=46",
         * "singerid":198603,"singername":"毛泽少","songid":7149249,"songmid":"002QKSer3a7Tb1"},
         * {"albumid":1064074,"albummid":"003IpAjl1kDOIm","albumname":"中国新声代第三季 第5期",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/I/m/003IpAjl1kDOIm.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/I/m/003IpAjl1kDOIm.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/103147830.mp3","m4a":"http://ws.stream.qqmusic
         * .qq.com/103147830.m4a?fromtag=46","media_mid":"0023Dp0X3kFGpP","singerid":366577,
         * "singername":"汤晶锦","songid":103147830},{"albumid":515175,"albummid":"004ZlUW20P4i23",
         * "albumname":"别了家驹十五载 海阔天空音乐会","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/2/3/004ZlUW20P4i23.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/2/3/004ZlUW20P4i23.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/7023980.mp3","m4a":"http://ws.stream.qqmusic.qq.com/7023980.m4a?fromtag=46",
         * "media_mid":"002CPh3H1Np76k","singerid":6657,"singername":"黄家强","songid":7023980},
         * {"albumid":523830,"albummid":"001sXYo53Fcp73","albumname":"最美和声第二季 第6期",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/7/3/001sXYo53Fcp73.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/7/3/001sXYo53Fcp73.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/5601282.mp3","m4a":"http://ws.stream.qqmusic.qq
         * .com/5601282.m4a?fromtag=46","singerid":187642,"singername":"祁夏竹","songid":5601282,
         * "songmid":"002xsDc62qW26E"},{"albumid":751567,"albummid":"003aglPZ0ukdca",
         * "albumname":"中国梦之声第二季 第5期","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/c/a/003aglPZ0ukdca.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/c/a/003aglPZ0ukdca.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/8173246.mp3","m4a":"http://ws.stream.qqmusic.qq.com/8173246.m4a?fromtag=46",
         * "media_mid":"004KHI0B3uaU70","singerid":346336,"singername":"李邹珺","songid":8173246}]
         * currentPage : 1
         * maxResult : 30
         * ret_code : 0
         */

        private PagebeanEntity pagebean;

        public void setPagebean(PagebeanEntity pagebean) {
            this.pagebean = pagebean;
        }

        public PagebeanEntity getPagebean() {
            return pagebean;
        }

        public static class PagebeanEntity {
            private int allNum;
            private int allPages;
            private int currentPage;
            private int maxResult;
            private int ret_code;
            /**
             * albumid : 63074
             * albummid : 003kZ85M1cfaEF
             * albumname : 华纳超极品音色系列
             * albumpic_big : http://i.gtimg.cn/music/photo/mid_album_300/E/F/003kZ85M1cfaEF.jpg
             * albumpic_small : http://i.gtimg.cn/music/photo/mid_album_90/E/F/003kZ85M1cfaEF.jpg
             * downUrl : http://tsmusic24.tc.qq.com/4829067.mp3
             * m4a : http://ws.stream.qqmusic.qq.com/4829067.m4a?fromtag=46
             * media_mid : 000buMWp48yjTi
             * singerid : 2
             * singername : BEYOND
             * songid : 4829067
             * songname : 海阔天空
             */

            private List<ContentlistEntity> contentlist;

            public void setAllNum(int allNum) {
                this.allNum = allNum;
            }

            public void setAllPages(int allPages) {
                this.allPages = allPages;
            }

            public void setCurrentPage(int currentPage) {
                this.currentPage = currentPage;
            }

            public void setMaxResult(int maxResult) {
                this.maxResult = maxResult;
            }

            public void setRet_code(int ret_code) {
                this.ret_code = ret_code;
            }

            public void setContentlist(List<ContentlistEntity> contentlist) {
                this.contentlist = contentlist;
            }

            public int getAllNum() {
                return allNum;
            }

            public int getAllPages() {
                return allPages;
            }

            public int getCurrentPage() {
                return currentPage;
            }

            public int getMaxResult() {
                return maxResult;
            }

            public int getRet_code() {
                return ret_code;
            }

            public List<ContentlistEntity> getContentlist() {
                return contentlist;
            }

            public static class ContentlistEntity {
                private int albumid;
                private String albummid;
                private String albumname;
                private String albumpic_big;
                private String albumpic_small;
                private String downUrl;
                private String m4a;
                private String media_mid;
                private int singerid;
                private String singername;
                private int songid;
                private String songname;

                public void setAlbumid(int albumid) {
                    this.albumid = albumid;
                }

                public void setAlbummid(String albummid) {
                    this.albummid = albummid;
                }

                public void setAlbumname(String albumname) {
                    this.albumname = albumname;
                }

                public void setAlbumpic_big(String albumpic_big) {
                    this.albumpic_big = albumpic_big;
                }

                public void setAlbumpic_small(String albumpic_small) {
                    this.albumpic_small = albumpic_small;
                }

                public void setDownUrl(String downUrl) {
                    this.downUrl = downUrl;
                }

                public void setM4a(String m4a) {
                    this.m4a = m4a;
                }

                public void setMedia_mid(String media_mid) {
                    this.media_mid = media_mid;
                }

                public void setSingerid(int singerid) {
                    this.singerid = singerid;
                }

                public void setSingername(String singername) {
                    this.singername = singername;
                }

                public void setSongid(int songid) {
                    this.songid = songid;
                }

                public void setSongname(String songname) {
                    this.songname = songname;
                }

                public int getAlbumid() {
                    return albumid;
                }

                public String getAlbummid() {
                    return albummid;
                }

                public String getAlbumname() {
                    return albumname;
                }

                public String getAlbumpic_big() {
                    return albumpic_big;
                }

                public String getAlbumpic_small() {
                    return albumpic_small;
                }

                public String getDownUrl() {
                    return downUrl;
                }

                public String getM4a() {
                    return m4a;
                }

                public String getMedia_mid() {
                    return media_mid;
                }

                public int getSingerid() {
                    return singerid;
                }

                public String getSingername() {
                    return singername;
                }

                public int getSongid() {
                    return songid;
                }

                public String getSongname() {
                    return songname;
                }
            }
        }
    }
}
