public class Option {
    public static void options(){
        SubscriptionFactory subscriptionFactory = new SubscriptionFactory();

        //Utilizatorul selecteaza Gold

        Subscription subscription = subscriptionFactory.getSubscription("Gold");
        System.out.println(subscription.getPrice());

        //Utilizatorul selecteaza Platinum
        //Creem un obiect subscription pentru a nu modifica in toate clasele in cazul in care oferta Platinum nu mai e valabila

        Subscription subscription1 = subscriptionFactory.getSubscription("Platinum");
        System.out.println(subscription1.getPrice());

        Subscription subscription2 = subscriptionFactory.getSubscription("Basic");
        System.out.println(subscription2.getPrice());

        /*BasicSubsription basicSubsription = (BasicSubsription) subscriptionFactory.getSubscription("Basic");
        System.out.println("Ati ales optiunea Basic. "+basicSubsription.getPrice());

        GoldSubscirption goldSubscirption = (GoldSubscirption) subscriptionFactory.getSubscription("Gold");
        System.out.println("Ati ales optiunea Gold. "+goldSubscirption.getPrice());

        PlatinumSubscription platinumSubscription = (PlatinumSubscription) subscriptionFactory.getSubscription("Platinum");
        System.out.println("Ati ales optiunea Platinum. "+platinumSubscription.getPrice());*/
    }
}
