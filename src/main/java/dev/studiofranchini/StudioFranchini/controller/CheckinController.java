package dev.studiofranchini.StudioFranchini;

import org.springframework.web.bind.annotation.GetMapping;        //(Estes impots são das annotations feitas abaixo usando @ )
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



    @RestController //( Quer dizer que esta classe recebe requisições HTTP e retorna respostas.)
    @RequestMapping (value = "/checkins") //(Cria a rota desejada, neste caso foi a /checkins)
    public class CheckinController { //(diz que a class é pública e pode ser acessada por qualquer outra classe)

        @GetMapping //( Da um GET na rota feita pela requisição RequestMapping)
        public String buscar() {      //(retorna uma informação no formado String)
            return "1° rota ( /checkins ) esta funcionando"; //(Este Retorno é o teste, no Postman ou direto no navegador
                                                        // no "http://localhost:8080/checkins"
        }
    }

