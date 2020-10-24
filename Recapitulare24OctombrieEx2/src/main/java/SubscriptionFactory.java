public class SubscriptionFactory {
    public Subscription getSubscription(String subsriptionName){
        if (subsriptionName.equals("Basic")){
            return new BasicSubsription();
        }if (subsriptionName.equals("Gold")){
            return new GoldSubscrption();
        }if (subsriptionName.equals("Platinum")){
            return new PlatinumSubseiption();
        }else{
            return null;
        }
    }
}
