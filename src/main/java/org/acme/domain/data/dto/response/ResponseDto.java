package org.acme.domain.data.dto.response;

import org.acme.domain.data.dto.request.RequestDto;

public class ResponseDto {
    RequestDto requestDto;
    public ResponseDto(RequestDto requestDto) {
        this.requestDto = requestDto;
    }
    public RequestDto getRequestDto() {
        return requestDto;
    }

    public void setRequestDto(RequestDto requestDto) {
        this.requestDto = requestDto;
    }

    @Override
    public String toString() {
        return "ResponseDto{" +
                "requestDto=" + requestDto +
                '}';
    }
}
