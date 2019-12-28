/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;
import java.net.URLEncoder;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import org.json.simple.*;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author carlo
 */
public class API_Manager {
String url= "https://amazon-price1.p.rapidapi.com/search";
String charset = "UTF-8";
String x_rapidapi_host = "amazon-price1.p.rapidapi.com";
 String x_rapidapi_key= "a2e1fb8cc1msh43223b3f37858c1p1daa25jsn3805e9e254f5";
public String generateResponse(String busqueda) throws UnsupportedEncodingException, UnirestException
{
    String query = String.format("s=%s",
    URLEncoder.encode(busqueda, this.charset));
    HttpResponse<String> response = Unirest.get("https://amazon-price1.p.rapidapi.com/search?keywords="+query+"&marketplace=US")
	.header("x-rapidapi-host", x_rapidapi_host)
	.header("x-rapidapi-key", x_rapidapi_key)
	.asString();

    Object obj=JSONValue.parse(response.getBody().toString());
    JSONArray finalResult=(JSONArray)obj;
    for(int i=0;i<finalResult.size();i++)
    {
        System.out.println(finalResult.get(i));
    }
    return "a" ;
}
  public static void main( String[] args ) throws Exception
  {
      API_Manager asd=new API_Manager();
      String hola=asd.generateResponse("Ryzen r5 3600");
  }
  
  }

