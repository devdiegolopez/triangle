package org.acme.services;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.domain.data.dto.request.RequestDto;
import org.acme.domain.data.dto.response.ResponseDto;
import org.acme.domain.ports.TraingleServicePort;

@ApplicationScoped
public class TriangleService implements TraingleServicePort {
    @Override
    public ResponseDto triangleEval(RequestDto requestDto) {
        int aValue = requestDto.getaSide();
        int bValue = requestDto.getbSide();
        int cValue = requestDto.getcSide();
        String mensaje = "Es equilatero";
        ResponseDto responseDto = new ResponseDto(mensaje);
        if (aValue != bValue && aValue != cValue) {
            mensaje = "Escaleno";
            return new ResponseDto(mensaje);
        }
        if (aValue == bValue && aValue != cValue || aValue == cValue && aValue != bValue) {
            mensaje = "Isosceles";
            return new ResponseDto(mensaje);
        }
        return new ResponseDto(mensaje);
    }
}
