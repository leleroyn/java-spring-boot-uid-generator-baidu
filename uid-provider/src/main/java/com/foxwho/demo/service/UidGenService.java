package com.foxwho.demo.service;

import com.baidu.fsg.uid.UidGenerator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UidGenService {
    @Resource(name = "cachedUidGenerator")
    private UidGenerator cachedUidGenerator;

    @Resource(name = "defaultUidGenerator")
    private UidGenerator defaultUidGenerator;

    public long getUid() {
        return defaultUidGenerator.getUID();
    }

    public long getCachedUid() {
        return cachedUidGenerator.getUID();
    }
}
