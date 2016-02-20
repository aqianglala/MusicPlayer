package com.example.admin.musicplayer.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by admin on 2016/2/19.
 */
public class HotBean {

    /**
     * showapi_res_code : 0
     * showapi_res_error :
     * showapi_res_body : {"pagebean":{"cur_song_num":100,"currentPage":1,"song_begin":0,
     * "songlist":[{"albumid":1276189,"albummid":"001fi1zG0EjU2u","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/2/u/001fi1zG0EjU2u.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/2/u/001fi1zG0EjU2u.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105526949.mp3","seconds":284,"singerid":60505,"singername":"李荣浩","songid":105526949,
     * "songname":"爸爸妈妈","url":"http://ws.stream.qqmusic.qq.com/105526949.m4a?fromtag=46"},
     * {"albumid":1282103,"albummid":"0035uvnA1xeJhR","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/h/R/0035uvnA1xeJhR.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/h/R/0035uvnA1xeJhR.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105575471.mp3","seconds":294,"singerid":7221,"singername":"许嵩","songid":105575471,
     * "songname":"燕归巢","url":"http://ws.stream.qqmusic.qq.com/105575471.m4a?fromtag=46"},
     * {"albumid":1280498,"albummid":"001PqCSC0xOlli","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/l/i/001PqCSC0xOlli.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/l/i/001PqCSC0xOlli.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105561979.mp3","seconds":297,"singerid":4422,"singername":"牛奶咖啡","songid":105561979,
     * "songname":"从你的全世界路过","url":"http://ws.stream.qqmusic.qq.com/105561979.m4a?fromtag=46"},
     * {"albumid":1281336,"albummid":"004EvugT3C2fi7","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/i/7/004EvugT3C2fi7.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/i/7/004EvugT3C2fi7.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105569010.mp3","seconds":255,"singerid":1012038,"singername":"张磊","songid":105569010,
     * "songname":"别来无恙 (新春特别版)","url":"http://ws.stream.qqmusic.qq.com/105569010
     * .m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq.com/105526948.mp3","seconds":228,
     * "songid":105526948,"songname":"有理想","url":"http://ws.stream.qqmusic.qq.com/105526948
     * .m4a?fromtag=46"},{"albumid":1259900,"albummid":"003vkgQH3I7RLY","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/L/Y/003vkgQH3I7RLY.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/L/Y/003vkgQH3I7RLY.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105404257.mp3","seconds":210,"singerid":204664,"singername":"鹿晗",
     * "songid":105404257,"songname":"原动力 (星战版) (《星球大战》电影推广曲)","url":"http://ws.stream.qqmusic.qq
     * .com/105404257.m4a?fromtag=46"},{"albumid":1280942,"albummid":"003Lkw7D08wDlB",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/l/B/003Lkw7D08wDlB.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/l/B/003Lkw7D08wDlB.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/105566107.mp3","seconds":230,"singerid":945054,
     * "singername":"苏运莹","songid":105566107,"songname":"精灵","url":"http://ws.stream.qqmusic.qq
     * .com/105566107.m4a?fromtag=46"},{"albumid":1246631,"albummid":"000lXXmD0eNyaz",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/a/z/000lXXmD0eNyaz.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/a/z/000lXXmD0eNyaz.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/105327326.mp3","seconds":229,"singerid":180646,
     * "singername":"吴亦凡","songid":105327326,"songname":"花房姑娘 (《老炮儿》电影推广曲)","url":"http://ws
     * .stream.qqmusic.qq.com/105327326.m4a?fromtag=46"},{"albumid":1267526,
     * "albummid":"001uMCZE0lJIWr","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/W/r/001uMCZE0lJIWr.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/W/r/001uMCZE0lJIWr.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105461543.mp3","seconds":260,"singerid":34412,"singername":"TFBOYS",
     * "songid":105461543,"songname":"不完美小孩","url":"http://ws.stream.qqmusic.qq.com/105461543
     * .m4a?fromtag=46"},{"albumid":1212106,"albummid":"002ojt9Q3QmHJZ","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/J/Z/002ojt9Q3QmHJZ.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/J/Z/002ojt9Q3QmHJZ.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105042137.mp3","seconds":244,"singerid":11707,"singername":"李易峰",
     * "songid":105042137,"songname":"请跟我联络 (《怦然星动》电影主题曲)","url":"http://ws.stream.qqmusic.qq
     * .com/105042137.m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq.com/105526952.mp3",
     * "seconds":299,"songid":105526952,"songname":"心里面","url":"http://ws.stream.qqmusic.qq
     * .com/105526952.m4a?fromtag=46"},{"albumid":1258253,"albummid":"003D0jU40YataC",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/a/C/003D0jU40YataC.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/a/C/003D0jU40YataC.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/105391500.mp3","seconds":282,"singerid":37459,
     * "singername":"崔子格","songid":105391500,"songname":"可念不可说 (《太子妃升职记》网络剧主题曲)","url":"http://ws
     * .stream.qqmusic.qq.com/105391500.m4a?fromtag=46"},{"albumid":1209397,
     * "albummid":"002VkuTq4LwDjg","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/j/g/002VkuTq4LwDjg.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/j/g/002VkuTq4LwDjg.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105013419.mp3","seconds":283,"songid":105013419,"songname":"我们只差一点点","url":"http://ws
     * .stream.qqmusic.qq.com/105013419.m4a?fromtag=46"},{"albumid":1212090,
     * "albummid":"003hMTTn2QMbFC","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/F/C/003hMTTn2QMbFC.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/F/C/003hMTTn2QMbFC.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105034420.mp3","singerid":33026,"singername":"严艺丹","songid":105034420,"songname":"醉城伤
     * (《长在面包树上的女人》电视剧主题曲)","url":"http://ws.stream.qqmusic.qq.com/105034420.m4a?fromtag=46"},
     * {"albumid":1276802,"albummid":"001DeNfN1wikad","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/a/d/001DeNfN1wikad.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/a/d/001DeNfN1wikad.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105532343.mp3","seconds":221,"singerid":3954,"singername":"汪苏泷","songid":105532343,
     * "songname":"灵主不悔 (《画江湖之灵主》手游暨动漫主题曲)","url":"http://ws.stream.qqmusic.qq.com/105532343
     * .m4a?fromtag=46"},{"albumid":1230948,"albummid":"000oxFgZ0cV589","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/8/9/000oxFgZ0cV589.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/8/9/000oxFgZ0cV589.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105164089.mp3","seconds":242,"singerid":4289,"singername":"赵英俊",
     * "songid":105164089,"songname":"大王叫我来巡山 (《万万没想到》电影插曲)","url":"http://ws.stream.qqmusic.qq
     * .com/105164089.m4a?fromtag=46"},{"albumid":1213329,"albummid":"002JsU5q10jUBt",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/B/t/002JsU5q10jUBt.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/B/t/002JsU5q10jUBt.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/105044366.mp3","seconds":219,"singerid":4607,
     * "singername":"张靓颖","songid":105044366,"songname":"我的梦 (华为手机主题曲)","url":"http://ws.stream
     * .qqmusic.qq.com/105044366.m4a?fromtag=46"},{"albumid":1273534,"albummid":"004e2dXU0nW0oI",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/o/I/004e2dXU0nW0oI.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/o/I/004e2dXU0nW0oI.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/105505647.mp3","seconds":292,"singerid":36691,
     * "singername":"袁娅维","songid":105505647,"songname":"长腿叔叔 (《老师晚上好》电视剧主题曲)","url":"http://ws
     * .stream.qqmusic.qq.com/105505647.m4a?fromtag=46"},{"albumid":1240412,
     * "albummid":"003fng4t4EEZEA","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/E/A/003fng4t4EEZEA.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/E/A/003fng4t4EEZEA.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105247934.mp3","seconds":184,"singerid":202409,"singername":"宋茜","songid":105247934,
     * "songname":"星星泪 (《美丽的秘密》电视剧主题曲)","url":"http://ws.stream.qqmusic.qq.com/105247934
     * .m4a?fromtag=46"},{"albumid":1125092,"albummid":"0033WvCp0z2wOQ","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/O/Q/0033WvCp0z2wOQ.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/O/Q/0033WvCp0z2wOQ.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105503807.mp3","seconds":207,"singerid":61386,"singername":"洛天依",
     * "songid":105503807,"songname":"普通Disco","url":"http://ws.stream.qqmusic.qq.com/105503807
     * .m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq.com/105421140.mp3","seconds":295,
     * "songid":105421140,"songname":"野生动物","url":"http://ws.stream.qqmusic.qq.com/105421140
     * .m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq.com/105505892.mp3","seconds":332,
     * "songid":105505892,"songname":"满座","url":"http://ws.stream.qqmusic.qq.com/105505892
     * .m4a?fromtag=46"},{"albumid":1276347,"albummid":"001Hk9X54Fn8WH","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/W/H/001Hk9X54Fn8WH.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/W/H/001Hk9X54Fn8WH.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105526932.mp3","singerid":22926,"singername":"陈翔","songid":105526932,
     * "songname":"到不了 (《寻找爱的冒险》电视剧插曲)","url":"http://ws.stream.qqmusic.qq.com/105526932
     * .m4a?fromtag=46"},{"albumid":1258562,"albummid":"002kZO8S1harBG","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/B/G/002kZO8S1harBG.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/B/G/002kZO8S1harBG.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105393553.mp3","seconds":248,"songid":105393553,"songname":"2-0+1",
     * "url":"http://ws.stream.qqmusic.qq.com/105393553.m4a?fromtag=46"},{"albumid":1258759,
     * "albummid":"004CWTXm3WqUAh","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/A/h/004CWTXm3WqUAh.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/A/h/004CWTXm3WqUAh.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105394961.mp3","seconds":198,"singerid":11453,"singername":"魏晨","songid":105394961,
     * "songname":"白日梦想家","url":"http://ws.stream.qqmusic.qq.com/105394961.m4a?fromtag=46"},
     * {"albumid":1239607,"albummid":"0047TQXN0Ahyp5","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/p/5/0047TQXN0Ahyp5.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/p/5/0047TQXN0Ahyp5.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105242379.mp3","seconds":220,"singerid":22874,"singername":"孙子涵","songid":105242379,
     * "songname":"总是那么傻","url":"http://ws.stream.qqmusic.qq.com/105242379.m4a?fromtag=46"},
     * {"albumid":1236468,"albummid":"002UKpxn0b2slr","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/l/r/002UKpxn0b2slr.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/l/r/002UKpxn0b2slr.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105214838.mp3","seconds":264,"singerid":187238,"singername":"7妹","songid":105214838,
     * "songname":"7妹独家混音","url":"http://ws.stream.qqmusic.qq.com/105214838.m4a?fromtag=46"},
     * {"albumid":1273231,"albummid":"001aczn92BdIiV","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/i/V/001aczn92BdIiV.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/i/V/001aczn92BdIiV.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105503773.mp3","seconds":86,"singerid":12530,"singername":"邓超","songid":105503773,
     * "songname":"无敌 (《美人鱼》电影宣传曲)","url":"http://ws.stream.qqmusic.qq.com/105503773
     * .m4a?fromtag=46"},{"albumid":1276877,"albummid":"000H27sc4UoQv1","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/v/1/000H27sc4UoQv1.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/v/1/000H27sc4UoQv1.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105531959.mp3","singerid":23080,"singername":"李行亮","songid":105531959,
     * "songname":"特别想念你","url":"http://ws.stream.qqmusic.qq.com/105531959.m4a?fromtag=46"},
     * {"albumid":1280847,"albummid":"002FAnhv00YBOI","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/O/I/002FAnhv00YBOI.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/O/I/002FAnhv00YBOI.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105564622.mp3","seconds":188,"singerid":3758,"singername":"赖伟锋","songid":105564622,
     * "songname":"Money Money Home","url":"http://ws.stream.qqmusic.qq.com/105564622
     * .m4a?fromtag=46"},{"albumid":1267469,"albummid":"0011ttXx3gzbtp","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/t/p/0011ttXx3gzbtp.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/t/p/0011ttXx3gzbtp.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105460914.mp3","seconds":269,"singerid":15352,"singername":"张丹锋",
     * "songid":105460914,"songname":"新年快乐","url":"http://ws.stream.qqmusic.qq.com/105460914
     * .m4a?fromtag=46"},{"albumid":1281160,"albummid":"003Z7jYl0VxeYu","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/Y/u/003Z7jYl0VxeYu.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/Y/u/003Z7jYl0VxeYu.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105523019.mp3","seconds":281,"singerid":11446,"singername":"陈楚生",
     * "songid":105523019,"songname":"不如怀念 (《五鼠闹东京》电视剧插曲)","url":"http://ws.stream.qqmusic.qq
     * .com/105523019.m4a?fromtag=46"},{"albumid":1246086,"albummid":"0000SzYi2BioJN",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/J/N/0000SzYi2BioJN.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/J/N/0000SzYi2BioJN.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/105301701.mp3","seconds":315,"singerid":89698,
     * "singername":"庄心妍","songid":105301701,"songname":"哎","url":"http://ws.stream.qqmusic.qq
     * .com/105301701.m4a?fromtag=46"},{"albumid":1267462,"albummid":"000I4CFA03SRGW",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/G/W/000I4CFA03SRGW.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/G/W/000I4CFA03SRGW.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/105460886.mp3","seconds":296,"singerid":60433,
     * "singername":"好妹妹乐队","songid":105460886,"songname":"不说再见 (《谁的青春不迷茫》电影主题曲)",
     * "url":"http://ws.stream.qqmusic.qq.com/105460886.m4a?fromtag=46"},{"albumid":1277081,
     * "albummid":"001VELQ401D4Fj","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/F/j/001VELQ401D4Fj.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/F/j/001VELQ401D4Fj.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105533676.mp3","seconds":259,"singerid":4605,"singername":"弦子","songid":105533676,
     * "songname":"Say I Do","url":"http://ws.stream.qqmusic.qq.com/105533676.m4a?fromtag=46"},
     * {"albumid":1276964,"albummid":"001fDnDA16nWNl","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/N/l/001fDnDA16nWNl.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/N/l/001fDnDA16nWNl.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105532751.mp3","seconds":251,"singerid":1105316,"singername":"VP团",
     * "songid":105532751,"songname":"你妈逼你结婚了没","url":"http://ws.stream.qqmusic.qq.com/105532751
     * .m4a?fromtag=46"},{"albumid":1281017,"albummid":"004Vtm3n282BLg","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/L/g/004Vtm3n282BLg.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/L/g/004Vtm3n282BLg.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105566772.mp3","singerid":1107430,"singername":"Astro本地团艺人","songid":105566772,
     * "songname":"大盛年","url":"http://ws.stream.qqmusic.qq.com/105566772.m4a?fromtag=46"},
     * {"albumid":1215169,"albummid":"000WEI9F3lXJiE","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/i/E/000WEI9F3lXJiE.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/i/E/000WEI9F3lXJiE.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105054285.mp3","seconds":293,"singerid":199515,"singername":"张碧晨","songid":105054285,
     * "songname":"如果一切没有发生过 (《从天儿降》电影插曲)","url":"http://ws.stream.qqmusic.qq.com/105054285
     * .m4a?fromtag=46"},{"albumid":1280203,"albummid":"003RTw7F01stDn","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/D/n/003RTw7F01stDn.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/D/n/003RTw7F01stDn.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105559029.mp3","singerid":42235,"singername":"包贝尔","songid":105559029,
     * "songname":"快发红包 (《欢喜密探》电视剧宣传曲)","url":"http://ws.stream.qqmusic.qq.com/105559029
     * .m4a?fromtag=46"},{"albumid":1212622,"albummid":"003iFxRi1Sw9SB","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/S/B/003iFxRi1Sw9SB.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/S/B/003iFxRi1Sw9SB.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105039751.mp3","seconds":268,"singerid":202434,"singername":"虞鹏",
     * "songid":105039751,"songname":"爱过","url":"http://ws.stream.qqmusic.qq.com/105039751
     * .m4a?fromtag=46"},{"albumid":1262466,"albummid":"00469cps0EPolC","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/l/C/00469cps0EPolC.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/l/C/00469cps0EPolC.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105422371.mp3","seconds":206,"singerid":160022,"singername":"MC天佑",
     * "songid":105422371,"songname":"未来","url":"http://ws.stream.qqmusic.qq.com/105422371
     * .m4a?fromtag=46"},{"albumid":430785,"albummid":"001Kkrbo0730vP","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/v/P/001Kkrbo0730vP.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/v/P/001Kkrbo0730vP.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105280844.mp3","singerid":23384,"singername":"杜歌","songid":105280844,
     * "songname":"兄弟难当","url":"http://ws.stream.qqmusic.qq.com/105280844.m4a?fromtag=46"},
     * {"downUrl":"http://tsmusic24.tc.qq.com/105391798.mp3","seconds":233,"singerid":1097826,
     * "singername":"冯小刚","songid":105391798,"songname":"爱的代价 (《老炮儿》电影宣传曲)","url":"http://ws
     * .stream.qqmusic.qq.com/105391798.m4a?fromtag=46"},{"albumid":1273908,
     * "albummid":"000hhJM90xHyfW","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/f/W/000hhJM90xHyfW.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/f/W/000hhJM90xHyfW.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105508564.mp3","seconds":326,"songid":105508564,"songname":"Let you go",
     * "url":"http://ws.stream.qqmusic.qq.com/105508564.m4a?fromtag=46"},{"albumid":1281679,
     * "albummid":"004aVWjy0OiVX1","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/X/1/004aVWjy0OiVX1.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/X/1/004aVWjy0OiVX1.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105571958.mp3","seconds":218,"songid":105571958,"songname":"尘梦忆仙","url":"http://ws
     * .stream.qqmusic.qq.com/105571958.m4a?fromtag=46"},{"albumid":1230651,
     * "albummid":"003uoPjx3z03dB","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/d/B/003uoPjx3z03dB.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/d/B/003uoPjx3z03dB.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105161539.mp3","seconds":267,"songid":105161539,"songname":"一念天堂 (《一念天堂》电影主题曲)",
     * "url":"http://ws.stream.qqmusic.qq.com/105161539.m4a?fromtag=46"},
     * {"downUrl":"http://tsmusic24.tc.qq.com/105091296.mp3","seconds":256,"songid":105091296,
     * "songname":"人间","url":"http://ws.stream.qqmusic.qq.com/105091296.m4a?fromtag=46"},
     * {"albumid":1259881,"albummid":"000m58mZ3Nroc9","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/c/9/000m58mZ3Nroc9.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/c/9/000m58mZ3Nroc9.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105404155.mp3","seconds":271,"singerid":4615,"singername":"李宇春","songid":105404155,
     * "songname":"唐人街 (《唐人街探案》电影主题曲)","url":"http://ws.stream.qqmusic.qq.com/105404155
     * .m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq.com/105091293.mp3","seconds":317,
     * "songid":105091293,"songname":"纸飞机","url":"http://ws.stream.qqmusic.qq.com/105091293
     * .m4a?fromtag=46"},{"albumid":1273923,"albummid":"001F9lBd3UUYu8","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/u/8/001F9lBd3UUYu8.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/u/8/001F9lBd3UUYu8.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105508635.mp3","seconds":152,"singerid":25678,"singername":"刘庭羽",
     * "songid":105508635,"songname":"勿忘我 (《天天有喜之人间有爱》电视剧片尾曲)","url":"http://ws.stream.qqmusic.qq
     * .com/105508635.m4a?fromtag=46"},{"albumid":1266691,"albummid":"0033CsSV1696NL",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/N/L/0033CsSV1696NL.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/N/L/0033CsSV1696NL.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/105453670.mp3","seconds":240,"singerid":205401,
     * "singername":"UNIQ","songid":105453670,"url":"http://ws.stream.qqmusic.qq.com/105453670
     * .m4a?fromtag=46"},{"albumid":1276127,"albummid":"000hRSyz3UZuD7","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/D/7/000hRSyz3UZuD7.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/D/7/000hRSyz3UZuD7.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105525585.mp3","seconds":252,"singerid":169582,"singername":"蒋卓嘉",
     * "songid":105525585,"songname":"雨还下不停 (《蜀山战纪之剑侠传奇 第五季》电视剧片头曲 )","url":"http://ws.stream
     * .qqmusic.qq.com/105525585.m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq
     * .com/105565556.mp3","singerid":178612,"singername":"金玟岐","songid":105565556,
     * "songname":"直到遇见你 (《五鼠闹东京》电视剧插曲)","url":"http://ws.stream.qqmusic.qq.com/105565556
     * .m4a?fromtag=46"},{"albumid":1234495,"albummid":"0023KUFT3QWykm","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/k/m/0023KUFT3QWykm.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/k/m/0023KUFT3QWykm.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105197348.mp3","seconds":192,"singerid":943468,"singername":"萌萌哒天团",
     * "songid":105197348,"songname":"秦时明月","url":"http://ws.stream.qqmusic.qq.com/105197348
     * .m4a?fromtag=46"},{"albumid":1259908,"albummid":"004Q1Rll4PiNKt","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/K/t/004Q1Rll4PiNKt.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/K/t/004Q1Rll4PiNKt.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105404271.mp3","songid":105404271,"songname":"梦想天灯2016","url":"http://ws.stream
     * .qqmusic.qq.com/105404271.m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq
     * .com/105391501.mp3","seconds":278,"singerid":1092745,"singername":"盛一伦",
     * "songid":105391501,"songname":"以前的以后","url":"http://ws.stream.qqmusic.qq.com/105391501
     * .m4a?fromtag=46"},{"albumid":1281580,"albummid":"002HEuZU1qtK7r","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/7/r/002HEuZU1qtK7r.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/7/r/002HEuZU1qtK7r.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105571132.mp3","singerid":359684,"singername":"1931组合","songid":105571132,
     * "songname":"爱","url":"http://ws.stream.qqmusic.qq.com/105571132.m4a?fromtag=46"},
     * {"albumid":1236934,"albummid":"000CykBR1eXrr2","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/r/2/000CykBR1eXrr2.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/r/2/000CykBR1eXrr2.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105219415.mp3","singerid":33169,"singername":"DJ小可","songid":105219415,
     * "songname":"I'm Dj小可","url":"http://ws.stream.qqmusic.qq.com/105219415.m4a?fromtag=46"},
     * {"albumid":1224719,"albummid":"002aHhK7002Gnr","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/n/r/002aHhK7002Gnr.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/n/r/002aHhK7002Gnr.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105123692.mp3","seconds":213,"singerid":949463,"singername":"小可","songid":105123692,
     * "songname":"一人我饮酒醉","url":"http://ws.stream.qqmusic.qq.com/105123692.m4a?fromtag=46"},
     * {"albumid":1281118,"albummid":"004Lrxfk0o3M3z","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/3/z/004Lrxfk0o3M3z.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/3/z/004Lrxfk0o3M3z.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105567564.mp3","seconds":225,"singerid":44365,"singername":"寒若珉","songid":105567564,
     * "songname":"大吉小祥","url":"http://ws.stream.qqmusic.qq.com/105567564.m4a?fromtag=46"},
     * {"albumid":1261295,"albummid":"003g6MQ04KqUlD","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/l/D/003g6MQ04KqUlD.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/l/D/003g6MQ04KqUlD.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105413357.mp3","seconds":164,"songid":105413357,"songname":"社会摇","url":"http://ws
     * .stream.qqmusic.qq.com/105413357.m4a?fromtag=46"},{"albumid":1280927,
     * "albummid":"0031gjCW26Nhgj","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/g/j/0031gjCW26Nhgj.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/g/j/0031gjCW26Nhgj.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105565934.mp3","seconds":226,"singerid":32849,"singername":"夏天Alex",
     * "songid":105565934,"songname":"走一步算一步","url":"http://ws.stream.qqmusic.qq.com/105565934
     * .m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq.com/105489688.mp3","seconds":232,
     * "songid":105489688,"songname":"独自唱情歌","url":"http://ws.stream.qqmusic.qq.com/105489688
     * .m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq.com/105508636.mp3","seconds":138,
     * "singerid":5001,"singername":"阿宝","songid":105508636,"songname":"天天有喜 (《天天有喜之人间有爱》电视剧主题曲)
     * ","url":"http://ws.stream.qqmusic.qq.com/105508636.m4a?fromtag=46"},{"albumid":1277111,
     * "albummid":"002n4C8Z1sYaLY","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/L/Y/002n4C8Z1sYaLY.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/L/Y/002n4C8Z1sYaLY.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105563677.mp3","seconds":263,"singerid":24593,"singername":"祁隆","songid":105563677,
     * "songname":"找一个不伤心的理由","url":"http://ws.stream.qqmusic.qq.com/105563677.m4a?fromtag=46"},
     * {"albumid":1282073,"albummid":"004al49P4J5Fpp","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/p/p/004al49P4J5Fpp.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/p/p/004al49P4J5Fpp.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105575138.mp3","seconds":28,"singerid":24516,"singername":"窦鹏","songid":105575138,
     * "songname":"胡同（片头) (《老炮儿》电影配乐)","url":"http://ws.stream.qqmusic.qq.com/105575138
     * .m4a?fromtag=46"},{"albumid":1280725,"albummid":"0021aJ9H3IEQee","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/e/e/0021aJ9H3IEQee.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/e/e/0021aJ9H3IEQee.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105563670.mp3","seconds":303,"singerid":184239,"singername":"张羿凡",
     * "songid":105563670,"songname":"化妆舞会","url":"http://ws.stream.qqmusic.qq.com/105563670
     * .m4a?fromtag=46"},{"albumid":1276026,"albummid":"003C3r8549SKoO","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/o/O/003C3r8549SKoO.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/o/O/003C3r8549SKoO.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105524991.mp3","seconds":250,"singerid":945892,"singername":"夏雪",
     * "songid":105524991,"songname":"我想你的时候","url":"http://ws.stream.qqmusic.qq.com/105524991
     * .m4a?fromtag=46"},{"albumid":1208893,"albummid":"002PYfDI1C7cDT","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/D/T/002PYfDI1C7cDT.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/D/T/002PYfDI1C7cDT.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105008946.mp3","songid":105008946,"songname":"妈妈","url":"http://ws.stream.qqmusic
     * .qq.com/105008946.m4a?fromtag=46"},{"albumid":1246226,"albummid":"003lvLlN4V3agL",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/g/L/003lvLlN4V3agL.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/g/L/003lvLlN4V3agL.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/105302915.mp3","seconds":222,"singerid":11712,
     * "singername":"乔任梁","songid":105302915,"songname":"不存在的你","url":"http://ws.stream.qqmusic
     * .qq.com/105302915.m4a?fromtag=46"},{"albumid":1209529,"albummid":"002lzdnY0n8nR5",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/R/5/002lzdnY0n8nR5.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/R/5/002lzdnY0n8nR5.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/105014686.mp3","seconds":287,"singerid":4610,
     * "singername":"周笔畅","songid":105014686,"songname":"片羽时光 (《怦然星动》电影插曲)","url":"http://ws
     * .stream.qqmusic.qq.com/105014686.m4a?fromtag=46"},{"albumid":1267635,
     * "albummid":"000ivcI61caQ48","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/4/8/000ivcI61caQ48.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/4/8/000ivcI61caQ48.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105462126.mp3","seconds":215,"songid":105462126,"songname":"野蛮生长","url":"http://ws
     * .stream.qqmusic.qq.com/105462126.m4a?fromtag=46"},{"albumid":1247290,
     * "albummid":"001DCCoo2exIyO","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/y/O/001DCCoo2exIyO.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/y/O/001DCCoo2exIyO.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105309165.mp3","seconds":311,"singerid":92117,"singername":"SNH48",
     * "songid":105309165,"songname":"新年的钟声","url":"http://ws.stream.qqmusic.qq.com/105309165
     * .m4a?fromtag=46"},{"albumid":1274628,"albummid":"002mR4Rs3Dg6DK","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/D/K/002mR4Rs3Dg6DK.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/D/K/002mR4Rs3Dg6DK.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105513746.mp3","seconds":265,"singerid":4355,"singername":"金莎","songid":105513746,
     * "songname":"全世界我只贪一个他","url":"http://ws.stream.qqmusic.qq.com/105513746.m4a?fromtag=46"},
     * {"albumid":1258384,"albummid":"000X7wBs1T3fVd","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/V/d/000X7wBs1T3fVd.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/V/d/000X7wBs1T3fVd.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105393371.mp3","seconds":279,"songid":105393371,"songname":"一封家书 (《一切都好》电影宣传曲)",
     * "url":"http://ws.stream.qqmusic.qq.com/105393371.m4a?fromtag=46"},{"albumid":1282093,
     * "albummid":"000ZOFo42JnVaT","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/a/T/000ZOFo42JnVaT.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/a/T/000ZOFo42JnVaT.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105575410.mp3","seconds":111,"singerid":62490,"singername":"吴莫愁","songid":105575410,
     * "songname":"猴厉嗨","url":"http://ws.stream.qqmusic.qq.com/105575410.m4a?fromtag=46"},
     * {"albumid":1210970,"albummid":"003DtmIa4WDFmM","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/m/M/003DtmIa4WDFmM.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/m/M/003DtmIa4WDFmM.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105025984.mp3","seconds":216,"songid":105025984,"songname":"依赖","url":"http://ws
     * .stream.qqmusic.qq.com/105025984.m4a?fromtag=46"},{"albumid":1257907,
     * "albummid":"000Nj7Kw0dkkLS","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/L/S/000Nj7Kw0dkkLS.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/L/S/000Nj7Kw0dkkLS.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105389295.mp3","seconds":237,"singerid":4789,"singername":"丁丁","songid":105389295,
     * "songname":"你是我的李白","url":"http://ws.stream.qqmusic.qq.com/105389295.m4a?fromtag=46"},
     * {"albumid":1204351,"albummid":"001cbo1d327sYr","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/Y/r/001cbo1d327sYr.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/Y/r/001cbo1d327sYr.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/104975046.mp3","songid":104975046,"songname":"三千痴缠","url":"http://ws.stream.qqmusic
     * .qq.com/104975046.m4a?fromtag=46"},{"albumid":1209306,"albummid":"0032wsE33S0oXx",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/X/x/0032wsE33S0oXx.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/X/x/0032wsE33S0oXx.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/105012341.mp3","singerid":60885,"singername":"张玮",
     * "songid":105012341,"songname":"追爱 (《北上广不相信眼泪》电视剧插曲)","url":"http://ws.stream.qqmusic.qq
     * .com/105012341.m4a?fromtag=46"},{"albumid":1220170,"albummid":"000sLvNA3ao5gD",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/g/D/000sLvNA3ao5gD.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/g/D/000sLvNA3ao5gD.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/105303963.mp3","seconds":266,"singerid":4538,
     * "singername":"阿鲁阿卓","songid":105303963,"songname":"西风 (《芈月传》电视剧片尾曲)","url":"http://ws
     * .stream.qqmusic.qq.com/105303963.m4a?fromtag=46"},{"albumid":1274037,
     * "albummid":"0004bLsF3qYjnu","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/n/u/0004bLsF3qYjnu.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/n/u/0004bLsF3qYjnu.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105509351.mp3","singerid":167494,"singername":"和汇慧","songid":105509351,"songname":"爱
     * (《搭错车》电视剧插曲)","url":"http://ws.stream.qqmusic.qq.com/105509351.m4a?fromtag=46"},
     * {"downUrl":"http://tsmusic24.tc.qq.com/104917343.mp3","songid":104917343,"songname":"I'll
     * Be Back (《北上广不相信眼泪》电视剧片头曲)","url":"http://ws.stream.qqmusic.qq.com/104917343
     * .m4a?fromtag=46"},{"albumid":1276273,"albummid":"003gioeE0R5RXV","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/X/V/003gioeE0R5RXV.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/X/V/003gioeE0R5RXV.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105527711.mp3","singername":"孙楠","songid":105527711,"songname":"一起奔放
     * (《青蛙王国之冰冻大冒险》动画电影主题曲)","url":"http://ws.stream.qqmusic.qq.com/105527711.m4a?fromtag=46"},
     * {"albumid":1275319,"albummid":"000f72cL25vX0C","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/0/C/000f72cL25vX0C.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/0/C/000f72cL25vX0C.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105519313.mp3","singerid":12744,"singername":"小沈阳","songid":105519313,
     * "songname":"多难","url":"http://ws.stream.qqmusic.qq.com/105519313.m4a?fromtag=46"},
     * {"albumid":1220151,"albummid":"001DtWLr1I6Hwb","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/w/b/001DtWLr1I6Hwb.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/w/b/001DtWLr1I6Hwb.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105091516.mp3","singerid":4293,"singername":"陈坤","songid":105091516,"songname":"寻龙诀
     * (《寻龙诀》电影主题曲)","url":"http://ws.stream.qqmusic.qq.com/105091516.m4a?fromtag=46"},
     * {"albumid":1246649,"albummid":"001KgAXI2djoEC","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/E/C/001KgAXI2djoEC.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/E/C/001KgAXI2djoEC.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105305531.mp3","singerid":28227,"singername":"马旭东","songid":105305531,
     * "songname":"假装怀念","url":"http://ws.stream.qqmusic.qq.com/105305531.m4a?fromtag=46"},
     * {"albumid":1276049,"albummid":"003atDBO2GDAFB","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/F/B/003atDBO2GDAFB.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/F/B/003atDBO2GDAFB.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105525241.mp3","singerid":22855,"singername":"阿悄","songid":105525241,"songname":"气质少女
     * (《哎哟青春期》电影主题曲)","url":"http://ws.stream.qqmusic.qq.com/105525241.m4a?fromtag=46"},
     * {"albumid":1220169,"albummid":"0022Yd8X1Eo4CE","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/C/E/0022Yd8X1Eo4CE.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/C/E/0022Yd8X1Eo4CE.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105146700.mp3","singerid":6104,"singername":"陈思思","songid":105146700,"songname":"满月
     * (《芈月传》电视剧片头曲)","url":"http://ws.stream.qqmusic.qq.com/105146700.m4a?fromtag=46"},
     * {"albumid":1281224,"albummid":"002OJYfq1f7VnI","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/n/I/002OJYfq1f7VnI.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/n/I/002OJYfq1f7VnI.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/104115604.mp3","seconds":262,"singerid":1016429,"singername":"S.I.N.G 女团",
     * "songid":104115604,"songname":"听见夏至","url":"http://ws.stream.qqmusic.qq.com/104115604
     * .m4a?fromtag=46"},{"albumid":1281457,"albummid":"000Y5VAR4cfvEb","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/E/b/000Y5VAR4cfvEb.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/E/b/000Y5VAR4cfvEb.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105570326.mp3","seconds":224,"singerid":4423,"singername":"华语群星",
     * "songid":105570326,"songname":"新年到","url":"http://ws.stream.qqmusic.qq.com/105570326
     * .m4a?fromtag=46"},{"albumid":1275856,"albummid":"000oDjP40IJob5","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/b/5/000oDjP40IJob5.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/b/5/000oDjP40IJob5.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105523598.mp3","singerid":28634,"singername":"单色凌","songid":105523598,
     * "songname":"两座城市都下雨","url":"http://ws.stream.qqmusic.qq.com/105523598.m4a?fromtag=46"},
     * {"albumid":1212338,"albummid":"002Edpgx2yorFV","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/F/V/002Edpgx2yorFV.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/F/V/002Edpgx2yorFV.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105036859.mp3","seconds":246,"singerid":61981,"singername":"李代沫","songid":105036859,
     * "songname":"谢谢你","url":"http://ws.stream.qqmusic.qq.com/105036859.m4a?fromtag=46"},
     * {"downUrl":"http://tsmusic24.tc.qq.com/105039745.mp3","seconds":217,"songid":105039745,
     * "songname":"在每一个街角想起你","url":"http://ws.stream.qqmusic.qq.com/105039745.m4a?fromtag=46"},
     * {"albumid":1211503,"albummid":"002TlGtr1Vxhan","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/a/n/002TlGtr1Vxhan.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/a/n/002TlGtr1Vxhan.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105029289.mp3","singerid":23800,"singername":"夏婉安","songid":105029289,
     * "songname":"独角戏","url":"http://ws.stream.qqmusic.qq.com/105029289.m4a?fromtag=46"},
     * {"albumid":1207562,"albummid":"003016Ev4aiqg4","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/g/4/003016Ev4aiqg4.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/g/4/003016Ev4aiqg4.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105090482.mp3","singerid":22704,"singername":"徐良","songid":105090482,"songname":"华生",
     * "url":"http://ws.stream.qqmusic.qq.com/105090482.m4a?fromtag=46"},{"albumid":1258396,
     * "albummid":"002QO0eL1OwPdt","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/d/t/002QO0eL1OwPdt.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/d/t/002QO0eL1OwPdt.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105394974.mp3","seconds":318,"songid":105394974,"songname":"有情世间 (《恶棍天使》电影主题曲)",
     * "url":"http://ws.stream.qqmusic.qq.com/105394974.m4a?fromtag=46"},{"albumid":1208537,
     * "albummid":"0033qUNg3dyZal","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/a/l/0033qUNg3dyZal.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/a/l/0033qUNg3dyZal.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105006095.mp3","singerid":4604,"singername":"汪峰","songid":105006095,"songname":"亲爱的
     * 今夜你在哪里","url":"http://ws.stream.qqmusic.qq.com/105006095.m4a?fromtag=46"},
     * {"albumid":1277319,"albummid":"002SW2511Zk6tG","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/t/G/002SW2511Zk6tG.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/t/G/002SW2511Zk6tG.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105536892.mp3","seconds":208,"singerid":12721,"singername":"郝云","songid":105536892,
     * "songname":"姥姥说 (《年兽大作战》电影片头曲)","url":"http://ws.stream.qqmusic.qq.com/105536892
     * .m4a?fromtag=46"},{"albumid":1280283,"albummid":"0045UWxy300fbT","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/b/T/0045UWxy300fbT.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/b/T/0045UWxy300fbT.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105559514.mp3","seconds":258,"singerid":19722,"singername":"冷漠",
     * "songid":105559514,"songname":"冰水情歌","url":"http://ws.stream.qqmusic.qq.com/105559514
     * .m4a?fromtag=46"}]},"ret_code":0}
     */

