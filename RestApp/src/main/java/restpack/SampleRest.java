package restpack;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;


@Path("/getdata")
public class SampleRest 
{

	 @GET
	    @Path("/{file}")
	    @Produces("text/plain")
	    public String handleDownload(@PathParam("file") final String file) throws Exception 
	 {
	     
		 Calendar cal = Calendar.getInstance();
	        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	
	     return "Data validated from Heroku " + file +" at " +sdf.format(cal.getTime());
	 
	 }
	
	
}
