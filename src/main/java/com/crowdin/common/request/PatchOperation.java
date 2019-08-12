package com.crowdin.common.request;

public class PatchOperation {
    private String op;
    private String path;
    private String from;
    private Object value;

    private PatchOperation() {
    }

    public PatchOperation(String op, String path, Object value) {
        this.op = op;
        this.path = path;
        this.value = value;
    }

    public PatchOperation(String op, String path) {
        this.op = op;
        this.path = path;
    }

    public PatchOperation(String op, String path, String from) {
        this.op = op;
        this.path = path;
        this.from = from;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public PatchOperation(String op, String path, String from, Object value) {
        this.op = op;
        this.path = path;
        this.from = from;
        this.value = value;
    }
}