    private int showapi_res_code;
    private String showapi_res_error;
    /**
     * pagebean : {"cur_song_num":100,"currentPage":1,"song_begin":0,
     * "songlist":[{"albumid":1276189,"albummid":"001fi1zG0EjU2u","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/2/u/001fi1zG0EjU2u.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/2/u/001fi1zG0EjU2u.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105526949.mp3","seconds":284,"singerid":60505,"singername":"李荣浩","songid":105526949,
     * "songname":"爸爸妈妈","url":"http://ws.stream.qqmusic.qq.com/105526949.m4a?fromtag=46"},
     * {"albumid":1282103,"albummid":"0035uvnA1xeJhR","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/h/R/0035uvnA1xeJhR.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/h/R/0035uvnA1xeJhR.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105575471.mp3","seconds":294,"singerid":7221,"singername":"许嵩","songid":105575471,
     * "songname":"燕归巢","url":"http://ws.stream.qqmusic.qq.com/105575471.m4a?fromtag=46"},
     * {"albumid":1280498,"albummid":"001PqCSC0xOlli","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/l/i/001PqCSC0xOlli.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/l/i/001PqCSC0xOlli.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105561979.mp3","seconds":297,"singerid":4422,"singername":"牛奶咖啡","songid":105561979,
     * "songname":"从你的全世界路过","url":"http://ws.stream.qqmusic.qq.com/105561979.m4a?fromtag=46"},
     * {"albumid":1281336,"albummid":"004EvugT3C2fi7","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/i/7/004EvugT3C2fi7.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/i/7/004EvugT3C2fi7.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105569010.mp3","seconds":255,"singerid":1012038,"singername":"张磊","songid":105569010,
     * "songname":"别来无恙 (新春特别版)","url":"http://ws.stream.qqmusic.qq.com/105569010
     * .m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq.com/105526948.mp3","seconds":228,
     * "songid":105526948,"songname":"有理想","url":"http://ws.stream.qqmusic.qq.com/105526948
     * .m4a?fromtag=46"},{"albumid":1259900,"albummid":"003vkgQH3I7RLY","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/L/Y/003vkgQH3I7RLY.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/L/Y/003vkgQH3I7RLY.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105404257.mp3","seconds":210,"singerid":204664,"singername":"鹿晗",
     * "songid":105404257,"songname":"原动力 (星战版) (《星球大战》电影推广曲)","url":"http://ws.stream.qqmusic.qq
     * .com/105404257.m4a?fromtag=46"},{"albumid":1280942,"albummid":"003Lkw7D08wDlB",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/l/B/003Lkw7D08wDlB.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/l/B/003Lkw7D08wDlB.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/105566107.mp3","seconds":230,"singerid":945054,
     * "singername":"苏运莹","songid":105566107,"songname":"精灵","url":"http://ws.stream.qqmusic.qq
     * .com/105566107.m4a?fromtag=46"},{"albumid":1246631,"albummid":"000lXXmD0eNyaz",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/a/z/000lXXmD0eNyaz.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/a/z/000lXXmD0eNyaz.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/105327326.mp3","seconds":229,"singerid":180646,
     * "singername":"吴亦凡","songid":105327326,"songname":"花房姑娘 (《老炮儿》电影推广曲)","url":"http://ws
     * .stream.qqmusic.qq.com/105327326.m4a?fromtag=46"},{"albumid":1267526,
     * "albummid":"001uMCZE0lJIWr","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/W/r/001uMCZE0lJIWr.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/W/r/001uMCZE0lJIWr.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105461543.mp3","seconds":260,"singerid":34412,"singername":"TFBOYS",
     * "songid":105461543,"songname":"不完美小孩","url":"http://ws.stream.qqmusic.qq.com/105461543
     * .m4a?fromtag=46"},{"albumid":1212106,"albummid":"002ojt9Q3QmHJZ","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/J/Z/002ojt9Q3QmHJZ.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/J/Z/002ojt9Q3QmHJZ.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105042137.mp3","seconds":244,"singerid":11707,"singername":"李易峰",
     * "songid":105042137,"songname":"请跟我联络 (《怦然星动》电影主题曲)","url":"http://ws.stream.qqmusic.qq
     * .com/105042137.m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq.com/105526952.mp3",
     * "seconds":299,"songid":105526952,"songname":"心里面","url":"http://ws.stream.qqmusic.qq
     * .com/105526952.m4a?fromtag=46"},{"albumid":1258253,"albummid":"003D0jU40YataC",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/a/C/003D0jU40YataC.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/a/C/003D0jU40YataC.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/105391500.mp3","seconds":282,"singerid":37459,
     * "singername":"崔子格","songid":105391500,"songname":"可念不可说 (《太子妃升职记》网络剧主题曲)","url":"http://ws
     * .stream.qqmusic.qq.com/105391500.m4a?fromtag=46"},{"albumid":1209397,
     * "albummid":"002VkuTq4LwDjg","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/j/g/002VkuTq4LwDjg.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/j/g/002VkuTq4LwDjg.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105013419.mp3","seconds":283,"songid":105013419,"songname":"我们只差一点点","url":"http://ws
     * .stream.qqmusic.qq.com/105013419.m4a?fromtag=46"},{"albumid":1212090,
     * "albummid":"003hMTTn2QMbFC","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/F/C/003hMTTn2QMbFC.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/F/C/003hMTTn2QMbFC.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105034420.mp3","singerid":33026,"singername":"严艺丹","songid":105034420,"songname":"醉城伤
     * (《长在面包树上的女人》电视剧主题曲)","url":"http://ws.stream.qqmusic.qq.com/105034420.m4a?fromtag=46"},
     * {"albumid":1276802,"albummid":"001DeNfN1wikad","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/a/d/001DeNfN1wikad.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/a/d/001DeNfN1wikad.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105532343.mp3","seconds":221,"singerid":3954,"singername":"汪苏泷","songid":105532343,
     * "songname":"灵主不悔 (《画江湖之灵主》手游暨动漫主题曲)","url":"http://ws.stream.qqmusic.qq.com/105532343
     * .m4a?fromtag=46"},{"albumid":1230948,"albummid":"000oxFgZ0cV589","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/8/9/000oxFgZ0cV589.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/8/9/000oxFgZ0cV589.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105164089.mp3","seconds":242,"singerid":4289,"singername":"赵英俊",
     * "songid":105164089,"songname":"大王叫我来巡山 (《万万没想到》电影插曲)","url":"http://ws.stream.qqmusic.qq
     * .com/105164089.m4a?fromtag=46"},{"albumid":1213329,"albummid":"002JsU5q10jUBt",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/B/t/002JsU5q10jUBt.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/B/t/002JsU5q10jUBt.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/105044366.mp3","seconds":219,"singerid":4607,
     * "singername":"张靓颖","songid":105044366,"songname":"我的梦 (华为手机主题曲)","url":"http://ws.stream
     * .qqmusic.qq.com/105044366.m4a?fromtag=46"},{"albumid":1273534,"albummid":"004e2dXU0nW0oI",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/o/I/004e2dXU0nW0oI.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/o/I/004e2dXU0nW0oI.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/105505647.mp3","seconds":292,"singerid":36691,
     * "singername":"袁娅维","songid":105505647,"songname":"长腿叔叔 (《老师晚上好》电视剧主题曲)","url":"http://ws
     * .stream.qqmusic.qq.com/105505647.m4a?fromtag=46"},{"albumid":1240412,
     * "albummid":"003fng4t4EEZEA","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/E/A/003fng4t4EEZEA.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/E/A/003fng4t4EEZEA.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105247934.mp3","seconds":184,"singerid":202409,"singername":"宋茜","songid":105247934,
     * "songname":"星星泪 (《美丽的秘密》电视剧主题曲)","url":"http://ws.stream.qqmusic.qq.com/105247934
     * .m4a?fromtag=46"},{"albumid":1125092,"albummid":"0033WvCp0z2wOQ","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/O/Q/0033WvCp0z2wOQ.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/O/Q/0033WvCp0z2wOQ.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105503807.mp3","seconds":207,"singerid":61386,"singername":"洛天依",
     * "songid":105503807,"songname":"普通Disco","url":"http://ws.stream.qqmusic.qq.com/105503807
     * .m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq.com/105421140.mp3","seconds":295,
     * "songid":105421140,"songname":"野生动物","url":"http://ws.stream.qqmusic.qq.com/105421140
     * .m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq.com/105505892.mp3","seconds":332,
     * "songid":105505892,"songname":"满座","url":"http://ws.stream.qqmusic.qq.com/105505892
     * .m4a?fromtag=46"},{"albumid":1276347,"albummid":"001Hk9X54Fn8WH","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/W/H/001Hk9X54Fn8WH.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/W/H/001Hk9X54Fn8WH.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105526932.mp3","singerid":22926,"singername":"陈翔","songid":105526932,
     * "songname":"到不了 (《寻找爱的冒险》电视剧插曲)","url":"http://ws.stream.qqmusic.qq.com/105526932
     * .m4a?fromtag=46"},{"albumid":1258562,"albummid":"002kZO8S1harBG","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/B/G/002kZO8S1harBG.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/B/G/002kZO8S1harBG.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105393553.mp3","seconds":248,"songid":105393553,"songname":"2-0+1",
     * "url":"http://ws.stream.qqmusic.qq.com/105393553.m4a?fromtag=46"},{"albumid":1258759,
     * "albummid":"004CWTXm3WqUAh","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/A/h/004CWTXm3WqUAh.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/A/h/004CWTXm3WqUAh.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105394961.mp3","seconds":198,"singerid":11453,"singername":"魏晨","songid":105394961,
     * "songname":"白日梦想家","url":"http://ws.stream.qqmusic.qq.com/105394961.m4a?fromtag=46"},
     * {"albumid":1239607,"albummid":"0047TQXN0Ahyp5","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/p/5/0047TQXN0Ahyp5.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/p/5/0047TQXN0Ahyp5.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105242379.mp3","seconds":220,"singerid":22874,"singername":"孙子涵","songid":105242379,
     * "songname":"总是那么傻","url":"http://ws.stream.qqmusic.qq.com/105242379.m4a?fromtag=46"},
     * {"albumid":1236468,"albummid":"002UKpxn0b2slr","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/l/r/002UKpxn0b2slr.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/l/r/002UKpxn0b2slr.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105214838.mp3","seconds":264,"singerid":187238,"singername":"7妹","songid":105214838,
     * "songname":"7妹独家混音","url":"http://ws.stream.qqmusic.qq.com/105214838.m4a?fromtag=46"},
     * {"albumid":1273231,"albummid":"001aczn92BdIiV","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/i/V/001aczn92BdIiV.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/i/V/001aczn92BdIiV.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105503773.mp3","seconds":86,"singerid":12530,"singername":"邓超","songid":105503773,
     * "songname":"无敌 (《美人鱼》电影宣传曲)","url":"http://ws.stream.qqmusic.qq.com/105503773
     * .m4a?fromtag=46"},{"albumid":1276877,"albummid":"000H27sc4UoQv1","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/v/1/000H27sc4UoQv1.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/v/1/000H27sc4UoQv1.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105531959.mp3","singerid":23080,"singername":"李行亮","songid":105531959,
     * "songname":"特别想念你","url":"http://ws.stream.qqmusic.qq.com/105531959.m4a?fromtag=46"},
     * {"albumid":1280847,"albummid":"002FAnhv00YBOI","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/O/I/002FAnhv00YBOI.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/O/I/002FAnhv00YBOI.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105564622.mp3","seconds":188,"singerid":3758,"singername":"赖伟锋","songid":105564622,
     * "songname":"Money Money Home","url":"http://ws.stream.qqmusic.qq.com/105564622
     * .m4a?fromtag=46"},{"albumid":1267469,"albummid":"0011ttXx3gzbtp","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/t/p/0011ttXx3gzbtp.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/t/p/0011ttXx3gzbtp.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105460914.mp3","seconds":269,"singerid":15352,"singername":"张丹锋",
     * "songid":105460914,"songname":"新年快乐","url":"http://ws.stream.qqmusic.qq.com/105460914
     * .m4a?fromtag=46"},{"albumid":1281160,"albummid":"003Z7jYl0VxeYu","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/Y/u/003Z7jYl0VxeYu.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/Y/u/003Z7jYl0VxeYu.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105523019.mp3","seconds":281,"singerid":11446,"singername":"陈楚生",
     * "songid":105523019,"songname":"不如怀念 (《五鼠闹东京》电视剧插曲)","url":"http://ws.stream.qqmusic.qq
     * .com/105523019.m4a?fromtag=46"},{"albumid":1246086,"albummid":"0000SzYi2BioJN",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/J/N/0000SzYi2BioJN.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/J/N/0000SzYi2BioJN.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/105301701.mp3","seconds":315,"singerid":89698,
     * "singername":"庄心妍","songid":105301701,"songname":"哎","url":"http://ws.stream.qqmusic.qq
     * .com/105301701.m4a?fromtag=46"},{"albumid":1267462,"albummid":"000I4CFA03SRGW",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/G/W/000I4CFA03SRGW.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/G/W/000I4CFA03SRGW.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/105460886.mp3","seconds":296,"singerid":60433,
     * "singername":"好妹妹乐队","songid":105460886,"songname":"不说再见 (《谁的青春不迷茫》电影主题曲)",
     * "url":"http://ws.stream.qqmusic.qq.com/105460886.m4a?fromtag=46"},{"albumid":1277081,
     * "albummid":"001VELQ401D4Fj","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/F/j/001VELQ401D4Fj.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/F/j/001VELQ401D4Fj.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105533676.mp3","seconds":259,"singerid":4605,"singername":"弦子","songid":105533676,
     * "songname":"Say I Do","url":"http://ws.stream.qqmusic.qq.com/105533676.m4a?fromtag=46"},
     * {"albumid":1276964,"albummid":"001fDnDA16nWNl","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/N/l/001fDnDA16nWNl.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/N/l/001fDnDA16nWNl.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105532751.mp3","seconds":251,"singerid":1105316,"singername":"VP团",
     * "songid":105532751,"songname":"你妈逼你结婚了没","url":"http://ws.stream.qqmusic.qq.com/105532751
     * .m4a?fromtag=46"},{"albumid":1281017,"albummid":"004Vtm3n282BLg","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/L/g/004Vtm3n282BLg.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/L/g/004Vtm3n282BLg.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105566772.mp3","singerid":1107430,"singername":"Astro本地团艺人","songid":105566772,
     * "songname":"大盛年","url":"http://ws.stream.qqmusic.qq.com/105566772.m4a?fromtag=46"},
     * {"albumid":1215169,"albummid":"000WEI9F3lXJiE","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/i/E/000WEI9F3lXJiE.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/i/E/000WEI9F3lXJiE.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105054285.mp3","seconds":293,"singerid":199515,"singername":"张碧晨","songid":105054285,
     * "songname":"如果一切没有发生过 (《从天儿降》电影插曲)","url":"http://ws.stream.qqmusic.qq.com/105054285
     * .m4a?fromtag=46"},{"albumid":1280203,"albummid":"003RTw7F01stDn","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/D/n/003RTw7F01stDn.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/D/n/003RTw7F01stDn.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105559029.mp3","singerid":42235,"singername":"包贝尔","songid":105559029,
     * "songname":"快发红包 (《欢喜密探》电视剧宣传曲)","url":"http://ws.stream.qqmusic.qq.com/105559029
     * .m4a?fromtag=46"},{"albumid":1212622,"albummid":"003iFxRi1Sw9SB","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/S/B/003iFxRi1Sw9SB.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/S/B/003iFxRi1Sw9SB.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105039751.mp3","seconds":268,"singerid":202434,"singername":"虞鹏",
     * "songid":105039751,"songname":"爱过","url":"http://ws.stream.qqmusic.qq.com/105039751
     * .m4a?fromtag=46"},{"albumid":1262466,"albummid":"00469cps0EPolC","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/l/C/00469cps0EPolC.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/l/C/00469cps0EPolC.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105422371.mp3","seconds":206,"singerid":160022,"singername":"MC天佑",
     * "songid":105422371,"songname":"未来","url":"http://ws.stream.qqmusic.qq.com/105422371
     * .m4a?fromtag=46"},{"albumid":430785,"albummid":"001Kkrbo0730vP","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/v/P/001Kkrbo0730vP.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/v/P/001Kkrbo0730vP.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105280844.mp3","singerid":23384,"singername":"杜歌","songid":105280844,
     * "songname":"兄弟难当","url":"http://ws.stream.qqmusic.qq.com/105280844.m4a?fromtag=46"},
     * {"downUrl":"http://tsmusic24.tc.qq.com/105391798.mp3","seconds":233,"singerid":1097826,
     * "singername":"冯小刚","songid":105391798,"songname":"爱的代价 (《老炮儿》电影宣传曲)","url":"http://ws
     * .stream.qqmusic.qq.com/105391798.m4a?fromtag=46"},{"albumid":1273908,
     * "albummid":"000hhJM90xHyfW","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/f/W/000hhJM90xHyfW.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/f/W/000hhJM90xHyfW.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105508564.mp3","seconds":326,"songid":105508564,"songname":"Let you go",
     * "url":"http://ws.stream.qqmusic.qq.com/105508564.m4a?fromtag=46"},{"albumid":1281679,
     * "albummid":"004aVWjy0OiVX1","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/X/1/004aVWjy0OiVX1.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/X/1/004aVWjy0OiVX1.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105571958.mp3","seconds":218,"songid":105571958,"songname":"尘梦忆仙","url":"http://ws
     * .stream.qqmusic.qq.com/105571958.m4a?fromtag=46"},{"albumid":1230651,
     * "albummid":"003uoPjx3z03dB","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/d/B/003uoPjx3z03dB.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/d/B/003uoPjx3z03dB.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105161539.mp3","seconds":267,"songid":105161539,"songname":"一念天堂 (《一念天堂》电影主题曲)",
     * "url":"http://ws.stream.qqmusic.qq.com/105161539.m4a?fromtag=46"},
     * {"downUrl":"http://tsmusic24.tc.qq.com/105091296.mp3","seconds":256,"songid":105091296,
     * "songname":"人间","url":"http://ws.stream.qqmusic.qq.com/105091296.m4a?fromtag=46"},
     * {"albumid":1259881,"albummid":"000m58mZ3Nroc9","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/c/9/000m58mZ3Nroc9.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/c/9/000m58mZ3Nroc9.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105404155.mp3","seconds":271,"singerid":4615,"singername":"李宇春","songid":105404155,
     * "songname":"唐人街 (《唐人街探案》电影主题曲)","url":"http://ws.stream.qqmusic.qq.com/105404155
     * .m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq.com/105091293.mp3","seconds":317,
     * "songid":105091293,"songname":"纸飞机","url":"http://ws.stream.qqmusic.qq.com/105091293
     * .m4a?fromtag=46"},{"albumid":1273923,"albummid":"001F9lBd3UUYu8","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/u/8/001F9lBd3UUYu8.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/u/8/001F9lBd3UUYu8.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105508635.mp3","seconds":152,"singerid":25678,"singername":"刘庭羽",
     * "songid":105508635,"songname":"勿忘我 (《天天有喜之人间有爱》电视剧片尾曲)","url":"http://ws.stream.qqmusic.qq
     * .com/105508635.m4a?fromtag=46"},{"albumid":1266691,"albummid":"0033CsSV1696NL",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/N/L/0033CsSV1696NL.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/N/L/0033CsSV1696NL.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/105453670.mp3","seconds":240,"singerid":205401,
     * "singername":"UNIQ","songid":105453670,"url":"http://ws.stream.qqmusic.qq.com/105453670
     * .m4a?fromtag=46"},{"albumid":1276127,"albummid":"000hRSyz3UZuD7","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/D/7/000hRSyz3UZuD7.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/D/7/000hRSyz3UZuD7.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105525585.mp3","seconds":252,"singerid":169582,"singername":"蒋卓嘉",
     * "songid":105525585,"songname":"雨还下不停 (《蜀山战纪之剑侠传奇 第五季》电视剧片头曲 )","url":"http://ws.stream
     * .qqmusic.qq.com/105525585.m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq
     * .com/105565556.mp3","singerid":178612,"singername":"金玟岐","songid":105565556,
     * "songname":"直到遇见你 (《五鼠闹东京》电视剧插曲)","url":"http://ws.stream.qqmusic.qq.com/105565556
     * .m4a?fromtag=46"},{"albumid":1234495,"albummid":"0023KUFT3QWykm","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/k/m/0023KUFT3QWykm.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/k/m/0023KUFT3QWykm.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105197348.mp3","seconds":192,"singerid":943468,"singername":"萌萌哒天团",
     * "songid":105197348,"songname":"秦时明月","url":"http://ws.stream.qqmusic.qq.com/105197348
     * .m4a?fromtag=46"},{"albumid":1259908,"albummid":"004Q1Rll4PiNKt","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/K/t/004Q1Rll4PiNKt.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/K/t/004Q1Rll4PiNKt.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105404271.mp3","songid":105404271,"songname":"梦想天灯2016","url":"http://ws.stream
     * .qqmusic.qq.com/105404271.m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq
     * .com/105391501.mp3","seconds":278,"singerid":1092745,"singername":"盛一伦",
     * "songid":105391501,"songname":"以前的以后","url":"http://ws.stream.qqmusic.qq.com/105391501
     * .m4a?fromtag=46"},{"albumid":1281580,"albummid":"002HEuZU1qtK7r","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/7/r/002HEuZU1qtK7r.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/7/r/002HEuZU1qtK7r.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105571132.mp3","singerid":359684,"singername":"1931组合","songid":105571132,
     * "songname":"爱","url":"http://ws.stream.qqmusic.qq.com/105571132.m4a?fromtag=46"},
     * {"albumid":1236934,"albummid":"000CykBR1eXrr2","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/r/2/000CykBR1eXrr2.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/r/2/000CykBR1eXrr2.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105219415.mp3","singerid":33169,"singername":"DJ小可","songid":105219415,
     * "songname":"I'm Dj小可","url":"http://ws.stream.qqmusic.qq.com/105219415.m4a?fromtag=46"},
     * {"albumid":1224719,"albummid":"002aHhK7002Gnr","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/n/r/002aHhK7002Gnr.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/n/r/002aHhK7002Gnr.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105123692.mp3","seconds":213,"singerid":949463,"singername":"小可","songid":105123692,
     * "songname":"一人我饮酒醉","url":"http://ws.stream.qqmusic.qq.com/105123692.m4a?fromtag=46"},
     * {"albumid":1281118,"albummid":"004Lrxfk0o3M3z","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/3/z/004Lrxfk0o3M3z.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/3/z/004Lrxfk0o3M3z.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105567564.mp3","seconds":225,"singerid":44365,"singername":"寒若珉","songid":105567564,
     * "songname":"大吉小祥","url":"http://ws.stream.qqmusic.qq.com/105567564.m4a?fromtag=46"},
     * {"albumid":1261295,"albummid":"003g6MQ04KqUlD","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/l/D/003g6MQ04KqUlD.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/l/D/003g6MQ04KqUlD.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105413357.mp3","seconds":164,"songid":105413357,"songname":"社会摇","url":"http://ws
     * .stream.qqmusic.qq.com/105413357.m4a?fromtag=46"},{"albumid":1280927,
     * "albummid":"0031gjCW26Nhgj","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/g/j/0031gjCW26Nhgj.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/g/j/0031gjCW26Nhgj.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105565934.mp3","seconds":226,"singerid":32849,"singername":"夏天Alex",
     * "songid":105565934,"songname":"走一步算一步","url":"http://ws.stream.qqmusic.qq.com/105565934
     * .m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq.com/105489688.mp3","seconds":232,
     * "songid":105489688,"songname":"独自唱情歌","url":"http://ws.stream.qqmusic.qq.com/105489688
     * .m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq.com/105508636.mp3","seconds":138,
     * "singerid":5001,"singername":"阿宝","songid":105508636,"songname":"天天有喜 (《天天有喜之人间有爱》电视剧主题曲)
     * ","url":"http://ws.stream.qqmusic.qq.com/105508636.m4a?fromtag=46"},{"albumid":1277111,
     * "albummid":"002n4C8Z1sYaLY","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/L/Y/002n4C8Z1sYaLY.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/L/Y/002n4C8Z1sYaLY.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105563677.mp3","seconds":263,"singerid":24593,"singername":"祁隆","songid":105563677,
     * "songname":"找一个不伤心的理由","url":"http://ws.stream.qqmusic.qq.com/105563677.m4a?fromtag=46"},
     * {"albumid":1282073,"albummid":"004al49P4J5Fpp","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/p/p/004al49P4J5Fpp.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/p/p/004al49P4J5Fpp.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105575138.mp3","seconds":28,"singerid":24516,"singername":"窦鹏","songid":105575138,
     * "songname":"胡同（片头) (《老炮儿》电影配乐)","url":"http://ws.stream.qqmusic.qq.com/105575138
     * .m4a?fromtag=46"},{"albumid":1280725,"albummid":"0021aJ9H3IEQee","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/e/e/0021aJ9H3IEQee.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/e/e/0021aJ9H3IEQee.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105563670.mp3","seconds":303,"singerid":184239,"singername":"张羿凡",
     * "songid":105563670,"songname":"化妆舞会","url":"http://ws.stream.qqmusic.qq.com/105563670
     * .m4a?fromtag=46"},{"albumid":1276026,"albummid":"003C3r8549SKoO","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/o/O/003C3r8549SKoO.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/o/O/003C3r8549SKoO.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105524991.mp3","seconds":250,"singerid":945892,"singername":"夏雪",
     * "songid":105524991,"songname":"我想你的时候","url":"http://ws.stream.qqmusic.qq.com/105524991
     * .m4a?fromtag=46"},{"albumid":1208893,"albummid":"002PYfDI1C7cDT","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/D/T/002PYfDI1C7cDT.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/D/T/002PYfDI1C7cDT.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105008946.mp3","songid":105008946,"songname":"妈妈","url":"http://ws.stream.qqmusic
     * .qq.com/105008946.m4a?fromtag=46"},{"albumid":1246226,"albummid":"003lvLlN4V3agL",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/g/L/003lvLlN4V3agL.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/g/L/003lvLlN4V3agL.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/105302915.mp3","seconds":222,"singerid":11712,
     * "singername":"乔任梁","songid":105302915,"songname":"不存在的你","url":"http://ws.stream.qqmusic
     * .qq.com/105302915.m4a?fromtag=46"},{"albumid":1209529,"albummid":"002lzdnY0n8nR5",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/R/5/002lzdnY0n8nR5.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/R/5/002lzdnY0n8nR5.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/105014686.mp3","seconds":287,"singerid":4610,
     * "singername":"周笔畅","songid":105014686,"songname":"片羽时光 (《怦然星动》电影插曲)","url":"http://ws
     * .stream.qqmusic.qq.com/105014686.m4a?fromtag=46"},{"albumid":1267635,
     * "albummid":"000ivcI61caQ48","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/4/8/000ivcI61caQ48.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/4/8/000ivcI61caQ48.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105462126.mp3","seconds":215,"songid":105462126,"songname":"野蛮生长","url":"http://ws
     * .stream.qqmusic.qq.com/105462126.m4a?fromtag=46"},{"albumid":1247290,
     * "albummid":"001DCCoo2exIyO","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/y/O/001DCCoo2exIyO.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/y/O/001DCCoo2exIyO.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105309165.mp3","seconds":311,"singerid":92117,"singername":"SNH48",
     * "songid":105309165,"songname":"新年的钟声","url":"http://ws.stream.qqmusic.qq.com/105309165
     * .m4a?fromtag=46"},{"albumid":1274628,"albummid":"002mR4Rs3Dg6DK","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/D/K/002mR4Rs3Dg6DK.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/D/K/002mR4Rs3Dg6DK.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105513746.mp3","seconds":265,"singerid":4355,"singername":"金莎","songid":105513746,
     * "songname":"全世界我只贪一个他","url":"http://ws.stream.qqmusic.qq.com/105513746.m4a?fromtag=46"},
     * {"albumid":1258384,"albummid":"000X7wBs1T3fVd","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/V/d/000X7wBs1T3fVd.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/V/d/000X7wBs1T3fVd.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105393371.mp3","seconds":279,"songid":105393371,"songname":"一封家书 (《一切都好》电影宣传曲)",
     * "url":"http://ws.stream.qqmusic.qq.com/105393371.m4a?fromtag=46"},{"albumid":1282093,
     * "albummid":"000ZOFo42JnVaT","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/a/T/000ZOFo42JnVaT.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/a/T/000ZOFo42JnVaT.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105575410.mp3","seconds":111,"singerid":62490,"singername":"吴莫愁","songid":105575410,
     * "songname":"猴厉嗨","url":"http://ws.stream.qqmusic.qq.com/105575410.m4a?fromtag=46"},
     * {"albumid":1210970,"albummid":"003DtmIa4WDFmM","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/m/M/003DtmIa4WDFmM.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/m/M/003DtmIa4WDFmM.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105025984.mp3","seconds":216,"songid":105025984,"songname":"依赖","url":"http://ws
     * .stream.qqmusic.qq.com/105025984.m4a?fromtag=46"},{"albumid":1257907,
     * "albummid":"000Nj7Kw0dkkLS","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/L/S/000Nj7Kw0dkkLS.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/L/S/000Nj7Kw0dkkLS.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105389295.mp3","seconds":237,"singerid":4789,"singername":"丁丁","songid":105389295,
     * "songname":"你是我的李白","url":"http://ws.stream.qqmusic.qq.com/105389295.m4a?fromtag=46"},
     * {"albumid":1204351,"albummid":"001cbo1d327sYr","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/Y/r/001cbo1d327sYr.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/Y/r/001cbo1d327sYr.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/104975046.mp3","songid":104975046,"songname":"三千痴缠","url":"http://ws.stream.qqmusic
     * .qq.com/104975046.m4a?fromtag=46"},{"albumid":1209306,"albummid":"0032wsE33S0oXx",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/X/x/0032wsE33S0oXx.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/X/x/0032wsE33S0oXx.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/105012341.mp3","singerid":60885,"singername":"张玮",
     * "songid":105012341,"songname":"追爱 (《北上广不相信眼泪》电视剧插曲)","url":"http://ws.stream.qqmusic.qq
     * .com/105012341.m4a?fromtag=46"},{"albumid":1220170,"albummid":"000sLvNA3ao5gD",
     * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/g/D/000sLvNA3ao5gD.jpg",
     * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/g/D/000sLvNA3ao5gD.jpg",
     * "downUrl":"http://tsmusic24.tc.qq.com/105303963.mp3","seconds":266,"singerid":4538,
     * "singername":"阿鲁阿卓","songid":105303963,"songname":"西风 (《芈月传》电视剧片尾曲)","url":"http://ws
     * .stream.qqmusic.qq.com/105303963.m4a?fromtag=46"},{"albumid":1274037,
     * "albummid":"0004bLsF3qYjnu","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/n/u/0004bLsF3qYjnu.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/n/u/0004bLsF3qYjnu.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105509351.mp3","singerid":167494,"singername":"和汇慧","songid":105509351,"songname":"爱
     * (《搭错车》电视剧插曲)","url":"http://ws.stream.qqmusic.qq.com/105509351.m4a?fromtag=46"},
     * {"downUrl":"http://tsmusic24.tc.qq.com/104917343.mp3","songid":104917343,"songname":"I'll
     * Be Back (《北上广不相信眼泪》电视剧片头曲)","url":"http://ws.stream.qqmusic.qq.com/104917343
     * .m4a?fromtag=46"},{"albumid":1276273,"albummid":"003gioeE0R5RXV","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/X/V/003gioeE0R5RXV.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/X/V/003gioeE0R5RXV.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105527711.mp3","singername":"孙楠","songid":105527711,"songname":"一起奔放
     * (《青蛙王国之冰冻大冒险》动画电影主题曲)","url":"http://ws.stream.qqmusic.qq.com/105527711.m4a?fromtag=46"},
     * {"albumid":1275319,"albummid":"000f72cL25vX0C","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/0/C/000f72cL25vX0C.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/0/C/000f72cL25vX0C.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105519313.mp3","singerid":12744,"singername":"小沈阳","songid":105519313,
     * "songname":"多难","url":"http://ws.stream.qqmusic.qq.com/105519313.m4a?fromtag=46"},
     * {"albumid":1220151,"albummid":"001DtWLr1I6Hwb","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/w/b/001DtWLr1I6Hwb.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/w/b/001DtWLr1I6Hwb.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105091516.mp3","singerid":4293,"singername":"陈坤","songid":105091516,"songname":"寻龙诀
     * (《寻龙诀》电影主题曲)","url":"http://ws.stream.qqmusic.qq.com/105091516.m4a?fromtag=46"},
     * {"albumid":1246649,"albummid":"001KgAXI2djoEC","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/E/C/001KgAXI2djoEC.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/E/C/001KgAXI2djoEC.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105305531.mp3","singerid":28227,"singername":"马旭东","songid":105305531,
     * "songname":"假装怀念","url":"http://ws.stream.qqmusic.qq.com/105305531.m4a?fromtag=46"},
     * {"albumid":1276049,"albummid":"003atDBO2GDAFB","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/F/B/003atDBO2GDAFB.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/F/B/003atDBO2GDAFB.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105525241.mp3","singerid":22855,"singername":"阿悄","songid":105525241,"songname":"气质少女
     * (《哎哟青春期》电影主题曲)","url":"http://ws.stream.qqmusic.qq.com/105525241.m4a?fromtag=46"},
     * {"albumid":1220169,"albummid":"0022Yd8X1Eo4CE","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/C/E/0022Yd8X1Eo4CE.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/C/E/0022Yd8X1Eo4CE.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105146700.mp3","singerid":6104,"singername":"陈思思","songid":105146700,"songname":"满月
     * (《芈月传》电视剧片头曲)","url":"http://ws.stream.qqmusic.qq.com/105146700.m4a?fromtag=46"},
     * {"albumid":1281224,"albummid":"002OJYfq1f7VnI","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/n/I/002OJYfq1f7VnI.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/n/I/002OJYfq1f7VnI.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/104115604.mp3","seconds":262,"singerid":1016429,"singername":"S.I.N.G 女团",
     * "songid":104115604,"songname":"听见夏至","url":"http://ws.stream.qqmusic.qq.com/104115604
     * .m4a?fromtag=46"},{"albumid":1281457,"albummid":"000Y5VAR4cfvEb","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/E/b/000Y5VAR4cfvEb.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/E/b/000Y5VAR4cfvEb.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105570326.mp3","seconds":224,"singerid":4423,"singername":"华语群星",
     * "songid":105570326,"songname":"新年到","url":"http://ws.stream.qqmusic.qq.com/105570326
     * .m4a?fromtag=46"},{"albumid":1275856,"albummid":"000oDjP40IJob5","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/b/5/000oDjP40IJob5.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/b/5/000oDjP40IJob5.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105523598.mp3","singerid":28634,"singername":"单色凌","songid":105523598,
     * "songname":"两座城市都下雨","url":"http://ws.stream.qqmusic.qq.com/105523598.m4a?fromtag=46"},
     * {"albumid":1212338,"albummid":"002Edpgx2yorFV","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/F/V/002Edpgx2yorFV.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/F/V/002Edpgx2yorFV.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105036859.mp3","seconds":246,"singerid":61981,"singername":"李代沫","songid":105036859,
     * "songname":"谢谢你","url":"http://ws.stream.qqmusic.qq.com/105036859.m4a?fromtag=46"},
     * {"downUrl":"http://tsmusic24.tc.qq.com/105039745.mp3","seconds":217,"songid":105039745,
     * "songname":"在每一个街角想起你","url":"http://ws.stream.qqmusic.qq.com/105039745.m4a?fromtag=46"},
     * {"albumid":1211503,"albummid":"002TlGtr1Vxhan","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/a/n/002TlGtr1Vxhan.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/a/n/002TlGtr1Vxhan.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105029289.mp3","singerid":23800,"singername":"夏婉安","songid":105029289,
     * "songname":"独角戏","url":"http://ws.stream.qqmusic.qq.com/105029289.m4a?fromtag=46"},
     * {"albumid":1207562,"albummid":"003016Ev4aiqg4","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/g/4/003016Ev4aiqg4.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/g/4/003016Ev4aiqg4.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105090482.mp3","singerid":22704,"singername":"徐良","songid":105090482,"songname":"华生",
     * "url":"http://ws.stream.qqmusic.qq.com/105090482.m4a?fromtag=46"},{"albumid":1258396,
     * "albummid":"002QO0eL1OwPdt","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/d/t/002QO0eL1OwPdt.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/d/t/002QO0eL1OwPdt.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105394974.mp3","seconds":318,"songid":105394974,"songname":"有情世间 (《恶棍天使》电影主题曲)",
     * "url":"http://ws.stream.qqmusic.qq.com/105394974.m4a?fromtag=46"},{"albumid":1208537,
     * "albummid":"0033qUNg3dyZal","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/a/l/0033qUNg3dyZal.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/a/l/0033qUNg3dyZal.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105006095.mp3","singerid":4604,"singername":"汪峰","songid":105006095,"songname":"亲爱的
     * 今夜你在哪里","url":"http://ws.stream.qqmusic.qq.com/105006095.m4a?fromtag=46"},
     * {"albumid":1277319,"albummid":"002SW2511Zk6tG","albumpic_big":"http://i.gtimg
     * .cn/music/photo/mid_album_300/t/G/002SW2511Zk6tG.jpg","albumpic_small":"http://i.gtimg
     * .cn/music/photo/mid_album_90/t/G/002SW2511Zk6tG.jpg","downUrl":"http://tsmusic24.tc.qq
     * .com/105536892.mp3","seconds":208,"singerid":12721,"singername":"郝云","songid":105536892,
     * "songname":"姥姥说 (《年兽大作战》电影片头曲)","url":"http://ws.stream.qqmusic.qq.com/105536892
     * .m4a?fromtag=46"},{"albumid":1280283,"albummid":"0045UWxy300fbT","albumpic_big":"http://i
     * .gtimg.cn/music/photo/mid_album_300/b/T/0045UWxy300fbT.jpg","albumpic_small":"http://i
     * .gtimg.cn/music/photo/mid_album_90/b/T/0045UWxy300fbT.jpg","downUrl":"http://tsmusic24.tc
     * .qq.com/105559514.mp3","seconds":258,"singerid":19722,"singername":"冷漠",
     * "songid":105559514,"songname":"冰水情歌","url":"http://ws.stream.qqmusic.qq.com/105559514
     * .m4a?fromtag=46"}]}
     * ret_code : 0
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
         * cur_song_num : 100
         * currentPage : 1
         * song_begin : 0
         * songlist : [{"albumid":1276189,"albummid":"001fi1zG0EjU2u","albumpic_big":"http://i
         * .gtimg.cn/music/photo/mid_album_300/2/u/001fi1zG0EjU2u.jpg","albumpic_small":"http://i
         * .gtimg.cn/music/photo/mid_album_90/2/u/001fi1zG0EjU2u.jpg","downUrl":"http://tsmusic24
         * .tc.qq.com/105526949.mp3","seconds":284,"singerid":60505,"singername":"李荣浩",
         * "songid":105526949,"songname":"爸爸妈妈","url":"http://ws.stream.qqmusic.qq.com/105526949
         * .m4a?fromtag=46"},{"albumid":1282103,"albummid":"0035uvnA1xeJhR",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/h/R/0035uvnA1xeJhR.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/h/R/0035uvnA1xeJhR.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105575471.mp3","seconds":294,"singerid":7221,
         * "singername":"许嵩","songid":105575471,"songname":"燕归巢","url":"http://ws.stream.qqmusic
         * .qq.com/105575471.m4a?fromtag=46"},{"albumid":1280498,"albummid":"001PqCSC0xOlli",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/l/i/001PqCSC0xOlli.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/l/i/001PqCSC0xOlli.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105561979.mp3","seconds":297,"singerid":4422,
         * "singername":"牛奶咖啡","songid":105561979,"songname":"从你的全世界路过","url":"http://ws.stream
         * .qqmusic.qq.com/105561979.m4a?fromtag=46"},{"albumid":1281336,
         * "albummid":"004EvugT3C2fi7","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/i/7/004EvugT3C2fi7.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/i/7/004EvugT3C2fi7.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105569010.mp3","seconds":255,"singerid":1012038,"singername":"张磊",
         * "songid":105569010,"songname":"别来无恙 (新春特别版)","url":"http://ws.stream.qqmusic.qq
         * .com/105569010.m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq.com/105526948.mp3",
         * "seconds":228,"songid":105526948,"songname":"有理想","url":"http://ws.stream.qqmusic.qq
         * .com/105526948.m4a?fromtag=46"},{"albumid":1259900,"albummid":"003vkgQH3I7RLY",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/L/Y/003vkgQH3I7RLY.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/L/Y/003vkgQH3I7RLY.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105404257.mp3","seconds":210,"singerid":204664,
         * "singername":"鹿晗","songid":105404257,"songname":"原动力 (星战版) (《星球大战》电影推广曲)",
         * "url":"http://ws.stream.qqmusic.qq.com/105404257.m4a?fromtag=46"},{"albumid":1280942,
         * "albummid":"003Lkw7D08wDlB","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/l/B/003Lkw7D08wDlB.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/l/B/003Lkw7D08wDlB.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105566107.mp3","seconds":230,"singerid":945054,"singername":"苏运莹",
         * "songid":105566107,"songname":"精灵","url":"http://ws.stream.qqmusic.qq.com/105566107
         * .m4a?fromtag=46"},{"albumid":1246631,"albummid":"000lXXmD0eNyaz",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/a/z/000lXXmD0eNyaz.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/a/z/000lXXmD0eNyaz.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105327326.mp3","seconds":229,"singerid":180646,
         * "singername":"吴亦凡","songid":105327326,"songname":"花房姑娘 (《老炮儿》电影推广曲)","url":"http://ws
         * .stream.qqmusic.qq.com/105327326.m4a?fromtag=46"},{"albumid":1267526,
         * "albummid":"001uMCZE0lJIWr","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/W/r/001uMCZE0lJIWr.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/W/r/001uMCZE0lJIWr.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105461543.mp3","seconds":260,"singerid":34412,"singername":"TFBOYS",
         * "songid":105461543,"songname":"不完美小孩","url":"http://ws.stream.qqmusic.qq.com/105461543
         * .m4a?fromtag=46"},{"albumid":1212106,"albummid":"002ojt9Q3QmHJZ",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/J/Z/002ojt9Q3QmHJZ.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/J/Z/002ojt9Q3QmHJZ.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105042137.mp3","seconds":244,"singerid":11707,
         * "singername":"李易峰","songid":105042137,"songname":"请跟我联络 (《怦然星动》电影主题曲)",
         * "url":"http://ws.stream.qqmusic.qq.com/105042137.m4a?fromtag=46"},
         * {"downUrl":"http://tsmusic24.tc.qq.com/105526952.mp3","seconds":299,
         * "songid":105526952,"songname":"心里面","url":"http://ws.stream.qqmusic.qq.com/105526952
         * .m4a?fromtag=46"},{"albumid":1258253,"albummid":"003D0jU40YataC",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/a/C/003D0jU40YataC.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/a/C/003D0jU40YataC.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105391500.mp3","seconds":282,"singerid":37459,
         * "singername":"崔子格","songid":105391500,"songname":"可念不可说 (《太子妃升职记》网络剧主题曲)",
         * "url":"http://ws.stream.qqmusic.qq.com/105391500.m4a?fromtag=46"},{"albumid":1209397,
         * "albummid":"002VkuTq4LwDjg","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/j/g/002VkuTq4LwDjg.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/j/g/002VkuTq4LwDjg.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105013419.mp3","seconds":283,"songid":105013419,"songname":"我们只差一点点",
         * "url":"http://ws.stream.qqmusic.qq.com/105013419.m4a?fromtag=46"},{"albumid":1212090,
         * "albummid":"003hMTTn2QMbFC","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/F/C/003hMTTn2QMbFC.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/F/C/003hMTTn2QMbFC.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105034420.mp3","singerid":33026,"singername":"严艺丹","songid":105034420,
         * "songname":"醉城伤 (《长在面包树上的女人》电视剧主题曲)","url":"http://ws.stream.qqmusic.qq.com/105034420
         * .m4a?fromtag=46"},{"albumid":1276802,"albummid":"001DeNfN1wikad",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/a/d/001DeNfN1wikad.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/a/d/001DeNfN1wikad.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105532343.mp3","seconds":221,"singerid":3954,
         * "singername":"汪苏泷","songid":105532343,"songname":"灵主不悔 (《画江湖之灵主》手游暨动漫主题曲)",
         * "url":"http://ws.stream.qqmusic.qq.com/105532343.m4a?fromtag=46"},{"albumid":1230948,
         * "albummid":"000oxFgZ0cV589","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/8/9/000oxFgZ0cV589.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/8/9/000oxFgZ0cV589.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105164089.mp3","seconds":242,"singerid":4289,"singername":"赵英俊",
         * "songid":105164089,"songname":"大王叫我来巡山 (《万万没想到》电影插曲)","url":"http://ws.stream.qqmusic
         * .qq.com/105164089.m4a?fromtag=46"},{"albumid":1213329,"albummid":"002JsU5q10jUBt",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/B/t/002JsU5q10jUBt.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/B/t/002JsU5q10jUBt.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105044366.mp3","seconds":219,"singerid":4607,
         * "singername":"张靓颖","songid":105044366,"songname":"我的梦 (华为手机主题曲)","url":"http://ws
         * .stream.qqmusic.qq.com/105044366.m4a?fromtag=46"},{"albumid":1273534,
         * "albummid":"004e2dXU0nW0oI","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/o/I/004e2dXU0nW0oI.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/o/I/004e2dXU0nW0oI.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105505647.mp3","seconds":292,"singerid":36691,"singername":"袁娅维",
         * "songid":105505647,"songname":"长腿叔叔 (《老师晚上好》电视剧主题曲)","url":"http://ws.stream.qqmusic
         * .qq.com/105505647.m4a?fromtag=46"},{"albumid":1240412,"albummid":"003fng4t4EEZEA",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/E/A/003fng4t4EEZEA.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/E/A/003fng4t4EEZEA.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105247934.mp3","seconds":184,"singerid":202409,
         * "singername":"宋茜","songid":105247934,"songname":"星星泪 (《美丽的秘密》电视剧主题曲)","url":"http://ws
         * .stream.qqmusic.qq.com/105247934.m4a?fromtag=46"},{"albumid":1125092,
         * "albummid":"0033WvCp0z2wOQ","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/O/Q/0033WvCp0z2wOQ.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/O/Q/0033WvCp0z2wOQ.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105503807.mp3","seconds":207,"singerid":61386,"singername":"洛天依",
         * "songid":105503807,"songname":"普通Disco","url":"http://ws.stream.qqmusic.qq
         * .com/105503807.m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq.com/105421140.mp3",
         * "seconds":295,"songid":105421140,"songname":"野生动物","url":"http://ws.stream.qqmusic.qq
         * .com/105421140.m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq.com/105505892.mp3",
         * "seconds":332,"songid":105505892,"songname":"满座","url":"http://ws.stream.qqmusic.qq
         * .com/105505892.m4a?fromtag=46"},{"albumid":1276347,"albummid":"001Hk9X54Fn8WH",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/W/H/001Hk9X54Fn8WH.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/W/H/001Hk9X54Fn8WH.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105526932.mp3","singerid":22926,
         * "singername":"陈翔","songid":105526932,"songname":"到不了 (《寻找爱的冒险》电视剧插曲)","url":"http://ws
         * .stream.qqmusic.qq.com/105526932.m4a?fromtag=46"},{"albumid":1258562,
         * "albummid":"002kZO8S1harBG","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/B/G/002kZO8S1harBG.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/B/G/002kZO8S1harBG.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105393553.mp3","seconds":248,"songid":105393553,"songname":"2-0+1",
         * "url":"http://ws.stream.qqmusic.qq.com/105393553.m4a?fromtag=46"},{"albumid":1258759,
         * "albummid":"004CWTXm3WqUAh","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/A/h/004CWTXm3WqUAh.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/A/h/004CWTXm3WqUAh.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105394961.mp3","seconds":198,"singerid":11453,"singername":"魏晨",
         * "songid":105394961,"songname":"白日梦想家","url":"http://ws.stream.qqmusic.qq.com/105394961
         * .m4a?fromtag=46"},{"albumid":1239607,"albummid":"0047TQXN0Ahyp5",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/p/5/0047TQXN0Ahyp5.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/p/5/0047TQXN0Ahyp5.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105242379.mp3","seconds":220,"singerid":22874,
         * "singername":"孙子涵","songid":105242379,"songname":"总是那么傻","url":"http://ws.stream
         * .qqmusic.qq.com/105242379.m4a?fromtag=46"},{"albumid":1236468,
         * "albummid":"002UKpxn0b2slr","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/l/r/002UKpxn0b2slr.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/l/r/002UKpxn0b2slr.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105214838.mp3","seconds":264,"singerid":187238,"singername":"7妹",
         * "songid":105214838,"songname":"7妹独家混音","url":"http://ws.stream.qqmusic.qq
         * .com/105214838.m4a?fromtag=46"},{"albumid":1273231,"albummid":"001aczn92BdIiV",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/i/V/001aczn92BdIiV.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/i/V/001aczn92BdIiV.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105503773.mp3","seconds":86,"singerid":12530,
         * "singername":"邓超","songid":105503773,"songname":"无敌 (《美人鱼》电影宣传曲)","url":"http://ws
         * .stream.qqmusic.qq.com/105503773.m4a?fromtag=46"},{"albumid":1276877,
         * "albummid":"000H27sc4UoQv1","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/v/1/000H27sc4UoQv1.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/v/1/000H27sc4UoQv1.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105531959.mp3","singerid":23080,"singername":"李行亮","songid":105531959,
         * "songname":"特别想念你","url":"http://ws.stream.qqmusic.qq.com/105531959.m4a?fromtag=46"},
         * {"albumid":1280847,"albummid":"002FAnhv00YBOI","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/O/I/002FAnhv00YBOI.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/O/I/002FAnhv00YBOI.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105564622.mp3","seconds":188,"singerid":3758,"singername":"赖伟锋",
         * "songid":105564622,"songname":"Money Money Home","url":"http://ws.stream.qqmusic.qq
         * .com/105564622.m4a?fromtag=46"},{"albumid":1267469,"albummid":"0011ttXx3gzbtp",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/t/p/0011ttXx3gzbtp.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/t/p/0011ttXx3gzbtp.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105460914.mp3","seconds":269,"singerid":15352,
         * "singername":"张丹锋","songid":105460914,"songname":"新年快乐","url":"http://ws.stream
         * .qqmusic.qq.com/105460914.m4a?fromtag=46"},{"albumid":1281160,
         * "albummid":"003Z7jYl0VxeYu","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/Y/u/003Z7jYl0VxeYu.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/Y/u/003Z7jYl0VxeYu.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105523019.mp3","seconds":281,"singerid":11446,"singername":"陈楚生",
         * "songid":105523019,"songname":"不如怀念 (《五鼠闹东京》电视剧插曲)","url":"http://ws.stream.qqmusic.qq
         * .com/105523019.m4a?fromtag=46"},{"albumid":1246086,"albummid":"0000SzYi2BioJN",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/J/N/0000SzYi2BioJN.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/J/N/0000SzYi2BioJN.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105301701.mp3","seconds":315,"singerid":89698,
         * "singername":"庄心妍","songid":105301701,"songname":"哎","url":"http://ws.stream.qqmusic
         * .qq.com/105301701.m4a?fromtag=46"},{"albumid":1267462,"albummid":"000I4CFA03SRGW",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/G/W/000I4CFA03SRGW.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/G/W/000I4CFA03SRGW.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105460886.mp3","seconds":296,"singerid":60433,
         * "singername":"好妹妹乐队","songid":105460886,"songname":"不说再见 (《谁的青春不迷茫》电影主题曲)",
         * "url":"http://ws.stream.qqmusic.qq.com/105460886.m4a?fromtag=46"},{"albumid":1277081,
         * "albummid":"001VELQ401D4Fj","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/F/j/001VELQ401D4Fj.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/F/j/001VELQ401D4Fj.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105533676.mp3","seconds":259,"singerid":4605,"singername":"弦子",
         * "songid":105533676,"songname":"Say I Do","url":"http://ws.stream.qqmusic.qq
         * .com/105533676.m4a?fromtag=46"},{"albumid":1276964,"albummid":"001fDnDA16nWNl",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/N/l/001fDnDA16nWNl.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/N/l/001fDnDA16nWNl.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105532751.mp3","seconds":251,"singerid":1105316,
         * "singername":"VP团","songid":105532751,"songname":"你妈逼你结婚了没","url":"http://ws.stream
         * .qqmusic.qq.com/105532751.m4a?fromtag=46"},{"albumid":1281017,
         * "albummid":"004Vtm3n282BLg","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/L/g/004Vtm3n282BLg.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/L/g/004Vtm3n282BLg.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105566772.mp3","singerid":1107430,"singername":"Astro本地团艺人","songid":105566772,
         * "songname":"大盛年","url":"http://ws.stream.qqmusic.qq.com/105566772.m4a?fromtag=46"},
         * {"albumid":1215169,"albummid":"000WEI9F3lXJiE","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/i/E/000WEI9F3lXJiE.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/i/E/000WEI9F3lXJiE.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105054285.mp3","seconds":293,"singerid":199515,"singername":"张碧晨",
         * "songid":105054285,"songname":"如果一切没有发生过 (《从天儿降》电影插曲)","url":"http://ws.stream.qqmusic
         * .qq.com/105054285.m4a?fromtag=46"},{"albumid":1280203,"albummid":"003RTw7F01stDn",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/D/n/003RTw7F01stDn.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/D/n/003RTw7F01stDn.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105559029.mp3","singerid":42235,
         * "singername":"包贝尔","songid":105559029,"songname":"快发红包 (《欢喜密探》电视剧宣传曲)",
         * "url":"http://ws.stream.qqmusic.qq.com/105559029.m4a?fromtag=46"},{"albumid":1212622,
         * "albummid":"003iFxRi1Sw9SB","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/S/B/003iFxRi1Sw9SB.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/S/B/003iFxRi1Sw9SB.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105039751.mp3","seconds":268,"singerid":202434,"singername":"虞鹏",
         * "songid":105039751,"songname":"爱过","url":"http://ws.stream.qqmusic.qq.com/105039751
         * .m4a?fromtag=46"},{"albumid":1262466,"albummid":"00469cps0EPolC",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/l/C/00469cps0EPolC.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/l/C/00469cps0EPolC.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105422371.mp3","seconds":206,"singerid":160022,
         * "singername":"MC天佑","songid":105422371,"songname":"未来","url":"http://ws.stream.qqmusic
         * .qq.com/105422371.m4a?fromtag=46"},{"albumid":430785,"albummid":"001Kkrbo0730vP",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/v/P/001Kkrbo0730vP.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/v/P/001Kkrbo0730vP.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105280844.mp3","singerid":23384,
         * "singername":"杜歌","songid":105280844,"songname":"兄弟难当","url":"http://ws.stream.qqmusic
         * .qq.com/105280844.m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq.com/105391798
         * .mp3","seconds":233,"singerid":1097826,"singername":"冯小刚","songid":105391798,
         * "songname":"爱的代价 (《老炮儿》电影宣传曲)","url":"http://ws.stream.qqmusic.qq.com/105391798
         * .m4a?fromtag=46"},{"albumid":1273908,"albummid":"000hhJM90xHyfW",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/f/W/000hhJM90xHyfW.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/f/W/000hhJM90xHyfW.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105508564.mp3","seconds":326,"songid":105508564,
         * "songname":"Let you go","url":"http://ws.stream.qqmusic.qq.com/105508564
         * .m4a?fromtag=46"},{"albumid":1281679,"albummid":"004aVWjy0OiVX1",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/X/1/004aVWjy0OiVX1.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/X/1/004aVWjy0OiVX1.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105571958.mp3","seconds":218,"songid":105571958,
         * "songname":"尘梦忆仙","url":"http://ws.stream.qqmusic.qq.com/105571958.m4a?fromtag=46"},
         * {"albumid":1230651,"albummid":"003uoPjx3z03dB","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/d/B/003uoPjx3z03dB.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/d/B/003uoPjx3z03dB.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105161539.mp3","seconds":267,"songid":105161539,"songname":"一念天堂 (《一念天堂》电影主题曲)",
         * "url":"http://ws.stream.qqmusic.qq.com/105161539.m4a?fromtag=46"},
         * {"downUrl":"http://tsmusic24.tc.qq.com/105091296.mp3","seconds":256,
         * "songid":105091296,"songname":"人间","url":"http://ws.stream.qqmusic.qq.com/105091296
         * .m4a?fromtag=46"},{"albumid":1259881,"albummid":"000m58mZ3Nroc9",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/c/9/000m58mZ3Nroc9.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/c/9/000m58mZ3Nroc9.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105404155.mp3","seconds":271,"singerid":4615,
         * "singername":"李宇春","songid":105404155,"songname":"唐人街 (《唐人街探案》电影主题曲)","url":"http://ws
         * .stream.qqmusic.qq.com/105404155.m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq
         * .com/105091293.mp3","seconds":317,"songid":105091293,"songname":"纸飞机","url":"http://ws
         * .stream.qqmusic.qq.com/105091293.m4a?fromtag=46"},{"albumid":1273923,
         * "albummid":"001F9lBd3UUYu8","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/u/8/001F9lBd3UUYu8.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/u/8/001F9lBd3UUYu8.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105508635.mp3","seconds":152,"singerid":25678,"singername":"刘庭羽",
         * "songid":105508635,"songname":"勿忘我 (《天天有喜之人间有爱》电视剧片尾曲)","url":"http://ws.stream
         * .qqmusic.qq.com/105508635.m4a?fromtag=46"},{"albumid":1266691,
         * "albummid":"0033CsSV1696NL","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/N/L/0033CsSV1696NL.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/N/L/0033CsSV1696NL.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105453670.mp3","seconds":240,"singerid":205401,"singername":"UNIQ",
         * "songid":105453670,"url":"http://ws.stream.qqmusic.qq.com/105453670.m4a?fromtag=46"},
         * {"albumid":1276127,"albummid":"000hRSyz3UZuD7","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/D/7/000hRSyz3UZuD7.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/D/7/000hRSyz3UZuD7.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105525585.mp3","seconds":252,"singerid":169582,"singername":"蒋卓嘉",
         * "songid":105525585,"songname":"雨还下不停 (《蜀山战纪之剑侠传奇 第五季》电视剧片头曲 )","url":"http://ws.stream
         * .qqmusic.qq.com/105525585.m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq
         * .com/105565556.mp3","singerid":178612,"singername":"金玟岐","songid":105565556,
         * "songname":"直到遇见你 (《五鼠闹东京》电视剧插曲)","url":"http://ws.stream.qqmusic.qq.com/105565556
         * .m4a?fromtag=46"},{"albumid":1234495,"albummid":"0023KUFT3QWykm",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/k/m/0023KUFT3QWykm.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/k/m/0023KUFT3QWykm.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105197348.mp3","seconds":192,"singerid":943468,
         * "singername":"萌萌哒天团","songid":105197348,"songname":"秦时明月","url":"http://ws.stream
         * .qqmusic.qq.com/105197348.m4a?fromtag=46"},{"albumid":1259908,
         * "albummid":"004Q1Rll4PiNKt","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/K/t/004Q1Rll4PiNKt.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/K/t/004Q1Rll4PiNKt.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105404271.mp3","songid":105404271,"songname":"梦想天灯2016","url":"http://ws.stream
         * .qqmusic.qq.com/105404271.m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq
         * .com/105391501.mp3","seconds":278,"singerid":1092745,"singername":"盛一伦",
         * "songid":105391501,"songname":"以前的以后","url":"http://ws.stream.qqmusic.qq.com/105391501
         * .m4a?fromtag=46"},{"albumid":1281580,"albummid":"002HEuZU1qtK7r",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/7/r/002HEuZU1qtK7r.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/7/r/002HEuZU1qtK7r.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105571132.mp3","singerid":359684,
         * "singername":"1931组合","songid":105571132,"songname":"爱","url":"http://ws.stream
         * .qqmusic.qq.com/105571132.m4a?fromtag=46"},{"albumid":1236934,
         * "albummid":"000CykBR1eXrr2","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/r/2/000CykBR1eXrr2.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/r/2/000CykBR1eXrr2.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105219415.mp3","singerid":33169,"singername":"DJ小可","songid":105219415,
         * "songname":"I'm Dj小可","url":"http://ws.stream.qqmusic.qq.com/105219415
         * .m4a?fromtag=46"},{"albumid":1224719,"albummid":"002aHhK7002Gnr",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/n/r/002aHhK7002Gnr.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/n/r/002aHhK7002Gnr.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105123692.mp3","seconds":213,"singerid":949463,
         * "singername":"小可","songid":105123692,"songname":"一人我饮酒醉","url":"http://ws.stream
         * .qqmusic.qq.com/105123692.m4a?fromtag=46"},{"albumid":1281118,
         * "albummid":"004Lrxfk0o3M3z","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/3/z/004Lrxfk0o3M3z.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/3/z/004Lrxfk0o3M3z.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105567564.mp3","seconds":225,"singerid":44365,"singername":"寒若珉",
         * "songid":105567564,"songname":"大吉小祥","url":"http://ws.stream.qqmusic.qq.com/105567564
         * .m4a?fromtag=46"},{"albumid":1261295,"albummid":"003g6MQ04KqUlD",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/l/D/003g6MQ04KqUlD.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/l/D/003g6MQ04KqUlD.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105413357.mp3","seconds":164,"songid":105413357,
         * "songname":"社会摇","url":"http://ws.stream.qqmusic.qq.com/105413357.m4a?fromtag=46"},
         * {"albumid":1280927,"albummid":"0031gjCW26Nhgj","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/g/j/0031gjCW26Nhgj.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/g/j/0031gjCW26Nhgj.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105565934.mp3","seconds":226,"singerid":32849,"singername":"夏天Alex",
         * "songid":105565934,"songname":"走一步算一步","url":"http://ws.stream.qqmusic.qq
         * .com/105565934.m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq.com/105489688.mp3",
         * "seconds":232,"songid":105489688,"songname":"独自唱情歌","url":"http://ws.stream.qqmusic.qq
         * .com/105489688.m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq.com/105508636.mp3",
         * "seconds":138,"singerid":5001,"singername":"阿宝","songid":105508636,"songname":"天天有喜
         * (《天天有喜之人间有爱》电视剧主题曲)","url":"http://ws.stream.qqmusic.qq.com/105508636
         * .m4a?fromtag=46"},{"albumid":1277111,"albummid":"002n4C8Z1sYaLY",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/L/Y/002n4C8Z1sYaLY.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/L/Y/002n4C8Z1sYaLY.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105563677.mp3","seconds":263,"singerid":24593,
         * "singername":"祁隆","songid":105563677,"songname":"找一个不伤心的理由","url":"http://ws.stream
         * .qqmusic.qq.com/105563677.m4a?fromtag=46"},{"albumid":1282073,
         * "albummid":"004al49P4J5Fpp","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/p/p/004al49P4J5Fpp.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/p/p/004al49P4J5Fpp.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105575138.mp3","seconds":28,"singerid":24516,"singername":"窦鹏",
         * "songid":105575138,"songname":"胡同（片头) (《老炮儿》电影配乐)","url":"http://ws.stream.qqmusic.qq
         * .com/105575138.m4a?fromtag=46"},{"albumid":1280725,"albummid":"0021aJ9H3IEQee",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/e/e/0021aJ9H3IEQee.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/e/e/0021aJ9H3IEQee.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105563670.mp3","seconds":303,"singerid":184239,
         * "singername":"张羿凡","songid":105563670,"songname":"化妆舞会","url":"http://ws.stream
         * .qqmusic.qq.com/105563670.m4a?fromtag=46"},{"albumid":1276026,
         * "albummid":"003C3r8549SKoO","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/o/O/003C3r8549SKoO.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/o/O/003C3r8549SKoO.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105524991.mp3","seconds":250,"singerid":945892,"singername":"夏雪",
         * "songid":105524991,"songname":"我想你的时候","url":"http://ws.stream.qqmusic.qq
         * .com/105524991.m4a?fromtag=46"},{"albumid":1208893,"albummid":"002PYfDI1C7cDT",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/D/T/002PYfDI1C7cDT.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/D/T/002PYfDI1C7cDT.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105008946.mp3","songid":105008946,
         * "songname":"妈妈","url":"http://ws.stream.qqmusic.qq.com/105008946.m4a?fromtag=46"},
         * {"albumid":1246226,"albummid":"003lvLlN4V3agL","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/g/L/003lvLlN4V3agL.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/g/L/003lvLlN4V3agL.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105302915.mp3","seconds":222,"singerid":11712,"singername":"乔任梁",
         * "songid":105302915,"songname":"不存在的你","url":"http://ws.stream.qqmusic.qq.com/105302915
         * .m4a?fromtag=46"},{"albumid":1209529,"albummid":"002lzdnY0n8nR5",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/R/5/002lzdnY0n8nR5.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/R/5/002lzdnY0n8nR5.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105014686.mp3","seconds":287,"singerid":4610,
         * "singername":"周笔畅","songid":105014686,"songname":"片羽时光 (《怦然星动》电影插曲)","url":"http://ws
         * .stream.qqmusic.qq.com/105014686.m4a?fromtag=46"},{"albumid":1267635,
         * "albummid":"000ivcI61caQ48","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/4/8/000ivcI61caQ48.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/4/8/000ivcI61caQ48.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105462126.mp3","seconds":215,"songid":105462126,"songname":"野蛮生长",
         * "url":"http://ws.stream.qqmusic.qq.com/105462126.m4a?fromtag=46"},{"albumid":1247290,
         * "albummid":"001DCCoo2exIyO","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/y/O/001DCCoo2exIyO.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/y/O/001DCCoo2exIyO.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105309165.mp3","seconds":311,"singerid":92117,"singername":"SNH48",
         * "songid":105309165,"songname":"新年的钟声","url":"http://ws.stream.qqmusic.qq.com/105309165
         * .m4a?fromtag=46"},{"albumid":1274628,"albummid":"002mR4Rs3Dg6DK",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/D/K/002mR4Rs3Dg6DK.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/D/K/002mR4Rs3Dg6DK.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105513746.mp3","seconds":265,"singerid":4355,
         * "singername":"金莎","songid":105513746,"songname":"全世界我只贪一个他","url":"http://ws.stream
         * .qqmusic.qq.com/105513746.m4a?fromtag=46"},{"albumid":1258384,
         * "albummid":"000X7wBs1T3fVd","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/V/d/000X7wBs1T3fVd.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/V/d/000X7wBs1T3fVd.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105393371.mp3","seconds":279,"songid":105393371,"songname":"一封家书 (《一切都好》电影宣传曲)",
         * "url":"http://ws.stream.qqmusic.qq.com/105393371.m4a?fromtag=46"},{"albumid":1282093,
         * "albummid":"000ZOFo42JnVaT","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/a/T/000ZOFo42JnVaT.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/a/T/000ZOFo42JnVaT.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105575410.mp3","seconds":111,"singerid":62490,"singername":"吴莫愁",
         * "songid":105575410,"songname":"猴厉嗨","url":"http://ws.stream.qqmusic.qq.com/105575410
         * .m4a?fromtag=46"},{"albumid":1210970,"albummid":"003DtmIa4WDFmM",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/m/M/003DtmIa4WDFmM.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/m/M/003DtmIa4WDFmM.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105025984.mp3","seconds":216,"songid":105025984,
         * "songname":"依赖","url":"http://ws.stream.qqmusic.qq.com/105025984.m4a?fromtag=46"},
         * {"albumid":1257907,"albummid":"000Nj7Kw0dkkLS","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/L/S/000Nj7Kw0dkkLS.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/L/S/000Nj7Kw0dkkLS.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105389295.mp3","seconds":237,"singerid":4789,"singername":"丁丁",
         * "songid":105389295,"songname":"你是我的李白","url":"http://ws.stream.qqmusic.qq
         * .com/105389295.m4a?fromtag=46"},{"albumid":1204351,"albummid":"001cbo1d327sYr",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/Y/r/001cbo1d327sYr.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/Y/r/001cbo1d327sYr.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/104975046.mp3","songid":104975046,
         * "songname":"三千痴缠","url":"http://ws.stream.qqmusic.qq.com/104975046.m4a?fromtag=46"},
         * {"albumid":1209306,"albummid":"0032wsE33S0oXx","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/X/x/0032wsE33S0oXx.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/X/x/0032wsE33S0oXx.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105012341.mp3","singerid":60885,"singername":"张玮","songid":105012341,
         * "songname":"追爱 (《北上广不相信眼泪》电视剧插曲)","url":"http://ws.stream.qqmusic.qq.com/105012341
         * .m4a?fromtag=46"},{"albumid":1220170,"albummid":"000sLvNA3ao5gD",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/g/D/000sLvNA3ao5gD.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/g/D/000sLvNA3ao5gD.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105303963.mp3","seconds":266,"singerid":4538,
         * "singername":"阿鲁阿卓","songid":105303963,"songname":"西风 (《芈月传》电视剧片尾曲)","url":"http://ws
         * .stream.qqmusic.qq.com/105303963.m4a?fromtag=46"},{"albumid":1274037,
         * "albummid":"0004bLsF3qYjnu","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/n/u/0004bLsF3qYjnu.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/n/u/0004bLsF3qYjnu.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105509351.mp3","singerid":167494,"singername":"和汇慧","songid":105509351,
         * "songname":"爱 (《搭错车》电视剧插曲)","url":"http://ws.stream.qqmusic.qq.com/105509351
         * .m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq.com/104917343.mp3",
         * "songid":104917343,"songname":"I'll Be Back (《北上广不相信眼泪》电视剧片头曲)","url":"http://ws
         * .stream.qqmusic.qq.com/104917343.m4a?fromtag=46"},{"albumid":1276273,
         * "albummid":"003gioeE0R5RXV","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/X/V/003gioeE0R5RXV.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/X/V/003gioeE0R5RXV.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105527711.mp3","singername":"孙楠","songid":105527711,"songname":"一起奔放
         * (《青蛙王国之冰冻大冒险》动画电影主题曲)","url":"http://ws.stream.qqmusic.qq.com/105527711
         * .m4a?fromtag=46"},{"albumid":1275319,"albummid":"000f72cL25vX0C",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/0/C/000f72cL25vX0C.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/0/C/000f72cL25vX0C.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105519313.mp3","singerid":12744,
         * "singername":"小沈阳","songid":105519313,"songname":"多难","url":"http://ws.stream.qqmusic
         * .qq.com/105519313.m4a?fromtag=46"},{"albumid":1220151,"albummid":"001DtWLr1I6Hwb",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/w/b/001DtWLr1I6Hwb.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/w/b/001DtWLr1I6Hwb.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105091516.mp3","singerid":4293,
         * "singername":"陈坤","songid":105091516,"songname":"寻龙诀 (《寻龙诀》电影主题曲)","url":"http://ws
         * .stream.qqmusic.qq.com/105091516.m4a?fromtag=46"},{"albumid":1246649,
         * "albummid":"001KgAXI2djoEC","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/E/C/001KgAXI2djoEC.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/E/C/001KgAXI2djoEC.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105305531.mp3","singerid":28227,"singername":"马旭东","songid":105305531,
         * "songname":"假装怀念","url":"http://ws.stream.qqmusic.qq.com/105305531.m4a?fromtag=46"},
         * {"albumid":1276049,"albummid":"003atDBO2GDAFB","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/F/B/003atDBO2GDAFB.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/F/B/003atDBO2GDAFB.jpg","downUrl":"http://tsmusic24.tc.qq
         * .com/105525241.mp3","singerid":22855,"singername":"阿悄","songid":105525241,
         * "songname":"气质少女 (《哎哟青春期》电影主题曲)","url":"http://ws.stream.qqmusic.qq.com/105525241
         * .m4a?fromtag=46"},{"albumid":1220169,"albummid":"0022Yd8X1Eo4CE",
         * "albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/C/E/0022Yd8X1Eo4CE.jpg",
         * "albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/C/E/0022Yd8X1Eo4CE.jpg",
         * "downUrl":"http://tsmusic24.tc.qq.com/105146700.mp3","singerid":6104,
         * "singername":"陈思思","songid":105146700,"songname":"满月 (《芈月传》电视剧片头曲)","url":"http://ws
         * .stream.qqmusic.qq.com/105146700.m4a?fromtag=46"},{"albumid":1281224,
         * "albummid":"002OJYfq1f7VnI","albumpic_big":"http://i.gtimg
         * .cn/music/photo/mid_album_300/n/I/002OJYfq1f7VnI.jpg","albumpic_small":"http://i.gtimg
         * .cn/music/photo/mid_album_90/n/I/002OJYfq1f7VnI.jpg","downUrl":"http://tsmusic24.tc.qq.com/104115604.mp3","seconds":262,"singerid":1016429,"singername":"S.I.N.G 女团","songid":104115604,"songname":"听见夏至","url":"http://ws.stream.qqmusic.qq.com/104115604.m4a?fromtag=46"},{"albumid":1281457,"albummid":"000Y5VAR4cfvEb","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/E/b/000Y5VAR4cfvEb.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/E/b/000Y5VAR4cfvEb.jpg","downUrl":"http://tsmusic24.tc.qq.com/105570326.mp3","seconds":224,"singerid":4423,"singername":"华语群星","songid":105570326,"songname":"新年到","url":"http://ws.stream.qqmusic.qq.com/105570326.m4a?fromtag=46"},{"albumid":1275856,"albummid":"000oDjP40IJob5","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/b/5/000oDjP40IJob5.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/b/5/000oDjP40IJob5.jpg","downUrl":"http://tsmusic24.tc.qq.com/105523598.mp3","singerid":28634,"singername":"单色凌","songid":105523598,"songname":"两座城市都下雨","url":"http://ws.stream.qqmusic.qq.com/105523598.m4a?fromtag=46"},{"albumid":1212338,"albummid":"002Edpgx2yorFV","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/F/V/002Edpgx2yorFV.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/F/V/002Edpgx2yorFV.jpg","downUrl":"http://tsmusic24.tc.qq.com/105036859.mp3","seconds":246,"singerid":61981,"singername":"李代沫","songid":105036859,"songname":"谢谢你","url":"http://ws.stream.qqmusic.qq.com/105036859.m4a?fromtag=46"},{"downUrl":"http://tsmusic24.tc.qq.com/105039745.mp3","seconds":217,"songid":105039745,"songname":"在每一个街角想起你","url":"http://ws.stream.qqmusic.qq.com/105039745.m4a?fromtag=46"},{"albumid":1211503,"albummid":"002TlGtr1Vxhan","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/a/n/002TlGtr1Vxhan.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/a/n/002TlGtr1Vxhan.jpg","downUrl":"http://tsmusic24.tc.qq.com/105029289.mp3","singerid":23800,"singername":"夏婉安","songid":105029289,"songname":"独角戏","url":"http://ws.stream.qqmusic.qq.com/105029289.m4a?fromtag=46"},{"albumid":1207562,"albummid":"003016Ev4aiqg4","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/g/4/003016Ev4aiqg4.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/g/4/003016Ev4aiqg4.jpg","downUrl":"http://tsmusic24.tc.qq.com/105090482.mp3","singerid":22704,"singername":"徐良","songid":105090482,"songname":"华生","url":"http://ws.stream.qqmusic.qq.com/105090482.m4a?fromtag=46"},{"albumid":1258396,"albummid":"002QO0eL1OwPdt","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/d/t/002QO0eL1OwPdt.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/d/t/002QO0eL1OwPdt.jpg","downUrl":"http://tsmusic24.tc.qq.com/105394974.mp3","seconds":318,"songid":105394974,"songname":"有情世间 (《恶棍天使》电影主题曲)","url":"http://ws.stream.qqmusic.qq.com/105394974.m4a?fromtag=46"},{"albumid":1208537,"albummid":"0033qUNg3dyZal","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/a/l/0033qUNg3dyZal.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/a/l/0033qUNg3dyZal.jpg","downUrl":"http://tsmusic24.tc.qq.com/105006095.mp3","singerid":4604,"singername":"汪峰","songid":105006095,"songname":"亲爱的 今夜你在哪里","url":"http://ws.stream.qqmusic.qq.com/105006095.m4a?fromtag=46"},{"albumid":1277319,"albummid":"002SW2511Zk6tG","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/t/G/002SW2511Zk6tG.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/t/G/002SW2511Zk6tG.jpg","downUrl":"http://tsmusic24.tc.qq.com/105536892.mp3","seconds":208,"singerid":12721,"singername":"郝云","songid":105536892,"songname":"姥姥说 (《年兽大作战》电影片头曲)","url":"http://ws.stream.qqmusic.qq.com/105536892.m4a?fromtag=46"},{"albumid":1280283,"albummid":"0045UWxy300fbT","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/b/T/0045UWxy300fbT.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/b/T/0045UWxy300fbT.jpg","downUrl":"http://tsmusic24.tc.qq.com/105559514.mp3","seconds":258,"singerid":19722,"singername":"冷漠","songid":105559514,"songname":"冰水情歌","url":"http://ws.stream.qqmusic.qq.com/105559514.m4a?fromtag=46"}]
         */

