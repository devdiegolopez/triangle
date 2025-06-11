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
        String triangles = String.valueOf(aValue != bValue && aValue != cValue?new ResponseDto("Escaleniiio"):aValue == bValue && aValue != cValue || aValue == cValue && aValue != bValue?new ResponseDto("isoceles"):new ResponseDto(mensaje));
        return new ResponseDto(triangles);
    }
}
