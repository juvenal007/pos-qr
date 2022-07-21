package cl.posqr.posqr.mock;

import cl.posqr.posqr.model.Code;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class CodeMock {

    public List<Code> getAllCode(){
        List<Code> listCode = new ArrayList<>();
        Code code = new Code("código_1", "activo");
        listCode.add(code);
        return listCode;
    }

}
