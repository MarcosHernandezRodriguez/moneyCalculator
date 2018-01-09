package moneycalculator.persistence;

import moneycalculator.model.Currency;
import moneycalculator.model.ExchangeRate;

/**
 *
 * @author Marcos
 */
public interface ExchangeRateLoader {
    
    ExchangeRate load(Currency from, Currency to);
    
}
