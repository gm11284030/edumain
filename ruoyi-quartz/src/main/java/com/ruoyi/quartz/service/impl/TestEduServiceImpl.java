package com.ruoyi.quartz.service.impl;

import com.ruoyi.quartz.domain.TestEdu;
import com.ruoyi.quartz.mapper.ITestEduDao;
import com.ruoyi.quartz.service.ITestEduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class TestEduServiceImpl implements ITestEduService {

    @Autowired
    ITestEduDao testEduDao;

    @Override
    public int insertInfo(Map<String, String> req) {
        String reqInfo = req.get("reqInfo");
        String resultInfo = req.get("resultInfo");
        TestEdu testEdu = new TestEdu();
        testEdu.setReqInfo(reqInfo);
        testEdu.setResultInfo(resultInfo);
        return testEduDao.insert(testEdu);
    }
}
