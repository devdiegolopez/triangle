package org.acme.domain.ports;
import org.acme.domain.data.dto.request.RequestDto;

public interface TraingleServicePort {
    String triangleEval(RequestDto requestDto);
}
