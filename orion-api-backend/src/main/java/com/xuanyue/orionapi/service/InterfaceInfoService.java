package com.xuanyue.orionapi.service;

import com.xuanyue.orionapicommon.model.dto.interfaceinfo.InterfaceInfoQueryRequest;
import com.xuanyue.orionapicommon.model.dto.interfaceinfo.InterfaceInfoUpdateRequest;
import com.xuanyue.orionapicommon.model.entity.InterfaceInfo;
import com.xuanyue.orionapicommon.model.vo.InterfaceInfoVO;
import com.xuanyue.orionapisdk.client.OrionApiClient;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
 * @author xuanyue_18
 * @description 针对表【interface_info(接口信息)】的数据库操作Service
 * @createDate 2023-06-07 09:37:06
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    /**
     * 校验
     *
     * @param interfaceInfo
     * @param add
     */
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);


    /**
     * 获取查询条件
     *
     * @param interfaceInfoQueryRequest
     * @return
     */
    QueryWrapper<InterfaceInfo> getQueryWrapper(InterfaceInfoQueryRequest interfaceInfoQueryRequest);

    /**
     * 获取接口信息封装
     *
     * @param interfaceInfo
     * @param request
     * @return
     */
    InterfaceInfoVO getInterfaceInfoVO(InterfaceInfo interfaceInfo, HttpServletRequest request);

    /**
     * 分页获取接口信息封装
     *
     * @param interfaceInfoPage
     * @param request
     * @return
     */
    Page<InterfaceInfoVO> getInterfaceInfoVOPage(Page<InterfaceInfo> interfaceInfoPage, HttpServletRequest request);

    /**
     * 创建SDK客户端
     *
     * @param request 当前会话
     * @return SDK客户端
     */
    OrionApiClient getOrionApiClient(HttpServletRequest request);

    /**
     * 修改接口信息
     *
     * @param interfaceInfoUpdateRequest 接口信息修改请求
     * @return 是否成功
     */
    boolean updateInterfaceInfo(InterfaceInfoUpdateRequest interfaceInfoUpdateRequest);

    /**
     * 根据用户ID 分页获取接口信息封装
     *
     * @param interfaceInfoPage 接口信息分页
     * @param request           当前会话
     * @return 接口信息分页
     */
    Page<InterfaceInfoVO> getInterfaceInfoVOByUserIdPage(Page<InterfaceInfo> interfaceInfoPage, HttpServletRequest request);
}
