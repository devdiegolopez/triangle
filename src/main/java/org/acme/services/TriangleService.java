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
        String mensaje = "Es equilatero";
        if (aValue != bValue && aValue != cValue) {
            mensaje = "Escaleno";
            return mensaje;
        }
        if (aValue == bValue && aValue != cValue || aValue == cValue && aValue != bValue) {
            mensaje = "Isosceles";
            return mensaje;
        }
        return mensaje;
    }
}
