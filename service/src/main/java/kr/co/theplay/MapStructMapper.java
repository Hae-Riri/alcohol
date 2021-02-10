package kr.co.theplay;

//필드명을 통해 D(dto)와 E(entity)를 매핑
public interface MapStructMapper<D, E> {
    E toEntity(D dto);
    D toDto(E entity);
}
