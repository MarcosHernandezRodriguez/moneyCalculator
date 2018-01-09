package moneycalculator.persistence;

import moneycalculator.model.Currency;

/**
 *
 * @author Marcos
 */
public interface CurrencyListLoader {

    Currency[] currencies();
    
}
