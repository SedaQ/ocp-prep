package com.training.ocp.recap.buildingblocks;

import java.sql.*;
import java.util.Date;

/**
 * 
 * E.g., when we want to class which is in different packages then it is
 * necessary to specify from which package this class is.
 * 
 * @author Pavel Seda
 *
 */
public class ImportsNamingConflict {

	private java.util.Date dateUtil;
	private java.sql.Date dateSQL;
}
