package concurrency;

/*
Having variables specific to a thread is called ThreadLocal. Often used to resolve Data Integrate issues.
use case 1: to achieve memory efficiency and thread-safety
use case 2: Per thread context

InheritableThreadLocal is a subclass of ThreadLocal, which grants access to values to a thread and all child
threads created by that thread.

Tips:
Cleanup once out of scope
Use local variables instead of ThreadLocal, if could.
Delegate to frameworks whenever possible, let the framework handle the thread-safety.
 */

import java.text.SimpleDateFormat;
import java.util.Date;

class ThreadSafeFormatter{
    public static ThreadLocal<SimpleDateFormat> df = ThreadLocal.withInitial(()->
            new SimpleDateFormat("yyyy-MM-dd"));
}

public class ThreadLocalJ {
    public String birthDate(int userId){
        Date birthDate = new birthDateFromDB(userId);
        final SimpleDateFormat df = ThreadSafeFormatter.df.get();
        return df.format(birthDate);
    }
    public static void main(String[] args) {
    }
}

// A fictitious class returning DOB based on user id
class birthDateFromDB extends Date{
    int userId;
    public birthDateFromDB(int userId){this.userId = userId;}
}
