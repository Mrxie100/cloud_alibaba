package com.alibaba.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: xiehonyu
 * @Date: 2020/8/28 0028 14:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WaterDTO {
    private String number;
    private String deviceSN;
    private String time;
}
