package factorypractice.lab;

/**
 *
 * @author jlombardo
 */
public class TipService {
    private TipCalculator tipCalculator;
    
    public TipService(TipCalcTypes f, ServiceQuality sq, double d){
        tipCalculator = TipCalculatorFactory.getTipCalcOfType(f, sq, d);
    }
    
    public TipService(TipCalculator tipCalculator) {
        this.tipCalculator = tipCalculator;
    }
    
    public double getTip() {
        return tipCalculator.getTip();
    }
}
