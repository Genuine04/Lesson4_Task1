package uz.pdp.task1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.task1.entity.Income;

public interface IncomeRpo extends JpaRepository<Income, Integer> {
}
