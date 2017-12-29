package com.liferay.damascus.antlr.common

import com.liferay.damascus.antlr.generator.TemplateContext
import spock.lang.Specification
import spock.lang.Unroll

import java.util.concurrent.ConcurrentHashMap

class TemplateGeneratorUtilTest extends Specification {

    @Unroll("rootValidator test")
    def "rootValidator test"() {
        when:
        def tc = Spy(TemplateContext, constructorArgs: [])
        Map<String, String> rootAttributes = new ConcurrentHashMap<>();
        attributes.each { k, v ->
            rootAttributes.put(k, v);
        }
        tc.getRootAttributes() >> rootAttributes
        List<String> result = TemplateGeneratorUtil.rootValidator(tc)

        then:
        result.size == result_size

        where:
        attributes                                               | result_size
        ["id": "hoge", "templateName": "dummy", "version": "70"] | 0
    }

    @Unroll("syncValidator test")
    def "syncValidator test"() {
        when:
        def tc = Spy(TemplateContext, constructorArgs: [])
        Map<String, String> syncAttributes = new ConcurrentHashMap<>();
        attributes.each { k, v ->
            syncAttributes.put(k, v);
        }
        tc.getSyncAttributes() >> syncAttributes
        List<String> result = TemplateGeneratorUtil.syncValidator(tc)

        then:
        result.size == result_size

        where:
        attributes     | result_size
        ["id": "hoge"] | 0
    }
}
