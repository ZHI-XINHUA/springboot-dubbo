package com.springboot.service;


import com.annotation.base.DoRequest;
import com.annotation.base.DoResponse;
import com.annotation.order.IOrderService;
import org.springframework.stereotype.Service;

/**
 * 本地存根
 */
@Service
public class DefaultOrderServiceSub implements IOrderService {
    private final IOrderService iOrderService;

    public  DefaultOrderServiceSub(IOrderService orderService){
        super();
        this.iOrderService = orderService;
    }
    @Override
    public DoResponse doOrder(DoRequest requestParam) {
        System.out.println("DefaultOrderServiceSub>>>>>本处存根处理");
        // 此代码在客户端执行, 你可以在客户端做ThreadLocal本地缓存，或预先验证参数是否合法，等等
        try {
            return iOrderService.doOrder(requestParam);
        } catch (Exception e) {
            // 你可以容错，可以做任何AOP拦截事项
            //return "容错数据";
            return  null;
        }
    }
}
