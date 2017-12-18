## Src2Tmpl
DSL test project for Damascus source to template converter

### How to compile ANTLR file
Run ```gradle clean``` and ```gradle generateGrammarSource```. It will generate the new lexer and parser from ```*.g4``` file.

### How to test the grammer is correctly conformed
Run ```gradle clean test```

### How to build language
You need to repeat try and error through the process. Here is a tip of how to iterate the process
1. Navigate to a directory where ```*.g4``` is placed and compile it with ```antlr4 DmscSrcLexer.g4 ; antlr4 DmscSrcParser.g4 ; javac Dms*.java```. Listeners and Visitors will be generated at the same directory.
2. Create the target file to be compiled, say ```test.txt```. Save a code including DSL tags. (Say ```<dmsc:root id="test" />``` or ```<dmsc:sync id="test"> any texts here </dmsc:sync>```)
3. Confirm the lexer / parser correctly compile the target file with the following command, ```grun DmscSrc document -tokens test.txt``` the ``` file``` should be the root element in the ```*.g4```. So please replace it appropriately to your environment if you want to change the grammar for your requirements.