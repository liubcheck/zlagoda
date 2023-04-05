package helsinki.dao;

import helsinki.model.Check;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public interface CheckDao extends BasicDao<Check, String> {
    List<Check> getAllChecksByPeriod(LocalDateTime from, LocalDateTime to);

    BigDecimal getTotalSumByCashierAndPeriod(String employeeId,
                                             LocalDateTime from, LocalDateTime to);

    BigDecimal getTotalSumByPeriod(LocalDateTime from, LocalDateTime to);

    Integer getTotalAmountByProductAndPeriod(String productId,
                                             LocalDateTime from, LocalDateTime to);
}
