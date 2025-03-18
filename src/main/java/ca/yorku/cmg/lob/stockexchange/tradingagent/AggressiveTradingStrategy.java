package ca.yorku.cmg.lob.stockexchange.tradingagent;

import ca.yorku.cmg.lob.stockexchange.events.Event;

public class AggressiveTradingStrategy implements ITradingStrategy{

    private TradingAgent agent;

    public AggressiveTradingStrategy(TradingAgent agent) {
        this.agent = agent;
    }

    @Override
    public void actOnEvent(Event e, int pos, int price) {
        throw new UnsupportedOperationException("Unimplemented method actOnEvent");
    }

}
