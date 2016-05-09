package chp9.interfaces.interfaceprocessor;

import chp9.interfaces.filters.*;

public class FilterProcessor {
	public static void main(String[] args) {
		Waveform w = new Waveform();
		Apply.process(new FilterAdapter(new LowPass(1.0)), w);
		Apply.process(new FilterAdapter(new HighPass(2.0)), w);
		Apply.process(new FilterAdapter(new BandPass(1.0, 2.0)), w);
	}

}

class FilterAdapter implements Processor {
	Filter filter;
	public FilterAdapter(Filter filter) {
		this.filter = filter;
	}
	public String name() {
		return filter.name();
	}
	public Waveform process(Object input) {
		return filter.process((Waveform)input);
	}
}

class LowPass extends Filter {
	double cutoff;
	public LowPass(double cutoff) {
		this.cutoff = cutoff;
	}
	public Waveform process(Waveform input) {
		return input;
	}
}

class HighPass extends Filter {
	double cutoff;
	public HighPass(double cutoff) {
		this.cutoff = cutoff;
	}
	public Waveform process(Waveform input) {
		return input;
	}
}

class BandPass extends Filter {
	double lowCutoff, highCutoff;
	public BandPass(double lowCut, double highCut) {
		lowCutoff = lowCut;
		highCutoff = highCut;
	}
	public Waveform process(Waveform input) {
		return input;
	}
}