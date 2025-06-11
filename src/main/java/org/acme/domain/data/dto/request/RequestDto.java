package org.acme.domain.data.dto.request;

import java.util.Objects;

public class RequestDto {
    private int aSide;
    private int bSide;
    private int cSide;

    public RequestDto() {
    }

    public RequestDto(int aSide, int bSide, int cSide) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }

    public int getaSide() {
        return aSide;
    }

    public void setaSide(int aSide) {
        this.aSide = aSide;
    }

    public int getbSide() {
        return bSide;
    }

    public void setbSide(int bSide) {
        this.bSide = bSide;
    }

    public int getcSide() {
        return cSide;
    }

    public void setcSide(int cSide) {
        this.cSide = cSide;
    }

    @Override
    public String toString() {
        return "RequestDto{" +
                "aSide=" + aSide +
                ", bSide=" + bSide +
                ", cSide=" + cSide +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        RequestDto that = (RequestDto) o;
        return aSide == that.aSide && bSide == that.bSide && cSide == that.cSide;
    }

    @Override
    public int hashCode() {
        return Objects.hash(aSide, bSide, cSide);
    }
}
