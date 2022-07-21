package cl.posqr.posqr.service.impl;

import cl.posqr.posqr.mock.CodeMock;
import cl.posqr.posqr.model.Code;
import cl.posqr.posqr.service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeServiceImpl implements CodeService {

  @Autowired CodeMock codeMock;

  @Override
  public List<Code> getAll() {
        return codeMock.getAllCode();
    }
}
