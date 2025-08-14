package br.jus.tream.lontra.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.jus.tream.lontra.domain.DTO.RestClientDTO;
import br.jus.tream.lontra.services.RestClientService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/restclient")
@RequiredArgsConstructor
public class RestClientController {

    private final RestClientService restClientService;

    @GetMapping
    public RestClientDTO findById() {
        return restClientService.getDto();
    }
}
