package com.example.admin.musicplayer.interfaces;

public interface Keys {

    String ITEM_LIST = "itemList";
    String CURRENT_POSITION = "currentPosition";
    String CURRENT_PLAY_MODE = "currentPlayMode";
    String WHAT = "what";

    String Url_Hot="http://route.showapi.com/213-4";
    String Url_Search_Lyric="http://route.showapi.com/213-2";
    String Url_Search_Song="http://route.showapi.com/213-1";

    /**
     * showapi的信息
     */
    String showapi_appid="15869";
    String showapi_sign="5ea357d154694ad1a58d0a8287dd6f6c";

    /**
     * 每次访问网络所要提交的必须字段名
     */

    String SHOWAPI_APPID="showapi_appid";
    String SHOWAPI_SIGN="showapi_sign";
    String SHOWAPI_TIMESTAMP="showapi_timestamp";

}
