package repository.base;

import dto.BaseGenericDto;

import java.io.Serializable;
import java.util.List;

/**
 * @author Doston Bokhodirov, Fri 2:36 AM. 2/4/2022
 */

/**
 *
 * @param <D> dto
 * @param <K> primary key
 */
public interface GenericRepository<D extends BaseGenericDto, K extends Serializable> {
    D get(K id);

    List<D> getAll();
}
