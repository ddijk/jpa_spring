package nl.dijkrosoft.spring.web_jpa.entity.plugin;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
public class Plugin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
    protected String name;

    @ElementCollection
    @CollectionTable(name="config")
    @MapKeyColumn(name="name")
    @Column(name="value")
    protected Map<String,String> configs = new HashMap<>();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getConfigs() {
        return configs;
    }

    public void setConfigs(Map<String, String> configs) {
        this.configs = configs;
    }
}