MarkdownParse.class: MarkdownParse.java
    javac MarkdownParse.java
run: MarkdownParse.class
    java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest
MarkdownParseTest.class: MarkdownParseTest.java
    javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java
test: MarkdownParse.class
    javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParse.java
    
