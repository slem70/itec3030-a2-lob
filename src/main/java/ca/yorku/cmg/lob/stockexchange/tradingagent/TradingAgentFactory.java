package ca.yorku.cmg.lob.stockexchange.tradingagent;

import ca.yorku.cmg.lob.stockexchange.StockExchange;
import ca.yorku.cmg.lob.stockexchange.events.Event;
import ca.yorku.cmg.lob.stockexchange.events.NewsBoard;
import ca.yorku.cmg.lob.trader.Trader;
import ca.yorku.cmg.lob.stockexchange.tradingagent.ITradingStrategy;

public class TradingAgentFactory extends AbstractTradingAgentFactory implements ITradingStrategy {

@Override
public TradingAgent createAgent(String type, String style, Trader t, StockExchange e, NewsBoard n) {
    TradingAgent agent = null;
    ITradingStrategy strategy = null;

    //Create correct TradingAgent (Institutional or Retail)
    if ("Institutional".equalsIgnoreCase(type)) {
        agent = new TradingAgentInstitutional(t, e, n, strategy);
    } else if ("Retail".equalsIgnoreCase(type)) {
        agent = new TradingAgentRetail(t, e, n, strategy);
    } else {
        throw new IllegalArgumentException("Unknown agent type: " + type);
    }

    //Create style Trading Strategy (Aggressive or Conservative)
    if ("Aggressive".equalsIgnoreCase(style)) {
        strategy = new AggressiveTradingStrategy(agent);
    } else if ("Conservative".equalsIgnoreCase(style)) {
        strategy = new ConservativeTradingStrategy(agent);
    } else {
        throw new IllegalArgumentException("Unknown trading style: " + style);
    }

    agent.setTradingStrategy(strategy);
    return agent;
}
@Override
public void actOnEvent(Event e, int pos, int price) {
    throw new UnsupportedOperationException("Unimplemented method 'actOnEvent'");
}
}

