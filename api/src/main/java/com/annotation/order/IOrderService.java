package com.annotation.order;

import com.annotation.base.DoRequest;
import com.annotation.base.DoResponse;

/**
 * Created by xh.zhi on 2018-11-16.
 * 订单接口：服务提供者暴露的接口
 */
public interface IOrderService {

    /**
     * 下订单
     * @param requestParam
     * @return
     */
    DoResponse doOrder(DoRequest requestParam);
}
