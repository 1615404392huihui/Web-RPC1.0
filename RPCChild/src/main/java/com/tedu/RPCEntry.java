package com.tedu;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class RPCEntry implements Serializable {

    private static final long serialVersionUID = -5108357158845908897L;
    private String packageName;
    private String className;
    private String methodName;

    public Object[] getObject() {
        return object;
    }

    public void setObject(Object[] object) {
        this.object = object;
    }

    private Object[] object;


    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }


}
