open module web.jpa {
    requires spring.beans;
    requires spring.web;

    requires java.sql;
    requires spring.data.commons;
    requires java.persistence;
    requires spring.boot;
    requires spring.boot.autoconfigure;

    exports nl.dijkrosoft.spring.web_jpa to javassist;
    exports nl.dijkrosoft.spring.web_jpa.entity.person to javassist;
    exports nl.dijkrosoft.spring.web_jpa.entity.plugin to javassist;

}