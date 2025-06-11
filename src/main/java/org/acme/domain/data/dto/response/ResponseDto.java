package org.acme.domain.data.dto.response;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ResponseDto that = (ResponseDto) o;
        return Objects.equals(res, that.res);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(res);
    }
}
     