package helsinki.dao;

import helsinki.model.Check;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public interface CheckDao extends BasicDao<Check, String> {
    Map<String, Object> getAllInfoByNumber(String number);

    List<Check> getAllByToday(String employeeId);

    List<Check> getAllChecksByCashier(String cashierId);

    List<Check> getAllChecksByPeriod(LocalDateTime from, LocalDateTime to);

    List<Check> getAllChecksByCashierAndPeriod(String employeeId,
                                               LocalDateTime from, LocalDateTime to);

    BigDecimal getTotalSumByCashierAndPeriod(String employeeId,
                                             LocalDateTime from, LocalDateTime to);

    BigDecimal getTotalSumByPeriod(LocalDateTime from, LocalDateTime to);

    Integer getTotalAmountByProductAndPeriod(String productId,
                                             LocalDateTime from, LocalDateTime to);
}
