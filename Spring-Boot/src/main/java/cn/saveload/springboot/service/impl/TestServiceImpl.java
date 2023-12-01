package cn.saveload.springboot.service.impl;

import cn.saveload.springboot.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @author shiliang
 * @Classname cn.saveload.springboot.service
 * @Date 2023/11/1 15:57
 * @Description
 */
@Service
public class TestServiceImpl implements TestService {
    public String test() {
        return "test";
    }
}
