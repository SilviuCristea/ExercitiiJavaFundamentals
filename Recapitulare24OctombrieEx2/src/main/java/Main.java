public class Main {
    public static void main(String[] args) {

        /*Sa se modeleze un plan de abonamente la o revista IT.
                Putem avea urmatoarele tipuri:
        - basic costa 1 EUR si primeste revista tiparita acasa
        - gold costa 5 EUR primeste revista tiparita acasa si acces la varianta online
        - platinum costa 7 EUR primeste revista tiparita acasa, acces la varianta online pt inca 2 prieteni*/


        SubscriptionFactory subscriptionFactory = new SubscriptionFactory();

        BasicSubsription basicSubsription = (BasicSubsription) subscriptionFactory.getSubscription("Basic");
        System.out.println("Ati ales optiunea Basic. "+basicSubsription.getPrice());

        GoldSubscrption goldSubscrption = (GoldSubscrption) subscriptionFactory.getSubscription("Gold");
        System.out.println("Ati ales optiunea Gold. "+goldSubscrption.getPrice());

        PlatinumSubseiption platinumSubseiption = (PlatinumSubseiption) subscriptionFactory.getSubscription("Platinum");
        System.out.println("Ati ales optiunea Platinum. "+platinumSubseiption.getPrice());


    }
}
