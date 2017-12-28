package com.liferay.damascus.antlr.generator;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import lombok.Getter;
import lombok.Setter;

/**
 * Template Context
 * 
 * @author Yasuyuki Takeo
 *
 */
public class TemplateContext {

	public TemplateContext() {
		rootAttributes = new ConcurrentHashMap<>();
		syncAttributes = new ConcurrentHashMap<>();
		contentsIdMap = new ConcurrentHashMap<>();
	}

	public void setRootAttribute(String key, String value) {
		rootAttributes.put(key, value);
	}

	public void setSyncAttribute(String key, String value) {
		syncAttributes.put(key, value);
	}

	@Getter
	protected Map<String, String> rootAttributes;

	@Getter
	protected Map<String, String> syncAttributes;

	@Getter
	@Setter
	protected Map<String, String> contentsIdMap;
}
