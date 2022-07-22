package com.bank.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
    /**
     *
     * @param req 요청객체
     * @param resp 응답객체
     * @return  forward시킬 jsp 주소
     * @throws Exception
     */
    String handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception;
}