        private PagebeanEntity pagebean;
        private int ret_code;

        public void setPagebean(PagebeanEntity pagebean) {
            this.pagebean = pagebean;
        }

        public void setRet_code(int ret_code) {
            this.ret_code = ret_code;
        }

        public PagebeanEntity getPagebean() {
            return pagebean;
        }

        public int getRet_code() {
            return ret_code;
        }

        public static class PagebeanEntity {
            private int cur_song_num;
            private int currentPage;
            private int song_begin;
            /**
             * albumid : 1276189
             * albummid : 001fi1zG0EjU2u
             * albumpic_big : http://i.gtimg.cn/music/photo/mid_album_300/2/u/001fi1zG0EjU2u.jpg
             * albumpic_small : http://i.gtimg.cn/music/photo/mid_album_90/2/u/001fi1zG0EjU2u.jpg
             * downUrl : http://tsmusic24.tc.qq.com/105526949.mp3
             * seconds : 284
             * singerid : 60505
             * singername : 李荣浩
             * songid : 105526949
             * songname : 爸爸妈妈
             * url : http://ws.stream.qqmusic.qq.com/105526949.m4a?fromtag=46
             */

            private List<SonglistEntity> songlist;

            public void setCur_song_num(int cur_song_num) {
                this.cur_song_num = cur_song_num;
            }

