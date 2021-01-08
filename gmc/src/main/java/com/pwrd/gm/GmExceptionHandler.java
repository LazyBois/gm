package com.pwrd.gm;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author wangtong
 */
@RestControllerAdvice
public class GmExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ModelAndView sqlException(Exception e) {
        ModelAndView result = new ModelAndView();
        result.addObject("exceptionMsg", e.getMessage());
        result.setViewName("exception");
        e.printStackTrace();
        return result;
    }
}
