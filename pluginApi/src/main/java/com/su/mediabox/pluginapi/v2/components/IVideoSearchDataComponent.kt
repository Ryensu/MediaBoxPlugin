package com.su.mediabox.pluginapi.v2.components

import com.su.mediabox.pluginapi.components.IBaseComponent
import com.su.mediabox.pluginapi.v2.been.VideoLinearItemData

/**
 * 获取视频搜索数据组件
 */
interface IVideoSearchDataComponent : IBaseComponent {
    /**
     * 获取搜索结果数据
     *
     * @param keyWord  搜索关键词
     * @param page 页码，由宿主控制（成功请求+1）
     *
     * @return 只允许使用[VideoLinearItemData]以规范化
     */
    suspend fun getSearchData(
        keyWord: String,
        page: Int
    ): List<VideoLinearItemData>

}