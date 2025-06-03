package com.converter.services;

import com.converter.http.ExchangeApiClient;
import com.converter.models.CurrencyConvertedModel;
import com.google.gson.JsonParser;
import com.google.gson.JsonObject;

public class CurrencyConverterImpl implements CurrencyConverter{
    private final ExchangeApiClient apiClient = new ExchangeApiClient();
    private final String API_KEY = "965ec121dd5edfdf69168b9b"; // reemplaza con tu clave real

    @Override
    public CurrencyConvertedModel convert(String base, String destiny, double amount) {
        try {
            String url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/" + base + "/" + destiny + "/" + amount;
            String response = apiClient.doRequest(url);

            JsonObject json = JsonParser.parseString(response).getAsJsonObject();

            // Verificar respuesta exitosa
            if (!json.has("result") || !json.get("result").getAsString().equals("success")) {
                System.out.println("❌ API respondió con error.");
                return new CurrencyConvertedModel(base, destiny, amount, -1.0);
            }

            // Validar el resultado
            if (!json.has("conversion_result") || !json.get("conversion_result").isJsonPrimitive()) {
                System.out.println("❌ Resultado de conversión inválido.");
                return new CurrencyConvertedModel(base, destiny, amount, -1.0);
            }

            double result = json.get("conversion_result").getAsDouble();
            return new CurrencyConvertedModel(base, destiny, amount, result);

        } catch (Exception e) {
            System.out.println("Error al convertir monedas: " + e.getMessage());
            return new CurrencyConvertedModel(base, destiny, amount, -1.0);
        }
    }

}
