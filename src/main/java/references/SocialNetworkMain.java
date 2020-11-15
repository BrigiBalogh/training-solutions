package references;

import references.socialnetwork.SocialNetwork;

public class SocialNetworkMain
{
    public static void main(String[] args) {
        SocialNetwork socialNetwork = new SocialNetwork();
        socialNetwork.addMember("Joe");
        socialNetwork.addMember("John");
        socialNetwork.addMember("Jane");
        socialNetwork.addMember("Richard");

        System.out.println(socialNetwork);
        socialNetwork.connect("Joe", "John");
        System.out.println(socialNetwork);
        socialNetwork.connect("John", "Joe");
        System.out.println(socialNetwork);

        System.out.println(socialNetwork.bidirectionalConnections());
    }
}
