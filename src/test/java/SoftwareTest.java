import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoftwareTest {
    DeveloperQA devQA;
    DeveloperBackEnd devBackEnd;
    DeveloperFrontEnd devFrontEnd;
    DeveloperRequisitos requisitos;

    @BeforeEach
    void setUp(){
        devQA = new DeveloperQA(null);
        devBackEnd = new DeveloperBackEnd(devQA);
        devFrontEnd = new DeveloperFrontEnd(devBackEnd);
        requisitos = new DeveloperRequisitos(devFrontEnd);
    }

    @Test
    void deveRetornarRequisitosParaAnaliseDeRequisitos(){
        assertEquals("Requisitos", requisitos.prosseguirSoftware(new Software(TipoSoftwareAnaliseRequisitos.getTipoSoftwareAnaliseRequisitos())));
    }

    @Test
    void deveRetornarBackEndParaTipoBackEnd(){
        assertEquals("Back-End", requisitos.prosseguirSoftware(new Software(TipoSoftwareBackEnd.getTipoSoftwareBackEnd())));
    }

    @Test
    void deveRetornarFrontEndParaTipoFrontEnd(){
        assertEquals("Front-End", requisitos.prosseguirSoftware(new Software(TipoSoftwareFrontEnd.getTipoSoftwareFrontEnd())));
    }

    @Test
    void deveRetornarQAParaTipoQA(){
        assertEquals("QA", requisitos.prosseguirSoftware(new Software(TipoSoftwareQA.getTipoSoftwareQA())));
    }

}