package com.liferay.damascus.antlr.generator;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Template Context
 *
 * @author Yasuyuki Takeo
 */
public class TemplateContext {

    public TemplateContext() {
        rootAttributes = new ConcurrentHashMap<>();
        syncAttributes = new ConcurrentHashMap<>();
        contentsIdMap = new ConcurrentHashMap<>();
        rootTagExist = false;
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

    @Getter
    @Setter
    protected boolean rootTagExist;

    /**
     * Attribute keys
     */
    static public final String ATTR_ID = "id";
    static public final String ATTR_VERSION = "version";
    static public final String ATTR_TEMPLATE_DIR = "templateDir";
    static public final String ATTR_TEMPLATE_NAME = "templateName";

}
