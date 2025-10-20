
package com.example.dao;

import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImpl2 implements IDao {
    @Override
    public double getValue() {
        System.out.println(">> DaoImpl2 utilisé"); // debug message as requested
        return 150.0;
    }
}
