package cl.posqr.posqr.controller;

import cl.posqr.posqr.model.Code;
import cl.posqr.posqr.service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.invoke.MethodType;
import java.util.List;

@RestController
@RequestMapping(path = "/v1/qr")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class PosQrController {

    @Autowired CodeService codeService;

    @GetMapping("/getAllCode")
    public ResponseEntity<List<Code>> getAllCode(){
       return new ResponseEntity<>(codeService.getAll(), HttpStatus.ACCEPTED);

    }
}

