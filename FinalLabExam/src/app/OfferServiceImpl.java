package app;

import java.util.ArrayList;
import java.util.List;

public class OfferServiceImpl implements OfferService {

    private List<Offer> offerList;

    public OfferServiceImpl(){
        offerList = new ArrayList<>();
    }

    @Override
    public Offer create(Offer offer) {
        if(offer.getCustomer() != null && !offer.getCustomer().isEmpty() &&
                !offer.getProducts().isEmpty()){
            offerList.add(offer);
            return offer;
        } else throw new ValidationFailedException("Offer details are not valid");
    }

    @Override
    public List<Offer> search(String value) {
        List<Offer> offersFound = new ArrayList<>();
        for(Offer offer : offerList){
            if(offer.getCustomer().startsWith(value)){
                offersFound.add(offer);
            }
        }
        return offersFound;
    }

    @Override
    public boolean delete(Offer offer) {
        if(offerList.contains(offer)){
            offerList.remove(offer);
            return true;
        } else throw new OfferNotFoundException("app.Offer to be deleted not found");
    }

    public List<Offer> findAll(){
        return offerList;
    }

    @Override
    public List<Offer> findAllByProductName(String product) {
        List<Offer> offers = new ArrayList<>();
        for(Offer offer : offerList){
            if(checkOfferContainsProduct(offer,product)){
                offers.add(offer);
            }
        }
        return offers;
    }

    private boolean checkOfferContainsProduct(Offer offer, String productName){
        for(Product product1 : offer.getProducts()){
            if(product1.getName().equals(productName)){
                return true;
            }
        }
        return false;
    }


}
