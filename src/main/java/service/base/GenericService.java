package service.base;

import dto.GenericDto;
import response.Data;
import response.ResponseEntity;

import java.io.Serializable;
import java.util.List;

/**
 * @author Doston Bokhodirov, Fri 3:36 PM. 2/4/2022
 */

/**
 *
 * @param <D> dto
 * @param <K> primary key
 */
public interface GenericService<D extends GenericDto, K extends Serializable> {

    ResponseEntity<Data<D>> get(K id);

    ResponseEntity<Data<List<D>>> getAll();

}
