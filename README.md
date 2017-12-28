## Src2Tmpl
DSL test project for Damascus source to template converter

### Instal antlr
Src2Tmpl is using Antlr4, so please install them.
#### For Mac
```brew install antlr```

### How to compile ANTLR file
Run ```gradle clean``` and ```gradle generateGrammarSource```. It will generate the new lexer and parser from ```*.g4``` file.

### How to test the grammer is correctly conformed
Run ```gradle clean test```

### How to build language
You need to repeat try and error through the process. Here is a tip of how to iterate the process
1. Navigate to a directory where ```*.g4``` is placed and compile it with ```antlr4 DmscSrcLexer.g4 ; antlr4 DmscSrcParser.g4 ; javac Dms*.java```. Listeners and Visitors will be generated at the same directory.
2. Create the target file to be compiled, say ```test.txt```. Save a code including DSL tags. (Say ```<dmsc:root id="test" />``` or ```<dmsc:sync id="test"> any texts here </dmsc:sync>```)
3. Confirm the lexer / parser correctly compile the target file with the following command, ```grun DmscSrc document -tokens test.txt``` the ``` file``` should be the root element in the ```*.g4```. So please replace it appropriately to your environment if you want to change the grammar for your requirements.

### How to debug Lexer / Parser
Eclipse's ANTLR plugin works great. Here is the how to use ANTLR plugin with Oxygen (the latest version of Eclipse as of now). With the plugin, check Parser / Lexer process the target files correctly, then you may want to create unit tests against the generated lexer and parser later on for your efficiency of debugging.

#### Install ANTLR plugin
1. On the Eclipse, navigate to Help -> Eclipse Market place and search "Antlr". Install "ANTLR 4 IDE 0.3.6" (the latest version when you install them)
2. It'll take a while and restart Eclipse.
3. Navigate to Window -> Show view -> others -> ANTLR 4
4. Select both ```Parse Tree``` and ```Syntax Diagram```
5. Open ```Parse Tree```
6. Open your parser file, in this Src2Templ, open ```DmscSrcParser.g4```
7. Double click ```file``` rule, then paste text to be parsed in the left pane, ```DmscSrcParser::file```. The parsed block diagram will be displayed on the right pane

#### When you modify Lexer
When you modify Lexer, sometimes ANTLR plugin doesn't recognize the change correctly. Then please try steps below.
1. Run ```gradle generateGrammarSource``` and ```gradle eclipse``` to regenerate parser and lexer, then regenerate eclipse project file.
2. If it still doesn't solve the issue, run ```antlr4 DmscSrcLexer.g4 ; antlr4 DmscSrcParser.g4 ; javac Dms*.java``` at where ```*.g4``` directory (```Src2Tmpl/src/main/antlr```) and copy generated ```*.tokens``` and ```*.interp``` files into the ```/Src2Tmpl/src/main/java/com/liferay/damascus/antlr/template``` directory, and run ```gradle eclipse```, then click ```file``` rule in the ```DmscSrcParser.g4``` to see if the plugin reload the file.
3. You may want to restart Eclipse...
