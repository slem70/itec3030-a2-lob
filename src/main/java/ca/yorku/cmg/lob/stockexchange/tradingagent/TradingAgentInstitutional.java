package ca.yorku.cmg.lob.stockexchange.tradingagent;


import ca.yorku.cmg.lob.trader.Trader;
import ca.yorku.cmg.lob.stockexchange.StockExchange;
import ca.yorku.cmg.lob.stockexchange.events.Event;
import ca.yorku.cmg.lob.stockexchange.events.NewsBoard;



public class TradingAgentInstitutional extends TradingAgent {

    public TradingAgentInstitutional(Trader t, StockExchange e, NewsBoard n, ITradingStrategy strategy) {
        super(t, e, n, strategy);
    }



@Override
protected void actOnEvent(Event e, int pos, int price) {
    throw new UnsupportedOperationException("Unimplemented method 'actOnEvent'");
}

}