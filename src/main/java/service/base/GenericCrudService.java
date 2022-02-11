package service.base;

import dto.BaseGenericDto;
import dto.GenericDto;
import response.Data;
import response.ResponseEntity;

import java.io.Serializable;

/**
 * @author Doston Bokhodirov, Fri 2:55 PM. 2/4/2022
 */

/**
 *
 * @param <D> dto
 * @param <CD> create dto
 * @param <UD> update dto
 * @param <K> primary key
 */
public interface GenericCrudService<
        D extends GenericDto,
        CD extends BaseGenericDto,
        UD extends GenericDto,
        K extends Serializable> extends GenericService<D, K> {

    ResponseEntity<Data<K>> create(CD dto);

    ResponseEntity<Data<Boolean>> update(UD dto);

    ResponseEntity<Data<Boolean>> delete(K id);
}
