package com.liferay.damascus.antlr.generator;

import com.liferay.damascus.cli.common.CommonUtil;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class SourceToTemplateEngine {

	static public void process(String sourceRootPath) {

		List<String> patterns = CommonUtil.stringToList(EXT_WHITE_LIST);

		List<File> targetFiles = CommonUtil.getTargetFiles(sourceRootPath,patterns);

		for(File target : targetFiles) {

		}
	}

	// White list of searching directory.
	// TODO: This value must be configured in settings.properties under .damascus
	static public final String EXT_WHITE_LIST = "*.java,*.jsp,*.xml,*.bnd,*.gradle,*.properties,*.json,*.jspf";
}
