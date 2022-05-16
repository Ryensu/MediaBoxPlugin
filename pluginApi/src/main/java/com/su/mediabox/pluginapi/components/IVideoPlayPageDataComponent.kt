package com.su.mediabox.pluginapi.components

import com.su.mediabox.pluginapi.data.VideoPlayMedia

/**
 * 视频播放页面数据组件
 */
interface IVideoPlayPageDataComponent : IBasePageDataComponent {

    /**
     * 获取弹幕数据，包括弹幕地址和发送弹幕参数。显示弹幕需重写此方法，否则无需重写
     *
     * @return Pair<弹幕地址,弹幕参数>
     */
    suspend fun getDanmakuData(episodeUrl: String): Pair<String, Map<String, String>?>? = null

    /**
     * 发送一条弹幕，如果需要登陆等验证需要自行实现逻辑
     *
     * @return 发送结果
     */
    suspend fun putDanmaku(danmaku: String): Boolean

    /**
     * 获取播放页面相关数据
     */
    suspend fun getVideoPlayMedia(episodeUrl: String): VideoPlayMedia

}