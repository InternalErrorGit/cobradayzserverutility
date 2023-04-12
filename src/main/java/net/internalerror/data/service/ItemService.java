package net.internalerror.data.service;

import java.util.Optional;
import net.internalerror.data.entity.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    private final ItemRepository repository;

    public ItemService(ItemRepository repository) {
        this.repository = repository;
    }

    public Optional<Item> get(Long id) {
        return repository.findById(id);
    }

    public Item update(Item entity) {
        return repository.save(entity);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Page<Item> list(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Page<Item> list(Pageable pageable, Specification<Item> filter) {
        return repository.findAll(filter, pageable);
    }

    public int count() {
        return (int) repository.count();
    }

}
