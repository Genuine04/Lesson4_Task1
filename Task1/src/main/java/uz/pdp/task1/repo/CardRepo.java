package uz.pdp.task1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.task1.entity.Card;

public interface CardRepo extends JpaRepository<Card, Integer> {
}
