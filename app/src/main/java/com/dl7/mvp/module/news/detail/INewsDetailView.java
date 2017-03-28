package com.dl7.mvp.module.news.detail;

import com.dl7.mvp.api.bean.NewsDetailInfo;
import com.dl7.mvp.module.base.IBaseView;

/**
 * Created by qiushengyuon 2016/8/25.
 * 新闻详情接口
 */
@Deprecated
public interface INewsDetailView extends IBaseView {

    /**
     * 显示数据
     * @param newsDetailBean 新闻详情
     */
    void loadData(NewsDetailInfo newsDetailBean);
}
