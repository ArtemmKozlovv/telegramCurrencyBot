package by.kozlov.service;

import by.kozlov.entity.Currency;
import by.kozlov.service.impl.NbrbCurrencyConversionService;

public interface CurrencyConversionService {

  static CurrencyConversionService getInstance() {
    return new NbrbCurrencyConversionService();
  }

  double getConversionRatio(Currency original, Currency target);
}
