package com.liferay.damascus.cli.common;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.RegexFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.commons.lang3.StringUtils;

/**
 * Common Util
 * 
 * This need to be merged into Damascus CommonUtil.
 * 
 * @author yasuflatland
 *
 */
public class CommonUtil {

    /**
     * Fetch files with filter
     * <p>
     * Only fetching files, omitting directories.
     *
     * @param rootPath Root path where starts searching
     * @param patterns Search pattern regular expression list
     * @return a List of found file's File objects
     */
    static public List<File> getTargetFiles(String rootPath, List<String> patterns) {
        String result = String.join("|", patterns);
        return FileUtils.listFiles(
            new File(rootPath),
            new RegexFileFilter("(" + result + ")"),
            TrueFileFilter.INSTANCE
        ).stream().collect(Collectors.toList());
    }
	
	/**
	 * Replace keywords in contents
	 * 
	 * @param contents
	 * @param replacements
	 * @return
	 */
	static public String replaceKeywords(String contents, Map<String, String> replacements) {
		String converted = contents;
		for (Map.Entry<String, String> replacement : replacements.entrySet()) {
			converted = 
				StringUtils.replace(
					converted,
					replacement.getKey(),
					replacement.getValue());
		}
		return converted;
	}	
}
