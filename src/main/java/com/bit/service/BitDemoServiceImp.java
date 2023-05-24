package com.bit.service;

import com.bit.dao.BitDemoDao;
import com.bit.dto.BitDemoDTO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BitDemoServiceImp implements BitDemoService {
    @Resource(name="bitDemoDaoImp")
    private BitDemoDao dao;

    @Override
    public void bitDemoInsert(BitDemoDTO dto) {
        dao.bitDemoInsert(dto);
    }

    @Override
    public List<BitDemoDTO> selectBitDemo() {
        return dao.selectBitDemo();
    }
}
