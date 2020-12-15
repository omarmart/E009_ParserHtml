package com.omar;

import java.util.List;
import java.util.Map;

public class Node {
    private String tag;
    private Map<String, String> properties;
    private List<Node> content;

    public Node(String tag) {
        this.tag = tag;
    }

    public Node(String tag, Map<String, String> properties) {
        this.tag = tag;
        this.properties = properties;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    public List<Node> getContent() {
        return content;
    }

    public void setContent(List<Node> content) {
        this.content = content;
    }
}
