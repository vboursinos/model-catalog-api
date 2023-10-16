package ai.turintech.catalog.repository;

import ai.turintech.catalog.domain.CategoricalParameter;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Spring Data R2DBC repository for the CategoricalParameter entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CategoricalParameterRepository
    extends ReactiveCrudRepository<CategoricalParameter, Long>, CategoricalParameterRepositoryInternal {
    @Override
    <S extends CategoricalParameter> Mono<S> save(S entity);

    @Override
    Flux<CategoricalParameter> findAll();

    @Override
    Mono<CategoricalParameter> findById(Long id);

    @Override
    Mono<Void> deleteById(Long id);
}

interface CategoricalParameterRepositoryInternal {
    <S extends CategoricalParameter> Mono<S> save(S entity);

    Flux<CategoricalParameter> findAllBy(Pageable pageable);

    Flux<CategoricalParameter> findAll();

    Mono<CategoricalParameter> findById(Long id);
    // this is not supported at the moment because of https://github.com/jhipster/generator-jhipster/issues/18269
    // Flux<CategoricalParameter> findAllBy(Pageable pageable, Criteria criteria);
}
