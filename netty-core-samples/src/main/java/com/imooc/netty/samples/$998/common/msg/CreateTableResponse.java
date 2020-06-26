package com.imooc.netty.samples.$998.common.msg;

import com.imooc.netty.samples.$998.common.domain.Table;
import com.imooc.netty.samples.$998.common.protocol.MahjongResponse;
import lombok.Data;

@Data
public class CreateTableResponse implements MahjongResponse {
    private Table table;
}
