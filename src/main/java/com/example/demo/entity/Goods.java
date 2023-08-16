package com.example.demo.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Goods {
	private Integer goods_id;
	private String name;
	private Integer genre_id;
	private Integer initial_price;
	private Date start_time;
	private Date end_time;
	private Integer image_number;
	private String comment;
}