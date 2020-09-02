package org.rh.uxd.threescale;

import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("3scale")
@Produces(MediaType.APPLICATION_JSON)
public class ApiInfo extends Application {
    private ApiInfoService infoService = ApiInfoService.getInstance();

    @GET
    public List<ApiDetail> getApiDetails() {
        return infoService.getApiList();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String createApi(ApiDetail newApi) {
        return infoService.addApiInfo(newApi);
    }

    @GET
    @Path("{id}")
    public ApiDetail getApi(@PathParam("id") String id) {
        return infoService.getApiById(id);
    }

    @DELETE
    @Path("{id}")
    public String deleteApi(@PathParam("id") String id) { return infoService.deleteApiInfo(id); }
}
