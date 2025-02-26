package org.acme.domain.data.dto.response;

public class ResponseDto {
    String res;

    public ResponseDto(String res) {
        this.res = res;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    @Override
    public String toString() {
        return "ResponseDto{" +
                "res='" + res + '\'' +
                '}';
    }
}
     