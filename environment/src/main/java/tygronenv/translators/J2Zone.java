package tygronenv.translators;

import eis.eis2java.exception.TranslationException;
import eis.eis2java.translation.Java2Parameter;
import eis.eis2java.translation.Translator;
import eis.iilang.Function;
import eis.iilang.Identifier;
import eis.iilang.Numeral;
import eis.iilang.Parameter;
import nl.tytech.data.engine.item.Zone;

public class J2Zone implements Java2Parameter<Zone>{

	private final Translator translator = Translator.getInstance();

	@Override
	public Parameter[] translate(Zone z) throws TranslationException {
		return new Parameter[] { new Function("Zone", new Numeral(z.getID()), new Identifier(z.getName()), new Numeral(z.getMaxAllowedFloors()) 
				, new Numeral(size(z))
				, translator.translate2Parameter(z.getAllowedCategories())[0]
				//, new Numeral(FunctionID)
				)};
	}
	
	public double size(Zone z){
		return z.getMultiPolygon().getArea();
	}
	

	@Override
	public Class<? extends Zone> translatesFrom() {
		return Zone.class;
	}
}
