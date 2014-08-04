package com.example.XMLtoJson;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import com.google.gson.Gson;
import net.sf.json.JSON;
import net.sf.json.xml.XMLSerializer;
import org.apache.commons.io.IOUtils;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        new WebserviceHelper().execute();
    }


    private class WebserviceHelper extends AsyncTask {

        @Override
        protected Object doInBackground(Object... params) {
            String responce = null;
            try {
                URL uri = new URL("http://devs.purplle.com/feedxml.xml");
                Log.d("test:", "uri:" + uri);
                HttpURLConnection connection = (HttpURLConnection) uri.openConnection();
                Log.d("test:", "connection:" + connection);
                InputStream inputStream = connection.getInputStream();
                Log.d("test:", "IS:" + inputStream);
                responce = IOUtils.toString(inputStream);
//                Log.d("test:", "Responce: " + responce);
            } catch (Exception e) {
                e.printStackTrace();
                Log.d("test:", "Exception: " + e.getMessage());
            }
            return responce;
        }

        @Override
        protected void onPostExecute(Object o) {
            Log.d("test:", "onPostExecute:");
            super.onPostExecute(o);
            String xmlData = (String) o;
            JSON objJson = new XMLSerializer().read(xmlData);
            Log.d("test:", "JsonData:" + objJson);
            Feeds feeds = new Gson().fromJson(objJson.toString(), Feeds.class);
            Log.d("test:", "Feed:" + feeds);
        }
    }

}
