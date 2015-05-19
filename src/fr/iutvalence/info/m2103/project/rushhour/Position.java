package fr.iutvalence.info.m2103.project.rushhour;
/**
 * allows to know vehicle's position
 * @author BERTHET Mathieu, BARRA Jérémy
 *
 */
public class Position {
	/**
	 * line number
	 */
	private int line_number;

	/**
	 * column number
	 */
	private int column_number;
	
	
	/**
	 * Constructs a new position at the intersection of the line and the column
	 * @param linenumber the line number
	 * @param columnnumber the column number
	 */
	public Position(int linenumber, int columnnumber)
	{
		this.line_number = linenumber;
		this.column_number = columnnumber;
	}
	
	/**
	 * get line number
	 * @return number of line
	 */
	public int getLineNumber()
	{
		return this.line_number;
	}

	/**
	 * get column number
	 * @return number of column
	 */
	public int getColumnNumber()
	{
		return this.column_number;
	}
	
}