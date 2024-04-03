package genericsMatrix;

import java.math.BigDecimal;

public class BigDecimalMatrix extends GenericMatrix<BigDecimal>{

    @Override
    protected BigDecimal add(BigDecimal o1, BigDecimal o2){
        return o1.add(o2);
    }

    @Override
    protected  BigDecimal multiply(BigDecimal o1, BigDecimal o2){
        return o1.multiply(o2);
    }

    @Override
    protected BigDecimal zero(){
        return BigDecimal.ZERO;
    }

}
