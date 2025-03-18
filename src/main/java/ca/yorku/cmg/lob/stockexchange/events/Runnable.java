package ca.yorku.cmg.lob.stockexchange.events;

import ca.yorku.cmg.lob.stockexchange.tradingagent.INewsObserver;

public interface Runnable {
	void registerObserver(INewsObserver observer);
    void removeObserver(INewsObserver observer);
    void notifyObservers();

}
