package uz.pdp.task1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.task1.entity.Outcome;

public interface OutcomeRepo extends JpaRepository<Outcome, Integer> {
}
