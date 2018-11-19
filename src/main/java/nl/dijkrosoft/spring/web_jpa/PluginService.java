package nl.dijkrosoft.spring.web_jpa;

import nl.dijkrosoft.spring.web_jpa.entity.plugin.Plugin;
import nl.dijkrosoft.spring.web_jpa.entity.plugin.PluginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PluginService {

    @Autowired
    PluginRepository pluginRepository;

    @GetMapping("/plugins")
    public List<Plugin> getPlugins() {

        final Iterable<Plugin> all = pluginRepository.findAll();

        List<Plugin> allPlugins = new ArrayList<>();

        all.forEach(allPlugins::add);

        return allPlugins;

    }
}
