package com.bit.service;

import com.bit.dto.BitDemoDTO;

import java.util.List;

public interface BitDemoService {
    public void bitDemoInsert(BitDemoDTO dto);
    public List<BitDemoDTO> selectBitDemo();
}
