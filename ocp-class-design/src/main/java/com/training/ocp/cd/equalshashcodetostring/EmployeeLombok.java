package com.training.ocp.cd.equalshashcodetostring;

import lombok.Data;

/**
 * That annotation <code>@Data</code> is shortcut for
 * <code>@ToString, @EqualsAndHashCode, @Getter</code> on all fields,
 * <code>@Setter</code> on all non-final fields, and
 * <code>@RequiredArgsConstructor</code>
 * 
 * @author Pavel Šeda
 *
 */
@Data
public class EmployeeLombok {

	private String name;
	private int salary;

}
