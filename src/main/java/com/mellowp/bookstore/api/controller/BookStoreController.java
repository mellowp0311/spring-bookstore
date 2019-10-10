package com.mellowp.bookstore.api.controller;


import com.google.common.collect.ImmutableMap;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(tags = "/v1 Book API")
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
@ApiResponses(value = { @ApiResponse(code = 404, message = "Not Found"),
                        @ApiResponse(code = 500, message = "Internal Server Error") })
public class BookStoreController {


    @GetMapping("/v1/book/list")
    @ApiOperation(value = "도서 목록 조회", response = List.class, notes = "/v1 도서 목록 조회")
    public List<Map<String, String>> searchBookList(){
        return Arrays.asList(
                ImmutableMap.<String, String>builder().put("title", "Book 01").put("author", "Lion").build(),
                ImmutableMap.<String, String>builder().put("title", "Book 02").put("author", "Lion").build(),
                ImmutableMap.<String, String>builder().put("title", "Book 03").put("author", "Lion").build()
        );
    }

    @GetMapping("/v1/book/info")
    @ApiOperation(value = "도서 상세 조회", response = Map.class, notes = "/v1 도서 상세 조회")
    public Map<String, String> searchBookInfo(@RequestParam(value = "num") String num){
        return null;
    }

    @PostMapping("/v1/book/create")
    @ApiOperation(value = "도서 등록", response = Boolean.class, notes = "/v1 도서 등록")
    public Boolean createBook(){
        return true;
    }

    @PutMapping("/v1/book/modify")
    @ApiOperation(value = "도서 정보 수정", response = Boolean.class, notes = "/v1 도서 정보 수젇")
    public Boolean modifyBook(){
        return true;
    }

    @DeleteMapping("/v1/book/remove")
    @ApiOperation(value = "도서 정보 삭제", response = Boolean.class, notes = "/v1 도서 정보 삭제")
    public Boolean removeBook(){
        return true;
    }

}
