package com.converter.services;

import com.converter.models.CurrencyConvertedModel;

public interface CurrencyConverter {

    CurrencyConvertedModel convert(String base, String destiny, double amount);


}
