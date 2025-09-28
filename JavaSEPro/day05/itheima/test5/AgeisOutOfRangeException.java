package com.itheima.test5;

/**
 * @Author:gy
 * @Date: 2025/08/21 16:58
 * @Description:
 */
public class AgeisOutOfRangeException extends RuntimeException{
    public AgeisOutOfRangeException() {
    }

    public AgeisOutOfRangeException(String message) {
        super(message);
    }
}
