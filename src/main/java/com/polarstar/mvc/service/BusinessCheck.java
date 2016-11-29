package com.polarstar.mvc.service;

import com.polarstar.enums.BusinessTypeEnum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by zhangxuegang on 2016/11/29.
 */
public class BusinessCheck {

    boolean checkBusiness(Long venderId, BusinessTypeEnum businessTypeEnum){
        return batchCheckBusiness(venderId, Arrays.asList(businessTypeEnum)).get(businessTypeEnum);
    }

    private HashMap<BusinessTypeEnum, Boolean> batchCheckBusiness(Long venderId, List<BusinessTypeEnum> businessTypeEna) {
        return null;
    }


}
