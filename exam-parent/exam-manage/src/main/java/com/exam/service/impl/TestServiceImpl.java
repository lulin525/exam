package com.exam.service.impl;

import com.exam.mapper.TestMapper;
import com.exam.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;
}
