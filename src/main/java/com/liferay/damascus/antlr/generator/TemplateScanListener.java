package com.liferay.damascus.antlr.generator;

import com.liferay.damascus.antlr.common.DmscSrcParserExListener;
import com.liferay.damascus.antlr.template.DmscSrcParser;
import com.liferay.damascus.antlr.template.DmscSrcParser.AttributeContext;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * Template Scan Listener
 * <p/>
 * Scanning a target template file to correct replace contents for template generator
 *
 * @author Yasuyuki Takeo
 */
@Slf4j
public class TemplateScanListener extends DmscSrcParserExListener {

    /**
     * Constructor
     */
    public TemplateScanListener() {
        targetTemplateContext = new TemplateContext();
    }

    /**
     * Get Sync Start element
     */
    @Override
    public void exitSyncelementStart(DmscSrcParser.SyncelementStartContext ctx) {
        List<AttributeContext> attributes = ctx.attribute();
        for (AttributeContext attribute : attributes) {
            if (ID.equals(attribute.Name().getText())) {

                currentId = stripQuotations(attribute.STRING().getText());

                targetTemplateContext.setSyncAttribute(currentId, "");
                return;
            }
        }
    }

    @Override
    public void exitSyncelementEnd(DmscSrcParser.SyncelementEndContext ctx) {
        currentId = "";
    }

    /**
     * Get text data between sync tag
     */
    @Override
    public void exitSavedata(DmscSrcParser.SavedataContext ctx) {
        if (log.isDebugEnabled()) {
            log.debug("ID <" + currentId + ">");
            log.debug("Text <<< " + ctx.getText() + ">>>");
        }
        targetTemplateContext.setSyncAttribute(currentId, ctx.getText());
    }


    protected String currentId = "";

    @Getter
    protected TemplateContext targetTemplateContext;
}
