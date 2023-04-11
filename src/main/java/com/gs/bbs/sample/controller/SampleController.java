package com.gs.bbs.sample.controller;

import com.gs.bbs.sample.service.SampleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@RequestMapping(value = "/sample")
@Tag(name = "Sample", description = "샘플 api")
public class SampleController {

    @Autowired
    SampleService sampleService;

    @Operation(summary = "샘플조회", description = "샘플조회 메서드입니다.")
    @GetMapping
    public Map<String, Object> getSample(){

        return sampleService.getSample();
    }
}
