package org.rh.uxd.threescale;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class ApiDetail {
    private String id;
    private String Name;

    // constructors
    public ApiDetail() {}

    public ApiDetail(String id) {
        this.id = id;
    }

    // accessor methods
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String apiName) {
        this.Name = apiName;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return this.Name;
    }

}