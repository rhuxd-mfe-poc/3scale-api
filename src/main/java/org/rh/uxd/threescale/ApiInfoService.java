package org.rh.uxd.threescale;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ApiInfoService {
    private static ApiInfoService ourInstance = new ApiInfoService();

    public static ApiInfoService getInstance() {
        return ourInstance;
    }

    // For now just store info in memory.
    private static List<ApiDetail> apiDetailList = new ArrayList<>();

    public String addApiInfo(ApiDetail deets) {
        String newId =  UUID.randomUUID().toString();
        deets.setId(newId);
        apiDetailList.add(deets);
        return newId;
    }

    public String deleteApiInfo(String id) {
        for(ApiDetail deet : apiDetailList) {
            if(deet.getId().equals(id)) {
                apiDetailList.remove(apiDetailList.indexOf(deet));
                return "removed api: " + id;
            }
        }

        return "api " + id + " does not exists";
    }

    public List<ApiDetail> getApiList() {
        return apiDetailList;
    }

    public ApiDetail getApiById(String id) {
        for (ApiDetail deet : apiDetailList) {
            if (deet.getId().equals(id)) {
                return deet;
            }
        }

        return null;
    }
}
