package app;

import java.util.List;

public interface OfferService extends AppService<Offer>{
    List<Offer> findAllByProductName(String offerList);
}
