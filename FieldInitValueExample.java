package com.zerock.ex02;

import lombok.extern.log4j.Log4j;

@Log4j

public class FieldInitValueExample {

	public static void main(String[] args) {
		FieldInitValue fiv = new FieldInitValue();
		
		log.info("byteFeild: " + fiv.byteField);
		log.info("shortField: " + fiv.shortField);
		log.info("intField: " + fiv.intField);
		log.info("longField: " + fiv.longField);
		log.info("booleanField: " + fiv.booleanField);
		log.info("charField: " + fiv.charField);
		log.info("floatField: " + fiv.floatField);
		log.info("doubleField: " + fiv.doubleField);
		log.info("arrField: " + fiv.arrField);
		log.info("referenceField: " + fiv.referenceField);
	}
}
