package com.converter.models;

public record CurrencyConvertedModel
        (String base,
         String destiny,
         double amount,
         double result) {
}
