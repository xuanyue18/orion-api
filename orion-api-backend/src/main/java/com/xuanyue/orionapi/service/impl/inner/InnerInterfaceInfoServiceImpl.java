package com.xuanyue.orionapi.service.impl.inner;

import com.xuanyue.orionapi.service.InterfaceInfoService;
import com.xuanyue.orionapicommon.model.entity.InterfaceInfo;
import com.xuanyue.orionapicommon.service.InnerInterfaceInfoService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
* @author xuanyue_18
*/
@DubboService
public class InnerInterfaceInfoServiceImpl implements InnerInterfaceInfoService {

    @Resource
    private InterfaceInfoService interfaceInfoService;

    @Override
    public InterfaceInfo getInterfaceInfo(String path, String method) {
        return interfaceInfoService.query()
                .eq("url", path)
                .eq("method", method)
                .one();
    }
}




