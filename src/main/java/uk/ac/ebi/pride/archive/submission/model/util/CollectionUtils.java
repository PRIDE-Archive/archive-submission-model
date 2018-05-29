package uk.ac.ebi.pride.archive.submission.model.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * NOTE: this class is copied here to reduce the size of the dependency
 *
 * @author Rui Wang
 * @version $Id$
 */
public final class CollectionUtils {
  private CollectionUtils() {}

  public static <T> List<T> createListFromList(Collection<T> collection) {
    List<T> newList = new ArrayList<T>();

    if (collection != null) {
      newList.addAll(collection);
    }

    return newList;
  }

  public static <T> void replaceValuesInCollection(Collection<T> from, Collection<T> to) {
    to.clear();
    if (from != null) {
      to.addAll(from);
    }
  }
}
