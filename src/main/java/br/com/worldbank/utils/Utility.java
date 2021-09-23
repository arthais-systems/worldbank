package br.com.worldbank.utils;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.enterprise.context.Dependent;

import com.google.gson.Gson;

import br.com.worldbank.ViewModel.Data;
import br.com.worldbank.ViewModel.ObjectReturn;

@Dependent
public class Utility {

    public String ConnectionGET(URL urlForGetRequest) throws IOException {

        String readLine = null;
        HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
        conection.setRequestMethod("GET");
        int responseCode = conection.getResponseCode();

        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(conection.getInputStream()));
            StringBuffer response = new StringBuffer();
            while ((readLine = in.readLine()) != null) {
                response.append(readLine);
            }
            in.close();

            return response.toString();
        }

        return null;
    }

    public List<Data> ConvertGsonToDataViewModel(String returnApi) {
        List<ObjectReturn> _object = new ArrayList<ObjectReturn>();
        final Gson gson = new Gson();

        _object = gson.fromJson(returnApi, _object.getClass());
        var valueDataJson = gson.fromJson(returnApi, _object.getClass()).get(1);
        var arrayvalueDataJson = Arrays.asList(valueDataJson).get(0);

        var jsonvalueDataJson = gson.toJson(arrayvalueDataJson);
        var objectvalueDataJson = gson.fromJson(jsonvalueDataJson, Data[].class);
        var _objectvalueDataJson =  Arrays.asList(objectvalueDataJson);


        List<Data> list = new ArrayList<Data>();

        for (Data dataViewModel : _objectvalueDataJson) {
            list.add(dataViewModel);
        }

        Collections.sort(list, Comparator.comparing(Data::getDate));

        return list;

    }

}