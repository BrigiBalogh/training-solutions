package week14d03;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UserFilters {



  public UserFilter createFilter(List<Predicate<User>> predicates) {


      /* return users ->  {
            Iterator<User> userIterator = users.iterator();
            while (userIterator.hasNext()) {
                User user = userIterator.next();
                boolean shouldRemove = false;
                for (Predicate<User> userPredicate : predicates ) {
                    if(!userPredicate.test(user)) {
                        shouldRemove = true;
                    }
                }
                if(shouldRemove) {
                    userIterator.remove();
                }
            }
            return users;
        };
    }*/

    return users -> users.stream().
            filter(predicates.stream().reduce(a -> true, Predicate::and))
            .collect(Collectors.toList());
  }
}
