package rocks.zipcode.io.quiz4.generics;


import java.util.Collections;

/**
 * @author leon on 18/12/2018.
 */
//public class SortedGroup<_> extends Group<_> {
public class SortedGroup<_ extends Comparable<_>> extends Group<_> {



    @Override
    public void insert(_ value) {

        super.insert(value);
        Collections.sort(this.list);
    }

    @Override
    public void delete(_ value) {
        super.delete(value);
    }

    public Integer indexOf(_ value) {
        Collections.sort(this.list);
        return super.list.indexOf(value);
    }


}
