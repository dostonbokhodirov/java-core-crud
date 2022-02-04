package repository.base;

import dto.BaseGenericDto;
import dto.GenericDto;

import java.io.Serializable;

/**
 * @author Doston Bokhodirov, Fri 2:28 AM. 2/4/2022
 */
public interface GenericCrudRepository<
        D extends BaseGenericDto,
        CD extends BaseGenericDto,
        UD extends GenericDto,
        K extends Serializable> extends GenericRepository<D, K> {
    K create(CD dto);

    Void update(UD dto);

    Void delete(K id);
}
