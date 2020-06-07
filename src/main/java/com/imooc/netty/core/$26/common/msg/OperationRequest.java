package com.imooc.netty.core.$26.common.msg;

import com.imooc.netty.core.$26.common.protocol.MahjongRequest;
import lombok.Data;

@Data
public class OperationRequest implements MahjongRequest {
    private int sequence;
    private int operation;
    private byte[] cards;
}