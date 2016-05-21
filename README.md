public class PostJson {

	public static void main(String[] args) {
		
		HttpClient httpClient = HttpClientBuilder.create().build();
		try {
	        HttpPost request = new HttpPost("http://yoururl");
	        StringEntity params =new StringEntity("details={\"name\":\"myname\",\"age\":\"20\"} ");
	        request.addHeader("content-type", "application/json");
	        request.setEntity(params);
	        HttpResponse response = httpClient.execute(request);

	   
	    }catch (Exception ex) {
	        
	    }finally {
	        httpClient.getConnectionManager().shutdown(); 
	    }

	}

}
