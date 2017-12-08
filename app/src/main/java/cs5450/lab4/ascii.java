package cs5450.lab4;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

/**
 * Created by wcs on 12/8/17.
 */

public class ascii extends ItemsFragment {
    public ascii() {}
    @Override

    public Query getQuery(DatabaseReference databaseReference) {
        Query publicQuery = databaseReference.child("ascii-public").limitToFirst(100);
        return publicQuery;
    }
}
