package com.mtl.cypw.ticket.exception.fetch;

import com.mtl.cypw.common.enums.ErrorCode;
import com.mtl.cypw.ticket.exception.FetchBizException;

/**
 * @author Johnathon.Yuan
 * @date 2019-02-17 14:17
 */
public class FetchMethodNotSupportedException extends FetchBizException {

    public FetchMethodNotSupportedException(String message) {
        super(message);
    }

    public FetchMethodNotSupportedException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public int getCode() {
        return ErrorCode.ERROR_TICKET_FETCH_NOT_SUPPORTED.getCode();
    }
}
