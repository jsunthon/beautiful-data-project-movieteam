package edu.csula.datascience.acquisition;

import java.util.Collection;

/**
 * Interface to define collector behavior
 *
 * It should be able to download data from source and save data.
 */
public interface Collector<T, N> {
    Collection<T> mungee(Source<N> src);

    void save(Collection<T> data);
}
