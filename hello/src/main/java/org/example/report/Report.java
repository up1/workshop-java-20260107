package org.example.report;


public abstract class Report {

    abstract String generateHeader();
    abstract String generateBody();
    abstract String generateFooter();

    void process(){
        generateHeader();
        generateBody();
        generateFooter();
    }

}
