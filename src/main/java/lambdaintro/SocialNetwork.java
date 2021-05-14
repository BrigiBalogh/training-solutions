package lambdaintro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class SocialNetwork {

    private List<Member> members = new ArrayList<>();


    public SocialNetwork(List<Member> members) {
        this.members = members;
    }

    public List<Member>  findMembersBy( Predicate<Member> memberPredicate) {
        List<Member> filtered = new ArrayList<>();
        for (Member member : members) {
            if (memberPredicate.test(member)) {
                filtered.add(member);
            }
        }
        return filtered;
    }


    public void applyToSelectedMembers(Predicate<Member> pred, Consumer<Member> consumer) {
        for (Member member : members) {
            if (pred.test(member)) {
                consumer.accept(member);
            }
        }
    }




   public <T> List<T> transformMembers(Function<Member, T> func) {
        List<T>transformed = new ArrayList<>();
        for (Member member : members) {
            transformed.add(func.apply(member));
        }
        return transformed;
    }
}
