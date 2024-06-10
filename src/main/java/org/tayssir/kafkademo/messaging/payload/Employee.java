package org.tayssir.kafkademo.messaging.payload;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Employee {
    private int id;
    private String name;
    private String position;

}
