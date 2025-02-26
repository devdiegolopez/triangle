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
        ResponseDto mensaje = new ResponseDto(requestDto);
        if (aValue != bValue && aValue != cValue) {
            mensaje = mensaje.setMessage("Escaleno");
            return mensaje;
        }
        if (aValue == bValue && aValue != cValue || aValue == cValue && aValue != bValue) {
            mensaje = mensaje.setMessage("Isosceles");
            return mensaje;
        }
        return mensaje;
    }
}