package com.ecofoo.test.index.controller;

import com.ecofoo.test.index.controller.dto.DocumentDto;
import com.ecofoo.test.index.controller.dto.ItineraryDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
@Slf4j
public class IndexController {
    @GetMapping("/")
    public ModelAndView defaultView() {
        log.info("Entrando a index ===>");
        return new ModelAndView("index");
    }

    @PostMapping("/all-documents")
    @ResponseBody
    public List<DocumentDto> allDocuments() {
        return Arrays.asList(createDocument("doc1", "endorse1"), createDocument("doc2", "endorse2"));
    }

    private DocumentDto createDocument(final String doc, final String endorsement) {
        return DocumentDto.builder()
                                .fileName(doc)
                                .endorsement(endorsement)
                            .build();
    }

    @PostMapping("/all-itinerary")
    @ResponseBody
    public List<ItineraryDto> allItinerary() {
//        throw new UnsupportedOperationException("Excepción forzada");
        return Arrays.asList(ItineraryDto.builder().route("Ruta 1").build());
    }
}
