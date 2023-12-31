package ai.turintech.catalog.repository;

import ai.turintech.catalog.domain.CategoricalParameterValue;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Spring Data R2DBC repository for the CategoricalParameterValue entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CategoricalParameterValueRepository
    extends ReactiveCrudRepository<CategoricalParameterValue, Long>, CategoricalParameterValueRepositoryInternal {
    @Override
    <S extends CategoricalParameterValue> Mono<S> save(S entity);

    @Override
    Flux<CategoricalParameterValue> findAll();

    @Override
    Mono<CategoricalParameterValue> findById(Long id);

    @Override
    Mono<Void> deleteById(Long id);
}

interface CategoricalParameterValueRepositoryInternal {
    <S extends CategoricalParameterValue> Mono<S> save(S entity);

    Flux<CategoricalParameterValue> findAllBy(Pageable pageable);

    Flux<CategoricalParameterValue> findAll();

    Mono<CategoricalParameterValue> findById(Long id);
    // this is not supported at the moment because of https://github.com/jhipster/generator-jhipster/issues/18269
    // Flux<CategoricalParameterValue> findAllBy(Pageable pageable, Criteria criteria);
}
