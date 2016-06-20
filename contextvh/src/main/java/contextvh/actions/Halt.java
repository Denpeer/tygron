package contextvh.actions;

import java.util.LinkedList;

import contextvh.ContextEntity;
import eis.eis2java.exception.TranslationException;
import eis.iilang.Numeral;
import eis.iilang.Parameter;
import eis.iilang.Percept;

/**
 * Halts the agent for a given time, or for 1 second.
 * @author Max Groenenboom
 */
public class Halt implements CustomAction {

	private static final int DEFAULT_DELAY = 1000; // milliseconds.

	@Override
	public Percept call(final ContextEntity caller, final LinkedList<Parameter> parameters)
			throws TranslationException {
		long delay = DEFAULT_DELAY;
		if (!parameters.isEmpty()) {
			Parameter param = (Parameter) parameters.getFirst();
			if (param instanceof Numeral) {
				delay = ((Numeral) param).getValue().longValue();
			}
		}
		long endTime = System.currentTimeMillis() + delay;
		long currentTime = 0L;
		do {
			try {
				currentTime = System.currentTimeMillis();
				Thread.sleep(currentTime - endTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while (currentTime > endTime);
		return null;
	}

	@Override
	public String getName() {
		return "halt";
	}

}
