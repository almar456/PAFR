/**
 * 
 */
/**
 * @author Almar
 *
 */
module pafr {
    requires transitive javafx.controls;
    requires transitive javafx.base;
    requires transitive javafx.graphics;
	requires transitive javafx.fxml;
	requires transitive java.sql;
    exports domain;
    exports controllers;
    opens controllers;
}