            public void setCurrentPage(int currentPage) {
                this.currentPage = currentPage;
            }

            public void setSong_begin(int song_begin) {
                this.song_begin = song_begin;
            }

            public void setSonglist(List<SonglistEntity> songlist) {
                this.songlist = songlist;
            }

            public int getCur_song_num() {
                return cur_song_num;
            }

            public int getCurrentPage() {
                return currentPage;
            }

            public int getSong_begin() {
                return song_begin;
            }

            public List<SonglistEntity> getSonglist() {
                return songlist;
            }

            public static class SonglistEntity implements Serializable{
                private int albumid;
                private String albummid;
                private String albumpic_big;
                private String albumpic_small;
                private String downUrl;
                private int seconds;
                private int singerid;
                private String singername;
                private int songid;
                private String songname;
                private String url;

                public void setAlbumid(int albumid) {
                    this.albumid = albumid;
                }

                public void setAlbummid(String albummid) {
                    this.albummid = albummid;
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

                public void setSeconds(int seconds) {
                    this.seconds = seconds;
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

                public void setUrl(String url) {
                    this.url = url;
                }

                public int getAlbumid() {
                    return albumid;
                }

                public String getAlbummid() {
                    return albummid;
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

                public int getSeconds() {
                    return seconds;
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

                public String getUrl() {
                    return url;
                }
            }
        }
    }
}
