public class SubscriptionFactory {
    public Subscription getSubscription(String subsriptionName){
        if (subsriptionName.equals("Basic")){
            return new BasicSubsription();
        }if (subsriptionName.equals("Gold")){
            return new GoldSubscirption();
        }if (subsriptionName.equals("Platinum")){
            return new PlatinumSubscription();
        }else{
            return null;
        }
    }
}
