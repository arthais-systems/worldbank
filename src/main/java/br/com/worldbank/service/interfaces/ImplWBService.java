package br.com.worldbank.service.interfaces;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import javax.annotation.Resource;

import br.com.worldbank.ViewModel.Data;
import br.com.worldbank.ViewModel.ObjectReturn;

@Resource
public interface ImplWBService {
    
    List<Data> getIndicatorsByCodCountry(String codCountry) throws IOException;

}