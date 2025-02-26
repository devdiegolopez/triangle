package org.acme.services;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.domain.data.dto.request.RequestDto;
import org.acme.domain.data.dto.response.ResponseDto;
import org.acme.domain.ports.TraingleServicePort;

@ApplicationScoped
public class TriangleService implements TraingleServicePort {
    @Override
    public String triangleEval(RequestDto requestDto) {
        int aValue = requestDto.getaSide();
        int bValue = requestDto.getbSide();
        int cValue = requestDto.getcSide();
        if (aValue == bValue && bValue == cValue) {
            return "Equilatero";
        }
        if (aValue != bValue && aValue != cValue) {
            return "Escaleno";
        }
        else
            return "Isosceles";
    }
}
